package uk.ac.cam.dc584.ab_minimax;


public enum NodeType {
    MAX, MIN;

    public double defaultValue() {
        if (this == MAX) {
            return Double.NEGATIVE_INFINITY;
        } else {
            return Double.POSITIVE_INFINITY;
        }
    }

    public NodeType next() {
        if(this == MAX) {
            return MIN;
        } else {
            return MAX;
        }
    }
}
