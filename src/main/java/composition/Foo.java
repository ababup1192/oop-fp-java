package composition;

// new Foo(5, new Bar(6, 7));

public class Foo {
    private final int x;
    private final Bar bar;

    public Foo(int x, Bar bar) {
        this.x = x;
        this.bar = bar;
    }

    public int getX() {
        return x;
    }

    public Foo setX(int x) {
        return new Foo(x, bar);
    }

    public int getY() {
        return bar.getY();
    }

    public Foo setY(int y) {
        return new Foo(x, bar.setY(y));
    }

    public int getZ() {
        return bar.getZ();
    }

    public Foo setZ(int z) {
        return new Foo(x, bar.setZ(z));
    }


    public Bar getBar() {
        return bar;
    }

    public int calc() {
        return x + bar.getY() + bar.getZ();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Foo foo = (Foo) o;

        if (x != foo.x) return false;
        return bar != null ? bar.equals(foo.bar) : foo.bar == null;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + (bar != null ? bar.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Foo " + x + " (" + bar + ')';
    }
}
