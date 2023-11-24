import java.util.Objects;

public class Sphere implements Solide {
    private double rayon;

    public Sphere(double rayon) {
        if (rayon <= 0)
            throw new IllegalArgumentException();
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    @Override
    public double volume() {
        return (4*Math.PI*Math.pow(rayon, 3))/3;
    }

    @Override
    public double surface() {
        return (4*Math.PI*Math.pow(rayon, 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Sphere sphere = (Sphere) o;
        return rayon == sphere.rayon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon);
    }

    @Override
    public String toString() {
        return "Une sphère de rayon : "+rayon;
    }
}
