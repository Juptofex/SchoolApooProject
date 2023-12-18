import java.util.Objects;
import java.time.LocalDate;

public abstract class Vehicule {
    private String nChassis, immatriculation;
    private LocalDate dateMiseCirculation, dernierControleTech;
    private double kilometrage;

    public Vehicule(String nChassis, String immatriculation, LocalDate dateMiseCirculation) {
        this.nChassis = nChassis;
        this.immatriculation = immatriculation;
        this.dateMiseCirculation = dateMiseCirculation;
    }

    public String getnChassis() {
        return nChassis;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public LocalDate getDateMiseCirculation() {
        return dateMiseCirculation;
    }

    public LocalDate getDernierControleTech() {
        return dernierControleTech;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void setDernierControleTech(LocalDate dernierControleTech) {
        if (dernierControleTech.isBefore(this.dernierControleTech) || dernierControleTech.isEqual(this.dernierControleTech))
            throw new IllegalArgumentException();
        this.dernierControleTech = dernierControleTech;
    }

    public void setKilometrage(double kilometrage) {
        if (kilometrage < this.kilometrage)
            throw new IllegalArgumentException();
        this.kilometrage = kilometrage;
    }

    public abstract boolean ordreControleTech();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Vehicule vehicule = (Vehicule) o;
        return nChassis.equals(vehicule.nChassis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nChassis);
    }

    @Override
    public String toString() {
        return "Vehicule : ";
    }
}
