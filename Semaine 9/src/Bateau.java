import java.util.ArrayList;

public class Bateau {
    private String nom;
    private int nCabine;
    private ArrayList<String> activitees;

    public Bateau(String nom, int nCabine) {
        this.nom = nom;
        this.nCabine = nCabine;
        activitees = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public int getnCabine() {
        return nCabine;
    }

    public boolean ajouterActivitee(String activitee) {
        if (activitee==null)
            throw new IllegalArgumentException("L'activitée ne peut pas être un élément null.");
        if (activitees.contains(activitee))
            throw new IllegalArgumentException("Il ne peut pas y avoir deux fois la même activitée.");
        activitees.add(activitee);
        return true;
    }

    public boolean retirerActivitee(String activitee) {
        if (activitee==null)
            throw new IllegalArgumentException("L'activitée ne peut pas être un élément null.");
        if (!activitees.contains(activitee))
            throw new IllegalArgumentException("Impossible de retirer une acrivitée non contenue dans la liste.");
        activitees.remove(activitee);
        return true;
    }

    @Override
    public String toString() {
        String text = "Bateau : " + "\nNom : " + nom + "\nNombre de cabines : " + nCabine + "\nActivitees : ";
        for (String activitee : activitees) {
            text+=activitee+", ";
        }
        return text;
    }
}
