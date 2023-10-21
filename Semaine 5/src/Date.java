public class Date {

    private int annee;
    private int mois;
    private int jour;

    Date(int nAnnee, int nMois, int nJour){
        annee = nAnnee;
        mois = nMois;
        jour = nJour;
    }

    public int getAnnee(){ return annee; }

    public void setAnnee(int nAnnee){ annee = nAnnee; }

    public  int getMois(){ return mois; }

    public  void setMois(int nMois){ mois = nMois; }

    public int getJour(){ return jour; }

    public void setJour(int nJour){ jour = nJour; }

    public String toString(){
        return jour + "/" + mois + "/" + annee;
    }
}
