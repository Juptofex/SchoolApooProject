public class Tournoi {
    private String nom;
    private Date dateDebut, dateFin;
    private Club orga;

    public Tournoi(String nom, Date dateDebut, Date dateFin){
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        orga = null;
    }

    public Tournoi(String nom, Date dateDebut, Date dateFin, Club orga){
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.orga = orga;
    }

    public String getNom() {
        return nom;
    }

    public String toString(){
        if (orga == null){
            return nom+
                    "\nDate de début : "+dateDebut+" Date de fin : "+dateFin;
        }else {
            return nom+
                    "\nDate de début : "+dateDebut+" Date de fin : "+dateFin+
                    "\nOrganisé par le club "+orga.getNom();
        }

    }
}
