public class Joueur {
    private  String nom, prenom;
    private  Date dateDeNaissance;
    private Club club;
    private  int nbrPartie, elo;

    public Joueur(String nom, String prenom, Date dateDeNaissance, Club club){
        this.prenom = prenom;
        this.nom = nom;
        this.dateDeNaissance = dateDeNaissance;
        this.club = club;
        nbrPartie = 0;
        elo = 0;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Club getClub() {
        return club;
    }

    public void partieJouee(){
        this.nbrPartie += 1;
    }

    public boolean changerElo(int elo){
        if (nbrPartie > 10){
            if (elo > 1150){
                this.elo = elo;
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }

    public boolean changerClub(Club club){
        if (this.club == club){
            return false;
        }else {
            if (this == this.club.getDirecteurTournoi()){
                this.club.designerDirecteur();
                this.club = club;
                return true;
            }else {
                this.club = club;
                return true;
            }
        }
    }

    public String toString(){
        return nom+" "+ prenom+" (Club "+club.getNom()+")"+
                "\nDate de naissance : "+dateDeNaissance+
                "\nNombre de partie : "+nbrPartie+
                "\nElo : "+elo;
    }
}
