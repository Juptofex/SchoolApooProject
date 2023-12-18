import java.time.LocalDate;

public class Vol {
    private LocalDate dateHeure;
    private double  prix;
    private String numero,aeroportD,aeroportA;

    public Vol(LocalDate dateHeure, double prix, String numero, String aeroportD, String aeroportA) {
        this.dateHeure = dateHeure;
        this.prix = prix;
        this.numero = numero;
        this.aeroportD = aeroportD;
        this.aeroportA = aeroportA;
    }

    public LocalDate getDateHeure() {
        return dateHeure;
    }

    public double getPrix() {
        return prix;
    }

    public String getNumero() {
        return numero;
    }

    public String getAeroportD() {
        return aeroportD;
    }

    public String getAeroportA() {
        return aeroportA;
    }

    @Override
    public String toString() {
        return "Vol numero : "+numero+
                "\nDepart : "+dateHeure+
                "\nAerport de depart : "+aeroportD+
                "\nAerport d'arrivee : "+aeroportA+
                "\nPrix : "+prix;
    }
}
