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

    public void changerSerie(Serie serie) {
        if (serie == null || serie == this.serie) throw new IllegalArgumentException("Serie invalide");
        if (this.serie.getDelegue() == this) throw new IllegalStateException("Etudiant est delegue de sa serie");
        this.serie = serie;
    }

    public String toString(){
        return matricule+", "+nom+" "+prenom+" (série "+serie.getNom()+" )";
    }
}
