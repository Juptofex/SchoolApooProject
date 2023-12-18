public class Hotel {
    private String nom;
    private int nEtoile;
    private double prixNuit;

    public Hotel(String nom, int nEtoile, double prixNuit) {
        this.nom = nom;
        this.nEtoile = nEtoile;
        this.prixNuit = prixNuit;
    }

    public String getNom() {
        return nom;
    }

    public int getnEtoile() {
        return nEtoile;
    }

    public double getPrixNuit() {
        return prixNuit;
    }

    @Override
    public String toString() {
        return "Hotel "+nEtoile+" etoiles "+nom+
                "\nPrix par nuits : "+prixNuit;
    }
}
