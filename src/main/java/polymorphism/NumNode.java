package polymorphism;

public class NumNode implements Node {
    private final int value;

    public NumNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
