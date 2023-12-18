import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class VoyageOrganise extends Formule implements Iterable<Etape> {
    private double prix;
    private String nom;
    private ArrayList<Etape> etapes;

    public VoyageOrganise(LocalDate depart, int duree, double prix, String nom) {
        super(depart, duree);
        this.prix = prix;
        this.nom = nom;
        etapes = new ArrayList<>();
    }

    @Override
    public double prixTotal() {
        return prix;
    }

    public String getNom() {
        return nom;
    }

    public boolean ajouterEtape(Etape etape) {
        if (etape==null)
            throw new IllegalArgumentException("L'étapes ne peut pas être un élément null.");
        LocalDate retour=getDepart().plusDays(getDuree());
        if (etape.getDate().isBefore(getDepart()) || etape.getDate().isAfter(retour))
            throw new IllegalArgumentException("L'étape ne peut pas être à une date précédent le départ ou prenant place après le retour.");
        for (Etape etape1 : etapes) {
            if (etape1.getDate()==etape.getDate())
                throw new IllegalArgumentException("Il ne peut pas y avoir deux étapes au même moment.");
        }
        etapes.add(etape);
        return true;
    }

    public boolean retirerEtape(Etape etape) {
        if (etape==null)
            throw new IllegalArgumentException("L'étapes ne peut pas être un élément null.");
        if (!etapes.contains(etape))
            throw new IllegalArgumentException("Il faut choisir une étape comprise dans la liste.");
        etapes.remove(etape);
        return true;
    }

    @Override
    public Iterator<Etape> iterator() {
        return etapes.iterator();
    }

    @Override
    public String toString() {
        String text ="VoyageOrganise : " + "\nNom : " + nom + "\nPrix : " + prix + "\nEtapes : ";
        for (Etape etape : etapes) {
            text+="\n"+etape;
        }
        return text;
    }
}
