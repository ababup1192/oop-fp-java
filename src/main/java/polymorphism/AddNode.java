package polymorphism;

public class AddNode implements Node {
    private final Node left;
    private final Node right;

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public AddNode(Node left, Node right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
