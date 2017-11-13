package polymorphism;

public class Calculator implements Visitor {
    @Override
    public int visit(NumNode node) {
        return node.getValue();
    }

    @Override
    public int visit(AddNode node) {
        int left = node.getLeft().accept(this);
        int right = node.getRight().accept(this);

        return left + right;
    }
}
