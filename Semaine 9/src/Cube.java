import java.util.Objects;

public class Cube implements Solide{
    private double cote;

    public Cube(double cote) {
        if (cote <= 0)
            throw new IllegalArgumentException();
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    @Override
    public double volume() {
        return Math.pow(cote, 3);
    }

    @Override
    public double surface() {
        return 6*Math.pow(cote, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return cote == cube.cote;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cote);
    }

    @Override
    public String toString() {
        return "Un cube de cote : "+cote;
    }
}
