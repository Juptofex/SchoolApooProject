public class TestPanier {
    public static void main(String[] args) {
        Panier panier = new Panier();
        Livre l1 = new Livre("123",12,"JJ", "HH", 215);
        try {
            panier.supprimerProduit(l1);
        } catch (ProduitNonPresentException e) {
            throw new RuntimeException(e);
        }
        Livre l2 = new Livre("0124",13,"JJ", "HH", 215);
        Dvd dvd = new Dvd("0126", 18, "WAW","Marc");
        try {
            panier.ajouterProduit(l1);
        } catch (PanierPleinException e) {
            throw new RuntimeException(e);
        }
        try {
            panier.ajouterProduit(l2);
        } catch (PanierPleinException e) {
            throw new RuntimeException(e);
        }
        try {
            panier.ajouterProduit(dvd);
        } catch (PanierPleinException e) {
            throw new RuntimeException(e);
        }
        System.out.println(panier.getnProduit());
        System.out.println(panier.prixTotalPanier());
        System.out.println(panier);


    }
}
