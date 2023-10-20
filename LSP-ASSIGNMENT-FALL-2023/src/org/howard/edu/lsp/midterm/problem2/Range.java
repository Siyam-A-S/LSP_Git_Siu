package org.howard.edu.lsp.midterm.problem2;

public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public boolean isValueInRange(int value) {
        return value >= start && value <= end;
    }

    public boolean doRangesOverlap(Range otherRange) {
        return this.end >= otherRange.start && this.start <= otherRange.end;
    }

    public int size() {
        return end - start + 1;
    }
}
