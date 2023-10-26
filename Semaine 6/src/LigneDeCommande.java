public class LigneDeCommande {

    private Article article;
    private int quantite;

    public LigneDeCommande(Article article){
        this.article = article;
        quantite = 1;
    }

    public Article getArticle() {
        return article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public double prixTotal(){
        return article.calculerPrixTVAComprise()*quantite;
    }

    public String toString(){
        return quantite+" x "+article;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        LigneDeCommande ligne = (LigneDeCommande) o;
        return this.article.getReference().equals(ligne.article.getReference()); //TODO Do the hashcode correctly
    }
}
