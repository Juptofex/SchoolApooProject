import java.time.LocalDate;

public abstract class Formule {
    private LocalDate depart;
    private int duree;

    public Formule(LocalDate depart, int duree) {
        this.depart = depart;
        this.duree = duree;
    }

    public abstract double prixTotal();

    public LocalDate getDepart() {
        return depart;
    }

    public int getDuree() {
        return duree;
    }

    @Override
    public String toString() {
        return "Voyage de : "+duree+
                "\nDepart : "+depart;
    }
}
