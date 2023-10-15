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
	 * This method returns true if the set is empty
	 * @return boolean
	 */
	public boolean isEmpty() {
        return set.isEmpty();
    }
	/**
	 * This method returns true if the set contains the value
	 * @param value
	 * @return boolean
	 */
	public boolean contains(int value) {
        return set.contains(value);
    }
	/**
	 * 
	 * @return maximum element
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int max = set.get(0);
        for (int value : set) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
	
	public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int min = set.get(0);
        for (int value : set) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    public void union(IntegerSet intSetb) {
        set.addAll(intSetb.set);
    }

    public void intersect(IntegerSet intSetb) {
        set.retainAll(intSetb.set);
    }

    public void diff(IntegerSet intSetb) {
        set.removeAll(intSetb.set);
    }

    public void complement(IntegerSet intSetb) {
        List<Integer> complement = new ArrayList<>();
        for (int i = Integer.MIN_VALUE; i <= Integer.MAX_VALUE; i++) {
            if (!set.contains(i) && !intSetb.set.contains(i)) {
                complement.add(i);
            }
        }
        set = complement;
    }

}

class IntegerSetException extends Exception {
    public IntegerSetException(String message) {
        super(message);
    }
}
