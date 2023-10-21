public class Article {

    private String reference, nom, description;
    private int prixHorsTVA;
    private double tauxTVA;

    public Article(String reference, String nom, String  description, int prixHorsTVA, double tauxTVA){
        this.reference = reference;
        this.description = description;
        this.nom = nom;
        this.prixHorsTVA = prixHorsTVA;
        this.tauxTVA = tauxTVA;
    }

    public Article(String reference, String nom, String  description, int prixHorsTVA){
        this.reference = reference;
        this.description = description;
        this.nom = nom;
        this.prixHorsTVA = prixHorsTVA;
        tauxTVA = 21;
    }

    public double calculerPrixTVAComprise() {
        double multp;
        if (tauxTVA != 100){
            multp = (tauxTVA / 100) + 1;
        }else {
            multp = tauxTVA/100;
        }
        return prixHorsTVA*multp;
    }

    public double calculerPrixTVAComprise(double reduction) {
        double multp;
        double multp2 = 1-(reduction/100);
        if (tauxTVA != 100){
            multp = (tauxTVA / 100) + 1;
        }else {
            multp = tauxTVA/100;
        }
        return (prixHorsTVA*multp)*multp2;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrixHorsTVA() {
        return prixHorsTVA;
    }

    public double getTauxTVA() {
        return tauxTVA;
    }

    public String toString(){
        return nom+"\n"+
                "Reference : "+reference;
    }
}
