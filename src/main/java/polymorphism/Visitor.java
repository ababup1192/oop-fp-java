package polymorphism;

public interface Visitor {
    int visit(NumNode node);

    int visit(AddNode node);
}
