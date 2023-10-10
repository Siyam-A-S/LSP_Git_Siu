package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * This method add an integer to the Integer Set
	 * @param item
	 */
	public void add(int item) {
		if (!set.contains(item) ) {
			set.add(item);
		}
	}
	/**
	 * A void class which clears out the Integer set
	 */
	public void clear() {
		set.clear();
	}
	/**
	 * This method return the string representation of the Integer set
	 * @return String
	 */
	public String toString() {
		return set.toString();
	}

}
