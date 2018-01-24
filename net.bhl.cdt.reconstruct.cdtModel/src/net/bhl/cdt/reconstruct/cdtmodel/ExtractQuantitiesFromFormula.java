package net.bhl.cdt.reconstruct.cdtmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
	
	public static String filtering_OutputParameter(String latexFormula){
		
		 String[] leftSideFormula = latexFormula.split("=", 2);	 
		 
		 String leftSide = leftSideFormula[0];
		 
		 char[] leftSideCharacters = leftSide.toCharArray();
		 
		 String outputParameter = "";
		     for (int i = 0; i < leftSideCharacters.length; i++) {
		         if (!(leftSideCharacters[i] == '$')) 
		        	 outputParameter += leftSideCharacters[i];
		     }

		 return outputParameter.replaceAll("\\s+","");
		
	}
	
	public static ArrayList<String> filtering_inputParameter(String latexFormula){
		
		String[] rightSideFormula = latexFormula.split("=", 2);	 
		 
		String rightSide = rightSideFormula[1];

		return extractInputQuantities(rightSide);
		
	}
	public static ArrayList<String> extractInputQuantities(String formula){
		
		ArrayList<String> quantitiesArray = new ArrayList<String>();
		
		 for (int i = 0; i < formula.length(); i++){
		        
			 char current_character = formula.charAt(i);
			
			 
			 if(TYPE_CHARACTER == type_analyse(current_character)){

				 if(isSubscript(current_character, i, formula)){
				 	i = checkSubscript(current_character, i, formula, quantitiesArray);
				 }
				 else{
					/**check the redundant quantity*/
					 addQuantties(current_character, quantitiesArray);
				 }
				 
			 }
			 else if(TYPE_BACKSLASH == type_analyse(current_character)){
				 
				 i = checkGreekLetters(current_character, i, formula, quantitiesArray);
				 
			 }
	 
			
		 }
		
		 
		 return quantitiesArray;
		
	}
	private static Boolean isSubscript(char current, int index, String formula){
		
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
	private static int checkGreekLetters(char current, int index, String formula, List<String> quantitiesArray){
		
		StringBuilder greek_letter = new StringBuilder();
		int pivot=index+1;
		if(pivot <= formula.length()){
			
			while(type_analyse(formula.charAt(pivot)) == TYPE_CHARACTER){
				
				greek_letter.append(formula.charAt(pivot));
				pivot++;
				
			}
			
			String letter = greek_letter.toString();
			
			if(isLetterGreek(letter)){
				
				addQuantties(letter, quantitiesArray);
				
			}
		}
		
		return pivot;
		
		
	}
private static int checkSubscript(char current, int index, String formula, List<String> quantitiesArray){
		
		StringBuilder quantity = new StringBuilder();
		int pivot=current;
		int get_next_index = index+1;
		int get_next_next_index = index+2;
		
		if(get_next_index <= formula.length()){
			
			if(type_analyse(formula.charAt(get_next_index)) == TYPE_SUBSCRIPT){
				
				quantity.append(current);
				quantity.append('_');
				
				if(type_analyse(formula.charAt(get_next_next_index)) == TYPE_CURLY_BRACKET){
				
					pivot = get_next_next_index+1;
					while(type_analyse(formula.charAt(pivot)) != TYPE_CURLY_BRACKET){
						
						quantity.append(formula.charAt(pivot));
						pivot++;
						
					}
					
					addQuantties(quantity.toString(), quantitiesArray);
					return pivot;
					
				}
				else{
					
					if(type_analyse(formula.charAt(get_next_next_index)) == TYPE_CONSTANT){
						
						pivot = get_next_next_index;
						while(type_analyse(formula.charAt(pivot)) == TYPE_CONSTANT){
							
							quantity.append(formula.charAt(pivot));
							pivot++;
							
						}
						
						addQuantties(quantity.toString(), quantitiesArray);
						return pivot;
						
						
					}else{
						
						pivot = get_next_next_index;
						quantity.append(formula.charAt(pivot));
						addQuantties(quantity.toString(), quantitiesArray);
						return pivot;
					}
					
					
				}
				
			}else{
				
				return pivot;
			}
			
			
			
		}
		return get_next_index;
	
	}
	private static void addQuantties(char current,List<String> quantitiesArray){
		
		 if(!quantitiesArray.contains(Character.toString(current))){
			 
			 quantitiesArray.add(Character.toString(current));
		 }
		 
		
	}
	private static void addQuantties(String quantity, List<String> quantitiesArray){
		
		 if(!quantitiesArray.contains(quantity)){
			 
			 quantitiesArray.add(quantity);
		 }
		 
		
	}

	private static int type_analyse(char character){
		
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

	private static boolean checkPairParentesis(String str)
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
        	
	}

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
					
		default : isGreekLetter = false;
		
		
		}
		return isGreekLetter;
		
		
		
	}

}
