package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	
	/**
	 * This method add an integer to the Integer Set if it is already not in it
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
	/**
	 * This method removes an item from the set if the item exists
	 * @param item
	 */
	public void remove(int item) {
		if (set.contains(item) ) {
			set.remove(Integer.valueOf(item));
		}
		
	}
	/**
	 * This method returns true if the two sets are equal
	 */
	public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IntegerSet that = (IntegerSet) o;

        return set.containsAll(that.set) && that.set.containsAll(set);
    }
	/**
	 * This method returns the number of elements in the set
	 * @return length of the set
	 */
	public int length() {
        return set.size();
    }
	/**
	 * This method returns true if the set contains the value
	 * @param value
	 * @return boolean
	 */
	public boolean contains(int value) {
        return set.contains(value);
    }

}
