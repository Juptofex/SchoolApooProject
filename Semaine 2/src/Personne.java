public class Personne {

    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private Adresse domicile;

    Personne(String nNom, String nPrenom, Date nDateDeNaissance, Adresse nDomicile){
        nom = nNom;
        prenom = nPrenom;
        dateDeNaissance = nDateDeNaissance;
        domicile = nDomicile;
    }

    public int calculerAge(){
        return 2023 - dateDeNaissance.getAnnee();
    }

    public int calculerAgeEn(int an){
        return an-dateDeNaissance.getAnnee();
    }

    public Adresse getDomicile(){ return domicile; }

    public  String fournirDateNaissance(){
        return dateDeNaissance.getJour() + "/" + dateDeNaissance.getMois() + "/" + dateDeNaissance.getAnnee();
    }

    public String toString(){
        return prenom + " " + nom + " né le " + fournirDateNaissance();
    }

    public void demenager(String rue, String numero, String codePostal, String ville) {
        domicile.setRue(rue);
        domicile.setNumero(numero);
        domicile.setCodePostal(codePostal);
        domicile.setVille(ville);
    }
}
