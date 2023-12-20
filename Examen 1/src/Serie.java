public class Serie extends ContenuVideo {
    private int nombreEpisodes;

    public Serie(String titre, String categorie, int nombreEpisodes) {
        super(titre, categorie);
        if (nombreEpisodes<=0)
            throw new IllegalArgumentException("Nombre d'épisodes invalide");
        this.nombreEpisodes = nombreEpisodes;
    }

    public void setNombreEpisodes(int nombreEpisodes) {
        this.nombreEpisodes = nombreEpisodes;
    }

    @Override
    public String toString() {
        return "Série [id="+getId()+", titre="+getTitre()+", catégorie="+getCategorie()+", nombre d'épisodes="+nombreEpisodes+"]";
    }
}
