public class Cd extends Produit{
    private String titre, artiste;
    private int nMorceau;

    public Cd(String reference, double prix, String titre, String artiste, int nMorceau) {
        super(reference, prix);
        this.titre = titre;
        this.artiste = artiste;
        this.nMorceau = nMorceau;
    }

    public String getTitre() {
        return titre;
    }

    public String getArtiste() {
        return artiste;
    }

    public int getnMorceau() {
        return nMorceau;
    }

    @Override
    public String toString() {
        return titre+" de "+artiste+
                "\nPrix : "+getPrix()+
                "\nn° référence : "+getReference();
    }
}
