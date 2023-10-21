public class Personne {

    String nomPrenom;
    int jourN;
    int moisN;
    int anneeN;
    String rue;
    String nRue;
    String codePostal;
    String nomVille;
    int anneeActuelle;

    Personne(String newNomPrenom, int newJourN, int newMoisN, int newAnneeN,String newRue, String newNRue, String newCodePostal, String newNomVille, int newAnneeActuelle) {
        nomPrenom = newNomPrenom;
        jourN = newJourN;
        moisN = newMoisN;
        anneeN = newAnneeN;
        rue = newRue;
        nRue = newNRue;
        codePostal = newCodePostal;
        nomVille = newNomVille;
        anneeActuelle = newAnneeActuelle;
    }
    public String DateNaissance(){
        return jourN+"/"+moisN+"/"+anneeN;
    }
    public String Adresse(){
        return rue+" n°"+nRue+", "+codePostal+", "+nomVille;
    }
    String calculerAgeFin(){
        int ageActuel = anneeActuelle-anneeN;
        return "Il aura "+ageActuel+" ans"+" en fin d'année";
    }
    String calculerAge(int anneeActuelle){
        int ageActuel = anneeActuelle-anneeN;
        return "Il aura/avais "+ageActuel+" ans"+" en fin d'année";
    }

}
