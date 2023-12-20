import java.util.ArrayList;
import java.util.Iterator;

public class Panier implements Iterable<Produit>{
    private ArrayList<Produit> liste;
    private int nProduit;

    public Panier() {
        liste = new ArrayList<>();
    }

    public boolean contientProduit(String reference) {
        if (reference == null) throw new IllegalArgumentException();
        for (Produit produit1 : liste) {
            if (produit1.getReference() == reference) return true;
        }
        return false;
    }

    public boolean ajouterProduit(Produit produit) {
        if (produit == null) return false;
        liste.add(produit);
        nProduit++;
        return true;
    }

    public boolean supprimerProduit(Produit produit) {
        if (produit == null || !this.contientProduit(produit.getReference())) return false;
        liste.remove(produit);
        nProduit--;
        return true;
    }

    public int getnProduit() {
        return nProduit;
    }

    public double prixTotalPanier() {
        double tot = 0;
        for (Produit produit : liste) {
            tot+=produit.getPrix();
        }
        return tot;
    }

    @Override
    public Iterator<Produit> iterator() {
        return liste.iterator();
    }

    @Override
    public String toString() {
        String text = "Panier :\n";
        for (Produit produit : liste) {
            text+=produit+"\n";
        }
        return text;
    }
}
