import java.time.LocalDate;

public class Croisiere extends VoyageOrganise {
    private Bateau bateau;

    public Croisiere(LocalDate depart, int duree, double prix, String nom, Bateau bateau) {
        super(depart, duree, prix, nom);
        this.bateau = bateau;
    }

    public Bateau getBateau() {
        return bateau;
    }

    @Override
    public String toString() {
        return "Croisiere : " + "\nNom : " + getNom() + "\nDepart : "+ getDepart() + "\nDuree : " + getDuree() +
                "\nBateau : " + bateau + "\n\nPrix : "+ prixTotal();
    }
}
