import java.util.ArrayList;

public class Catalogue {

    private ArrayList<Livre> liste;

    public Catalogue(){
        liste = new ArrayList<Livre>();
    }

    public String toString(){
        String texte = "Catalogue de livre contenant "+nombreDeLivres()+" livres, dont : ";
        for (Livre l: liste) {
            texte += "\n- "+l.toString();
        }
        return texte;
    }

    public boolean contient(Livre livre){
        return liste.contains(livre);
    }

    public boolean ajouter(Livre livre){
        if (liste.contains(livre)) return false;
        liste.add(livre);
        return true;
    }

    public boolean retirer(Livre livre){
        if (!liste.contains(livre)) return false;
        liste.remove(livre);
        return true;
    }

    public int nombreDeLivres(){
        return liste.size();
    }

    public boolean check(){
        return liste.size() == 0;
    }

    public Livre chercherLivre(String isbn){
        for (Livre l: liste) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }
}
