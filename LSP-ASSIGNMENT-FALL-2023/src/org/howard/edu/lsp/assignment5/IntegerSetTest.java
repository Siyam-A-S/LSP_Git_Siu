package org.howard.edu.lsp.assignment5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class IntegerSetTest {
    private IntegerSet emptySet;
    private IntegerSet nonEmptySet;
    private IntegerSet universalSet;

    @BeforeEach
    public void setUp() {
        emptySet = new IntegerSet();
        nonEmptySet = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        universalSet = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
    }

    @Test
    @DisplayName("Test case for add")
    public void testAdd() {
        emptySet.add(1);
        assertTrue(emptySet.contains(1));
        assertFalse(emptySet.isEmpty());
    }

    @Test
    @DisplayName("Test case for clear")
    public void testClear() {
        nonEmptySet.clear();
        assertTrue(nonEmptySet.isEmpty());
    }

    @Test
    @DisplayName("Test case for toString")
    public void testToString() {
        assertEquals("[1, 2, 3]", nonEmptySet.toString());
    }

    @Test
    @DisplayName("Test case for remove")
    public void testRemove() {
        nonEmptySet.remove(2);
        assertFalse(nonEmptySet.contains(2));
    }

    @Test
    @DisplayName("Test case for equals")
    public void testEquals() {
        IntegerSet equalSet = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3)));
        assertEquals(nonEmptySet, equalSet);

        IntegerSet differentSet = new IntegerSet(new ArrayList<>(Arrays.asList(4, 5, 6)));
        assertNotEquals(nonEmptySet, differentSet);
    }

    @Test
    @DisplayName("Test case for length")
    public void testLength() {
        assertEquals(3, nonEmptySet.length());
    }

    @Test
    @DisplayName("Test case for isEmpty")
    public void testIsEmpty() {
        assertTrue(emptySet.isEmpty());
        assertFalse(nonEmptySet.isEmpty());
    }

    @Test
    @DisplayName("Test case for contains")
    public void testContains() {
        assertTrue(nonEmptySet.contains(2));
        assertFalse(nonEmptySet.contains(4));
    }

    @Test
    @DisplayName("Test case for largest")
    public void testLargest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(2, set.largest());
    }


    @Test
    @DisplayName("Test case for smallest")
    public void testSmallest() throws IntegerSetException {
        IntegerSet set = new IntegerSet();
        set.add(1);
        set.add(2);
        assertEquals(1, set.smallest());
    }
    @Test
    @DisplayName("Test case for union")
    public void testUnion() {
        IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(3, 4, 5, 6)));
        nonEmptySet.union(setB);
        assertEquals("[1, 2, 3, 4, 5, 6]", nonEmptySet.toString());
    }

    @Test
    @DisplayName("Test case for intersect")
    public void testIntersect() {
        IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(2, 3, 4)));
        nonEmptySet.intersect(setB);
        assertEquals("[2, 3]", nonEmptySet.toString());
    }

    @Test
    @DisplayName("Test case for diff")
    public void testDiff() {
        IntegerSet setB = new IntegerSet(new ArrayList<>(Arrays.asList(2, 3, 4)));
        nonEmptySet.diff(setB);
        assertEquals("[1]", nonEmptySet.toString());
    }

    @Test
    @DisplayName("Test case for complement")
    public void testComplement() {
        IntegerSet universalSet = new IntegerSet(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)));
        nonEmptySet.complement(universalSet);
        assertEquals("[4, 5]", nonEmptySet.toString());
    }
}
