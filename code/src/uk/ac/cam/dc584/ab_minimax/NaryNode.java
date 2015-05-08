package uk.ac.cam.dc584.ab_minimax;

public class NaryNode implements Node {
    private Node[] children;

    public NaryNode(Node[] children) {
        this.children = children;
    }

    public double calculate(NodeType turn) {
        return this.calculate(
                turn,
                NodeType.MAX.defaultValue(),
                NodeType.MIN.defaultValue());
    }

    public double calculate(NodeType turn, double alpha, double beta) {
        Node current;
        double bestValue = turn.defaultValue();

        for (int i = 0; i < this.children.length; i++) {
            current = this.children[i];
            double currentValue;

            currentValue = current.calculate(turn.next(), alpha, beta);

            if (turn == NodeType.MAX) {
                if (currentValue >= beta) {
                    // Min will never choose this branch because it is guaranteed to do
                    // better else where
                    return currentValue;
                }

                if (currentValue > bestValue) {
                    bestValue = currentValue;
                }

                if (currentValue > alpha) {
                    alpha = currentValue;
                }
            } else {
                if (currentValue <= alpha) {
                    // Max will never choose this branch
                    return currentValue;
                }
                if (currentValue < bestValue) {
                    bestValue = currentValue;
                }

                if (currentValue < beta) {
                    beta = currentValue;
                }
            }
        }

        return bestValue;
    }
}
