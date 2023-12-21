public class DeveloppeurStagiaire extends Developpeur {
    private String ecole;

    public DeveloppeurStagiaire(String nom, String specialite, String ecole) {
        super(nom,specialite,100);
        this.ecole = ecole;
    }

    public String getEcole() {
        return ecole;
    }

    @Override
    public String toString() {
        return getNom()+", Spécialité : "+getSpecialite()+", Salaire : "+getSalaire()+", Nombre de projets en cours : "+getNbProjetsEnCours()+", Ecole : "+ecole;
    }
}
