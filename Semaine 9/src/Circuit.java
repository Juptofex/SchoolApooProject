import java.time.LocalDate;

public class Circuit extends VoyageOrganise {
    private String description;

    public Circuit(LocalDate depart, int duree, double prix, String nom, String description) {
        super(depart, duree, prix, nom);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Circuit : " + "\nNom : " + getNom() + "\nDepart : "+ getDepart() + "\nDuree : " + getDuree()
                + "\nDescription : "+ description + "\n\nPrix : " + prixTotal();
    }
}
