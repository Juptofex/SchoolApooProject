public class CompteEnBanque {

    private Personne titulaire;
    private Date dateValidID;
    private String numero;
    private Date dateOuverture;
    private Double solde;

    public CompteEnBanque(Personne nTitulaire, Date nDateValidID, String nNumero, Date nDateOuverture, Double nSolde){
        titulaire = nTitulaire;
        dateValidID = nDateValidID;
        numero = nNumero;
        dateOuverture = nDateOuverture;
        solde = nSolde;
    }

    public String getTitulaire() {
        return titulaire.getPrenom()+" "+
                titulaire.getNom();
    }

    public Double retrait(Double sommeR){
        if (sommeR >=0){
            return solde -= sommeR;
        }else { return solde;}
    }

    public Double depot(Double sommeD){
        if (sommeD >=0){
            return solde += sommeD;
        }else { return solde;}
    }

    public Double virement(Double sommeV){
        if (sommeV >=0){
            solde -= sommeV;
            return sommeV;
        }else { return solde;}
    }

    public void setDateValidID(Date dateValidID) {
        this.dateValidID = dateValidID;
    }

    public Date getDateValidID() {
        return dateValidID;
    }

    public String getNumero() {
        return numero;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public Double getSolde() {
        return solde;
    }

    public String toString(){
        return "Compte n°"+numero+
                "\nTitulaire : "+getTitulaire()+
                "\nDate d'ouverture : "+dateOuverture+
                "\nSolde : "+solde;
    }
}
