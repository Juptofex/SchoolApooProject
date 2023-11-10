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

    public void elireDelegue(Etudiant delegue){
        if (this.delegue!= null) throw new IllegalStateException("Il y a deja un delegue");
        if (delegue == null || this!= delegue.getSerie()) throw new IllegalArgumentException("Etudiant invalide");
        this.delegue = delegue;
    }

    public String toString(){
        if (delegue == null){
            return "Série "+nom;
        }else {
            return "Série "+nom+"(déléqué : "+delegue.getNom()+" "+delegue.getPrenom()+")";
        }
    }
}
