package uk.ac.cam.dc584.ab_minimax;

public class LeafNode implements Node {
    private double value;

    public LeafNode(double value) {
        this.value = value;
    }

    public double calculate(NodeType turn, double alpha, double beta) {
        return this.value;
    }

    public double calculate(NodeType turn) {
        return this.value;
    }
}
