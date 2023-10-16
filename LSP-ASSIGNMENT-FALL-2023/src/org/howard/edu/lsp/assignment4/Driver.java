package org.howard.edu.lsp.assignment4;
import java.util.ArrayList;


public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		
		// Test Case 1: Default Constructor
        IntegerSet setA = new IntegerSet();
        setA.add(9);

        // Test Case 2: Constructor with initialized set
        ArrayList<Integer> initialSet = new ArrayList<>();
        initialSet.add(1);
        initialSet.add(2);
        initialSet.add(4);
        IntegerSet setB = new IntegerSet(initialSet);
        
        // String representation of the sets defined
        System.out.println("Set A: " + setA.toString());
        System.out.println("Set B: " + setB.toString());
        
        
        // Test Case 3: clear()
        setA.clear();
        System.out.println("Set A after clear(): " + setA); // Should print []

        // Test Case 4: length()
        System.out.println("Length of set B: " + setB.length()); // Should print 3

        // Test Case 5: equals()
        System.out.println("Are setA and setB equal? " + setA.equals(setB)); // Should print false

        // Test Case 6: contains()
        System.out.println("Does setB contain 2? " + setB.contains(2)); // Should print true

        // Test Case 7: largest()
        try {
            System.out.println("Largest element in setB: " + setB.largest()); // Should print 3
        } catch (IntegerSetException e) {
            e.printStackTrace();
        }

        // Test Case 8: smallest()
        try {
            System.out.println("Smallest element in setB: " + setB.smallest()); // Should print 1
        } catch (IntegerSetException e) {
            e.printStackTrace();
        }

        // Test Case 9: add()
        setA.add(1);
        setA.add(6);
        setA.add(3);
        setA.add(3); // Adding a duplicate element
        System.out.println("Set A after adding elements: " + setA); // Should print [1, 2, 3]

        // Test Case 10: remove()
        setA.remove(3);
        System.out.println("Set A after removing 3: " + setA); // Should print [1, 3]

        // Test Case 11: union()
        setA.union(setB);
        System.out.println("Union of setA and setB: " + setA); // Should print [1, 3, 2]

        // Test Case 12: intersect()
        setA.intersect(setB);
        System.out.println("Intersection of setA and setB: " + setA); // Should print [2]

        // Test Case 13: diff()
        setA.diff(setB);
        System.out.println("Set difference (setA - setB): " + setA); // Should print []
       
        // Test Case 14: isEmpty()
        System.out.println("Is setA empty? " + setA.isEmpty()); // Should print true
       
        // Test Case 15: complement()
        
        IntegerSet universalSet = new IntegerSet();
        IntegerSet setC = new IntegerSet();
        setC.add(1);
        setC.add(7);
        for (int i = 1; i <= 10; i++) {
            universalSet.add(i);
        }
     // String representation of the sets defined
        System.out.println("Set C : " + setC.toString());
        System.out.println("Universal set: " + universalSet.toString());
        setC.complement(universalSet);
        System.out.println("Complement of setC in universal set: " + setC); // Should print [2, 3, 4, 5, 6, 8, 9, 10]

     
    }
	}


