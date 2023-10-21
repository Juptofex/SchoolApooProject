public class Adresse {

    private String rue;
    private String numero;
    private String codePostal;
    private String ville;

    Adresse(String nRue, String nNumero, String nCodePostal, String nVille){
        rue = nRue;
        numero = nNumero;
        codePostal = nCodePostal;
        ville = nVille;
    }

    public String getRue(){ return rue; }

    public void setRue(String nRue){ rue = nRue; }

    public String getNumero(){ return numero; }

    public void setNumero(String nNumero){ numero = nNumero; }

    public String getCodePostal(){ return codePostal; }

    public void setCodePostal(String nCodePostal){ codePostal = nCodePostal; }

    public String getVille(){ return ville; }

    public void setVille(String nVille){ ville = nVille; }

    public String toString(){
        return rue + " " + numero + ", " + codePostal + " " + ville;
    }
}
