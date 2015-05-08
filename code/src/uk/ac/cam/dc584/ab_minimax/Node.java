package uk.ac.cam.dc584.ab_minimax;

public interface Node {
    double calculate(NodeType turn, double alpha, double beta);
    double calculate(NodeType turn);
}
