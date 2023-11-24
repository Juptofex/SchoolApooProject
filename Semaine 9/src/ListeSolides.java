import java.util.ArrayList;
import java.util.Iterator;

public class ListeSolides implements Iterable<Solide> {
    private ArrayList<Solide> liste;

    public ListeSolides() {
        liste = new ArrayList<>();
    }

    public ArrayList<Solide> getListe() {
        return liste;
    }

    public boolean estVide() {
        return liste.isEmpty();
    }

    public int nombreDeSolides() {
        return liste.size();
    }

    public boolean ajouter(Solide solide){
        if (solide == null) return false;
        if (this.contient(solide)) return false;
        liste.add(solide);
        return true;
    }

    public boolean supprimer(Solide solide) {
        if (solide == null) return false;
        if (!this.contient(solide)) return false;
        liste.remove(solide);
        return true;
    }

    public boolean contient(Solide solide) {
        return liste.contains(solide);
    }

//    public Solide trouverPlusGrand() {
//        return
//    }

    @Override
    public Iterator<Solide> iterator() {
        return liste.iterator();
    }

    @Override
    public String toString() {
        String text = "La liste contient :\n";
        for (Solide solide : liste) {
            text+= solide+"\n";
        }
        return text;
    }
}
