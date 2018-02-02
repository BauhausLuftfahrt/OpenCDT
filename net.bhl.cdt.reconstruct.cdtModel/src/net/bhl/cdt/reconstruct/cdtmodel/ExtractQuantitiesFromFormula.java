package net.bhl.cdt.reconstruct.cdtmodel;

import java.util.ArrayList;
import java.util.List;

public class ExtractQuantitiesFromFormula {
	
	public static final int TYPE_CHARACTER = 0;
	public static final int TYPE_CONSTANT = 1;
	public static final int TYPE_ROUND_BRACKET = 2;
	public static final int TYPE_CURLY_BRACKET = 3;
	public static final int TYPE_SQUARE_BRACKET = 4;
	public static final int TYPE_BACKSLASH = 5;
	public static final int TYPE_GLUE = 10;
	public static final int TYPE_SUBSCRIPT = 11;
	public static final int TYPE_OTHERS = 127;
	
	/**
	 * The left side of formula is used to generate the output-parameter.
	 * */
	public static String filtering_OutputParameter(String latexFormula){
		
		 
		 String[] leftSideFormula = latexFormula.split("=", 2);	 
		 
		 String leftSide = leftSideFormula[0];
		 
		 char[] leftSideCharacters = leftSide.toCharArray();
		 /**
		  * $-symbols are removed.
		  * */
		 String outputParameter = "";
		 for (int i = 0; i < leftSideCharacters.length; i++) {
			 
		        if(!(leftSideCharacters[i] == '$')) 
		           outputParameter += leftSideCharacters[i];
		 }
		 /**
		  * Empty spaces are removed and returned.
		  * */
		 return outputParameter.replaceAll("\\s+","");
		
	}
	
	/**
	 * The right side of formula is used to generate the input-parameter.
	 * */
	public static ArrayList<String> filtering_inputParameter(String latexFormula){
		
		String[] rightSideFormula = latexFormula.split("=", 2);	 
		 
		String rightSide = rightSideFormula[1];

		return extractInputQuantities(rightSide);
		
	}
	
	/**
	 * Only rational number, alphabet letter and specially the subscripted parameter, Greek alphabet letter, roots operator 
	 * can be extracted from Latex-formula. For other formula and letter it should be extended.
	 * */
	public static ArrayList<String> extractInputQuantities(String formula){
		
		/**
		 * This array will include the strings which are generated as input-parameter.
		 * */ 
		ArrayList<String> quantitiesArray = new ArrayList<String>();
		
		 /**
		  * Every character of right side of formula is interpreted from left to right.
		  * */ 
		 for (int pos = 0; pos < formula.length(); pos++){
		        
			 char current_character = formula.charAt(pos);
			
			 
			 if(TYPE_CHARACTER == type_analyse(current_character)){

				 if(isNextSubscript(current_character, pos, formula)){
					 
					 pos = getLastPositionAndSaveSubscript(current_character, pos, formula, quantitiesArray);
				 }
				 else{
					 
					/**
					 * check the redundant quantity and save it.
					 * */
					 addQuantityWithoutRedundancy(current_character, quantitiesArray);
				 }
				 
			 }
			 else if(TYPE_BACKSLASH == type_analyse(current_character)){
				 
				 pos = getLastPositionAndSaveGreekLetters(current_character, pos, formula, quantitiesArray);
				 
			 }
	 
			
		 }
		
		 
		 return quantitiesArray;
		
	}
	public static int type_analyse(char character){
		
		if (48 <= character && character <= 57) {
			
			return TYPE_CONSTANT;
		}
		else if((character > 64 && character < 91) || (character > 96 && character < 123)){
			
			return TYPE_CHARACTER;
		}
		else if(character == '(' || character == ')'){
			
			return TYPE_ROUND_BRACKET;
		}
		else if(character == '{' || character == '}'){
			
			return TYPE_CURLY_BRACKET;
		}
		else if(character == '\\'){
			
			return TYPE_BACKSLASH;
		}
		else if(character == '+' || character == '-'|| character == '*'){
			
			return TYPE_GLUE;
		}
		else if(character == '_'){
			
			return TYPE_SUBSCRIPT;
		}
		else{
			return TYPE_OTHERS;
			
		}

		
	}
	
	private static Boolean isNextSubscript(char current, int index, String formula){
		
		int get_next_index = index+1;
		if(get_next_index <= formula.length()){
			
			if(type_analyse(formula.charAt(get_next_index)) == TYPE_SUBSCRIPT){
				return true;
				
			}else{
				return false;
			}
			
		}else{
			return false;
		}
	}
	
	private static int getLastPositionAndSaveGreekLetters(char current, int index, String formula, List<String> quantitiesArray){
		
		StringBuilder greek_letter = new StringBuilder();
		int pivot=index+1;
		if(pivot <= formula.length()){
			
			while(type_analyse(formula.charAt(pivot)) == TYPE_CHARACTER){
				
				greek_letter.append(formula.charAt(pivot));
				pivot++;
				
			}
			
			String letter = greek_letter.toString();
			
			if(isLetterGreek(letter)){
				
				addQuantityWithoutRedundancy(letter, quantitiesArray);
				
			}
		}
		
		return pivot-1;
		
		
	}
	
	private static int getLastPositionAndSaveSubscript(char current, int index, String formula, List<String> quantitiesArray){
		
		StringBuilder quantity = new StringBuilder();
		int pivot=current;
		int get_next_index = index+1;
		int get_next_next_index = index+2;
		
		if(get_next_index <= formula.length()){
			
			/**
			 * The next character is checked whether it is the subscript like '_'. 
			 * */
			if(type_analyse(formula.charAt(get_next_index)) == TYPE_SUBSCRIPT){
				
				/**
				 * A subscripted input-parameter is ready to be generated.
				 * */
				quantity.append(current);
				quantity.append('_');
				
				
				/**
				 * The next character after subscript is checked whether it is the curly bracket like '{'. 
				 * */
				if(type_analyse(formula.charAt(get_next_next_index)) == TYPE_CURLY_BRACKET){
				
					pivot = get_next_next_index+1;
					
					/**
					 * The characters are saved until the curly bracket like '}' appears.
					 * */
					while(type_analyse(formula.charAt(pivot)) != TYPE_CURLY_BRACKET){
						
						quantity.append(formula.charAt(pivot));
						pivot++;
						
					}
					
					addQuantityWithoutRedundancy(quantity.toString(), quantitiesArray);
					return pivot;
					
				}
				else{
					
					
					if(type_analyse(formula.charAt(get_next_next_index)) == TYPE_CONSTANT){
						
						/**
						 * The next character of subscript is certain number.
						 * */
						pivot = get_next_next_index;
						while(type_analyse(formula.charAt(pivot)) == TYPE_CONSTANT){
							
							quantity.append(formula.charAt(pivot));
							pivot++;
							
						}
						
						addQuantityWithoutRedundancy(quantity.toString(), quantitiesArray);
						return pivot;
						
						
					}else{
						
						pivot = get_next_next_index;
						quantity.append(formula.charAt(pivot));
						addQuantityWithoutRedundancy(quantity.toString(), quantitiesArray);
						return pivot;
					}
					
					
				}
				
			}
			else{
				
				return pivot;
				
			}
			
			
			
		}
		return get_next_index;
	
	}
	
	private static void addQuantityWithoutRedundancy(char current,List<String> quantitiesArray){
		
		 if(!quantitiesArray.contains(Character.toString(current))){
			 
			 quantitiesArray.add(Character.toString(current));
		 }
		 
		
	}
	
	private static void addQuantityWithoutRedundancy(String quantity, List<String> quantitiesArray){
		
		 if(!quantitiesArray.contains(quantity)){
			 
			 quantitiesArray.add(quantity);
		 }
		 
		
	}

	

	/*private static boolean checkPairParentesis(String str)
	{
	    if (str.isEmpty())
	        return true;
	    
	   
	    Stack<Character> stack = new Stack<Character>();
	    for (int i = 0; i < str.length(); i++)
	    {
	        char current = str.charAt(i);
	        if (current == '{' || current == '(' || current == '[')
	        	
	        {
	            stack.push(current);
	        }


	        if (current == '}' || current == ')' || current == ']')
	        	
	        {
	            if (stack.isEmpty())
	                return false;

	            char last = stack.peek();
	            if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '['){
	            	
	                stack.pop();
	            	
	            }else{
	             
	                return false;
	                }
	        }

	    }

	    return stack.isEmpty();
        	
	}*/

	private static Boolean isLetterGreek(String letter){
		
		Boolean isGreekLetter = false;
		switch(letter){
		
		case "alpha" : 
			isGreekLetter = true;
			break;
		case "beta" : 
			isGreekLetter = true;
			break;
		case "gamma" : 
			isGreekLetter = true;
			break;
		case "delta" : 
			isGreekLetter = true;
			break;
		case "epsilon" : 
			isGreekLetter = true;
			break;
		case "varepsilon" : 
			isGreekLetter = true;
			break;
		case "theta" : 
			isGreekLetter = true;
			break;
		case "vartheta" : 
			isGreekLetter = true;
			break;
		case "phi" : 
			isGreekLetter = true;
			break;
		case "varphi" : 
			isGreekLetter = true;
			break;	
		case "zeta" : 
			isGreekLetter = true;
			break;
		case "eta" : 
			isGreekLetter = true;
			break;
		case "kappa" : 
			isGreekLetter = true;
			break;
		case "lambda" : 
			isGreekLetter = true;
			break;
		case "mu" : 
			isGreekLetter = true;
			break;
		case "nu" : 
			isGreekLetter = true;
			break;
		case "xi" : 
			isGreekLetter = true;
			break;
		case "pi" : 
			isGreekLetter = true;
			break;
		case "varpi" : 
			isGreekLetter = true;
			break;
		case "rho" : 
			isGreekLetter = true;
			break;
		case "varrho" : 
			isGreekLetter = true;
			break;
		case "sigma" : 
			isGreekLetter = true;
			break;
		case "varsigma" : 
			isGreekLetter = true;
			break;
		case "upsilon" : 
			isGreekLetter = true;
			break;
		case "tau" : 
			isGreekLetter = true;
			break;
		case "chi" : 
			isGreekLetter = true;
			break;
		case "psi" : 
			isGreekLetter = true;
			break;
		case "omega" : 
			isGreekLetter = true;
			break;
		case "Omega" : 
			isGreekLetter = true;
			break;
					
		default : isGreekLetter = false;
		
		
		}
		return isGreekLetter;
		
		
		
	}

}
