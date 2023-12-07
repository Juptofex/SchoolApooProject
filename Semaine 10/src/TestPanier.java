public class TestPanier {
    public static void main(String[] args) {
        Panier panier = new Panier();
        Livre l1 = new Livre("0123",12,"JJ", "HH", 215);
        Livre l2 = new Livre("0124",13,"JJ", "HH", 215);
        Dvd dvd = new Dvd("0126", 18, "WAW","Marc");
        panier.ajouterProduit(l1);
        panier.ajouterProduit(l2);
        panier.ajouterProduit(dvd);
        System.out.println(panier.getnProduit());
        System.out.println(panier.prixTotalPanier());
        System.out.println(panier);
    }
}
