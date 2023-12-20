public class Livre extends Produit {
    private String titre, auteur;
    private int nPage;

    public Livre(String reference, double prix, String titre, String auteur, int nPage) {
        super(reference, prix);
        this.titre = titre;
        this.auteur = auteur;
        this.nPage = nPage;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getnPage() {
        return nPage;
    }

    @Override
    public String toString() {
        return titre+" de "+auteur+
                "\nNombre de pages : "+nPage+
                "\nPrix : "+getPrix()+
                "\nn° référence : "+getReference();
    }
}
