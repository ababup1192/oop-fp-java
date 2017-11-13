package polymorphism;

public class NodeTest {
    public static void main(String[] args) {
        Node tree = new AddNode(
                new AddNode(
                        new NumNode(2),
                        new NumNode(3)),
                new NumNode(4)
        );

        System.out.println(tree.accept(new Calculator()));
    }

}
