package uk.ac.cam.dc584.ab_minimax;

public class Main {

    public static void main(String[] args) {
	    Node[] xxlChildren  = {new LeafNode(1), new LeafNode(15)};
        Node[] xxrChildren = {new LeafNode(2),  new LeafNode(19)};

        Node xxl = new NaryNode(xxlChildren);
        Node xxr = new NaryNode(xxrChildren);

        Node[] xlChildren = {xxl, xxr};

        Node xl = new NaryNode(xlChildren);

        xxlChildren = new Node[]{new LeafNode(18), new LeafNode(23)};
        xxrChildren = new Node[]{new LeafNode(4),  new LeafNode(3)};

        xxl = new NaryNode(xxlChildren);
        xxr = new NaryNode(xxrChildren);

        Node[] xrChildren = {xxl, xxr};

        Node xr = new NaryNode(xrChildren);

        Node l = new NaryNode(new Node[]{xl, xr});

        // middle

        xxlChildren = new Node[]{new LeafNode(2), new LeafNode(1)};
        xxrChildren = new Node[]{new LeafNode(7), new LeafNode(8)};

        xxl = new NaryNode(xxlChildren);
        xxr = new NaryNode(xxrChildren);

        xlChildren = new Node[]{xxl, xxr};

        xl = new NaryNode(xlChildren);

        xxlChildren = new Node[]{new LeafNode(9), new LeafNode(10)};
        xxrChildren = new Node[]{new LeafNode(2),  new LeafNode(5)};

        xxl = new NaryNode(xxlChildren);
        xxr = new NaryNode(xxrChildren);

        xrChildren = new Node[]{xxl, xxr};

        xr = new NaryNode(xrChildren);

        Node m = new NaryNode(new Node[]{xl, xr});

        // right

        xxlChildren = new Node[]{new LeafNode(1), new LeafNode(30)};
        xxrChildren = new Node[]{new LeafNode(4), new LeafNode(7)};

        xxl = new NaryNode(xxlChildren);
        xxr = new NaryNode(xxrChildren);

        xlChildren = new Node[]{xxl, xxr};

        xl = new NaryNode(xlChildren);

        xxlChildren = new Node[]{new LeafNode(20), new LeafNode(1)};
        xxrChildren = new Node[]{new LeafNode(1),  new LeafNode(5)};

        xxl = new NaryNode(xxlChildren);
        xxr = new NaryNode(xxrChildren);

        xrChildren = new Node[]{xxl, xxr};

        xr = new NaryNode(xrChildren);

        Node r = new NaryNode(new Node[]{xl, xr});

        Node root = new NaryNode(new Node[]{l, m, r});

        System.out.println(root.calculate(NodeType.MAX));

    }
}
