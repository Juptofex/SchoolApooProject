public class Dvd extends Produit {
    private String titre, realisateur;

    public Dvd(String reference, double prix, String titre, String realisateur) {
        super(reference, prix);
        this.titre = titre;
        this.realisateur = realisateur;
    }

    public String getTitre() {
        return titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    @Override
    public String toString() {
        return titre+" de "+realisateur+
                "\nPrix : "+getPrix()+
                "\nn° référence : "+getReference();
    }
}
