
public class Membre {
    private String nom, prenom, numTelephone;
    private Membre parrain;

    public Membre(String nom, String prenom,String numTelephone){
        this.nom = nom;
        this.prenom = prenom;
        this.numTelephone = numTelephone;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumTelephone() {
        return numTelephone;
    }

    public void setNumTelephone(String numTelephone) {
        this.numTelephone = numTelephone;
    }

    public Membre getParrain() {
        return parrain;
    }

    public boolean parrainInit(Membre parrain){
        if (this.parrain!=null || (parrain.getNom() == nom && parrain.getPrenom() == prenom && parrain.getNumTelephone() == numTelephone)){
            return false;
        }else {
            this.parrain = parrain;
            return true;
        }
    }

    @Override
    public String toString(){
        if (parrain == null){
            return nom+prenom+"\n"+
                    "Numéro de téléphone : "+numTelephone+"\n"+
                    "Le membre n'a pas de parrain";
        }else {
            return nom+"\n"+
                    prenom+"\n"+
                    "Numéro de téléphone : "+numTelephone+"\n"+
                    "Parrain : "+parrain.getNom()+" "+parrain.getPrenom();
        }
    }
}
