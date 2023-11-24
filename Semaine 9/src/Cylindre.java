import java.util.Objects;

public class Cylindre implements Solide{
    private double rayon, hauteur;

    public Cylindre(double rayon, double hauteur) {
        if (rayon <= 0 || hauteur <= 0)
            throw new IllegalArgumentException();
        this.rayon = rayon;
        this.hauteur = hauteur;
    }

    public double getRayon() {
        return rayon;
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double volume() {
        return (Math.PI*Math.pow(rayon, 2)*hauteur);
    }

    @Override
    public double surface() {
        return ((2*Math.PI*Math.pow(rayon, 2))+2*Math.PI*rayon*hauteur);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Cylindre cylindre = (Cylindre) o;
        return rayon == cylindre.rayon && hauteur == cylindre.hauteur;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rayon, hauteur);
    }

    @Override
    public String toString() {
        return "Un cylindre de rayon : "+rayon+" et de hauteur : "+hauteur;
    }
}
