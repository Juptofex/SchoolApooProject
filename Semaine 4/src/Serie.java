public class Serie {
    private char nom;
    private Etudiant delegue;

    public Serie(char nom){
        this.nom = nom;
        delegue = null;
    }

    public char getNom() {
        return nom;
    }

    public Etudiant getDelegue() {
        return delegue;
    }

    public boolean elireDelegue(Etudiant delegue){
        if (this.delegue!= null){
            return false;
        }else {
            if (this!= delegue.getSerie()){
                return false;
            }else {
                this.delegue = delegue;
                return true;
            }
        }
    }

    public String toString(){
        if (delegue == null){
            return "Série "+nom;
        }else {
            return "Série "+nom+"(déléqué : "+delegue.getNom()+" "+delegue.getPrenom()+")";
        }
    }
}
