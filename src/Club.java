public class Club {
    private String matricule, nom;
    private Adresse adresse;
    private Joueur directeurTournoi;

    public Club(String matricule, String nom, Adresse adresse){
        this.matricule = matricule;
        this.nom = nom;
        this.adresse = adresse;
        directeurTournoi = null;
    }

    public String getNom() {
        return nom;
    }

    public Joueur getDirecteurTournoi() {
        return directeurTournoi;
    }

    public boolean designerDirecteur(Joueur directeurTournoi){
        if (this.directeurTournoi != null){
            return false;
        }else {
            if (this != directeurTournoi.getClub()){
                return false;
            }else {
                this.directeurTournoi = directeurTournoi;
                return true;
            }
        }
    }

    public void designerDirecteur(){
        directeurTournoi = null;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String toString(){
        if (directeurTournoi == null){
            return matricule+" Club : "+nom+
                    "\nAdresse : "+adresse;
        }else {
            return matricule+" Club : "+nom+
                    "\nDirecteur de tournois : "+directeurTournoi.getNom()+" "+directeurTournoi.getPrenom()+
                    "\nAdresse : "+adresse;
        }
    }
}
