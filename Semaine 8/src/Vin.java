public class Vin extends BoissonAlcoolisee {
    private String cepage, couleur, region, paysOrigine;

    public Vin(String nom, int contenance, double prix, double degreAlcool, String cepage, String couleur, String region, String paysOrigine) {
        super(nom, contenance, prix, degreAlcool);
        if (couleur == null)
            throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
        if (couleur != "rouge" && couleur != "blanc" && couleur != "rosé")
            throw new IllegalArgumentException("La couleur doit être choisie parmi les valeurs suivantes : rouge, blanc, rosé");
        this.cepage = cepage;
        this.couleur = couleur;
        this.region = region;
        this.paysOrigine = paysOrigine;
    }

    public String getCouleur() {
        return couleur;
    }

    @Override
    public String toString() {
        return getNom()+" ("+getContenance()+"cl)"+
                "\nCouleur du vin : "+couleur+
                "\nCepage : "+cepage+
                "\nOrigine : "+paysOrigine+
                "\nDegre d'alcool : "+getDegreAlcool()+"°."+
                "\nAu prix de : "+getPrix()+"€";
    }
}
