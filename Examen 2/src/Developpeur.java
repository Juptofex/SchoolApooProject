public class Developpeur {
    private String nom, specialite;
    private double salaire;
    private int nbProjetsEnCours;
    public static String SPECIALITE_PAR_DEFAUT = "full-stack";

    public Developpeur(String nom, String specialite, double salaire) {
        if (nom==null)
            throw new IllegalArgumentException();
        if (specialite==null)
            throw new IllegalArgumentException();
        this.nom = nom;
        this.specialite = specialite;
        this.salaire = salaire;
        nbProjetsEnCours = 0;
    }

    public Developpeur(String nom, double salaire) {
        if (nom==null)
            throw new IllegalArgumentException();
        this.nom = nom;
        this.salaire = salaire;
        specialite = SPECIALITE_PAR_DEFAUT;
        nbProjetsEnCours = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getSpecialite() {
        return specialite;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getNbProjetsEnCours() {
        return nbProjetsEnCours;
    }

    public void setSpecialite(String specialite) {
        if (specialite==null)
            throw new IllegalArgumentException();
        this.specialite = specialite;
    }

    public void signalerNouveauProjet() {
        nbProjetsEnCours++;
    }

    public void signalerFinDUnProjet() {
        nbProjetsEnCours--;
    }

    @Override
    public String toString() {
        return nom+", Spécialité : "+specialite+", Salaire : "+salaire+", Nombre de projets en cours : "+nbProjetsEnCours;
    }
}
