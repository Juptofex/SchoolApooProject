import java.util.ArrayList;
import java.util.Iterator;

public class Projet implements Iterable<Developpeur>{
    private int numero;
    private String nom;
    private boolean termine;
    private ArrayList<Developpeur> developpeurs = new ArrayList<>();
    private static int nombreDeProjets;

    public Projet(String nom) {
        this.nom = nom;
        nombreDeProjets = 1;
        termine = false;
    }

    public String getNom() {
        return nom;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isTermine() {
        return termine;
    }

    public boolean ajouter(Developpeur developpeur) {
        if (termine) return false;
        if (developpeurs.contains(developpeur)) return false;
        developpeurs.add(developpeur);
        developpeur.signalerNouveauProjet();
        return true;
    }

    public boolean retirer(Developpeur developpeur) {
        if (termine) return false;
        if (!developpeurs.contains(developpeur)) return false;
        developpeurs.remove(developpeur);
        developpeur.signalerFinDUnProjet();
        return true;
    }

    public boolean terminer() {
        if (termine== true) return false;
        termine = true;
        for (Developpeur developpeur : developpeurs) {
            developpeur.signalerFinDUnProjet();
        }
        return true;
    }

    @Override
    public Iterator<Developpeur> iterator() {
        return null;
    }

    @Override
    public String toString() {
        String text;
        if (developpeurs.isEmpty()) {
            return "Projet "+numero+" : "+nom+" Site stages termine \nDeveloppeur(s) sur le projet :";
        }
        if (termine) {
            text = "Projet "+numero+" : "+nom+" Site stages termine \nDeveloppeur(s) sur le projet :";
        } else {
            text = "Projet "+numero+" : "+nom+" Site stages termine \nDeveloppeur(s) sur le projet :";
        }
        for (Developpeur developpeur : developpeurs) {
            text+="\n"+developpeur;
        }
        return text;
    }
}
