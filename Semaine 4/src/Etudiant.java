public class Etudiant {
    private String matricule, nom, prenom;
    private Serie serie;

    public Etudiant(String matricule, String nom, String prenom, Serie serie){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.serie = serie;
    }

    public String getMatricule() {
        return matricule;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Serie getSerie() {
        return serie;
    }

    public boolean changerSerie(Serie serie) {
        if (serie == this.serie || this.serie.getDelegue() == this){
            return false;
        }else {
            this.serie = serie;
            return true;
        }
    }

    public String toString(){
        return matricule+", "+nom+" "+prenom+" (série "+serie.getNom()+" )";
    }
}
