package net.bhl.cdt.ui.editors.calculation;

import net.bhl.cdt.model.Element;

@SuppressWarnings("rawtypes")
public class NameComparator implements java.util.Comparator
{
	@Override
	public int compare(Object o1, Object o2) {
		String n1 = ((Element) o1).getName();
		String n2 = ((Element) o2).getName();
		return n1.compareToIgnoreCase(n2);
	}
	
}