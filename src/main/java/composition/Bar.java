package composition;

public class Bar {
    private final int y;
    private final int z;

    public Bar(int y, int z) {
        this.y = y;
        this.z = z;
    }

    public int getY() {
        return y;
    }

    public Bar setY(int y) {
        return new Bar(y, z);
    }

    public int getZ() {
        return z;
    }

    public Bar setZ(int z) {
        return new Bar(y, z);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bar bar = (Bar) o;

        if (y != bar.y) return false;
        return z == bar.z;
    }

    @Override
    public int hashCode() {
        int result = y;
        result = 31 * result + z;
        return result;
    }

    @Override
    public String toString() {
        return "Bar " + y + ' ' + z;
    }
}
