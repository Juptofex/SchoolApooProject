public class Partie {
    private Date date;
    private Joueur blanc, noir;
    private Tournoi tournoi;
    private double ptsBlanc, ptsNoir;

    public Partie(Date date, Joueur blanc, Joueur noir, Tournoi tournoi){
        this.date = date;
        this.blanc = blanc;
        this.noir = noir;
        this.tournoi = tournoi;
        ptsBlanc = 999;
    }

    public boolean resultat(double ptsBlanc){
        if (ptsBlanc == 0 || ptsBlanc == 1 || ptsBlanc == 0.5){
            this.ptsBlanc = ptsBlanc;
            this.ptsNoir = 1 - ptsBlanc;
            blanc.partieJouee();
            noir.partieJouee();
            return true;
        }else {
            return false;
        }
    }

    public boolean resultat(){
        return false;
    }

    public Joueur getGagnant(){
        if (ptsBlanc == 999 || ptsBlanc == 0.5){
            return null;
        }else {
            if (ptsBlanc == 1){
                return blanc;
            }else {
                return noir;
            }
        }
    }

    public String toString(){
        if ((ptsBlanc != 999 || ptsBlanc != 0.5 )&& getGagnant() != null){
            return "La partie a eu lieu le : "+date+
                    "\nElle fait partie du tournois : "+tournoi.getNom()+
                    "\nParticipant jouant les Blancs : "+blanc.getNom()+" "+blanc.getPrenom()+
                    "\nParticipant jouant les noirs : "+noir.getNom()+" "+noir.getPrenom()+
                    "\nLe gagnant est : "+getGagnant();
        }else {
            return "La partie a eu lieu le : "+date+
                    "\nElle fait partie du tournois : "+tournoi.getNom()+
                    "\nParticipant jouant les Blancs : "+blanc.getNom()+" "+blanc.getPrenom()+
                    "\nParticipant jouant les noirs : "+noir.getNom()+" "+noir.getPrenom();
        }

    }
}
