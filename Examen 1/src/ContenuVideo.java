import java.util.Arrays;
import java.util.Objects;

public abstract class ContenuVideo {
    private int id;
    private String titre, categorie;
    private static int idSuivant=1;
    private final String[] categoriesPossibles={"action","science-fiction","drame","comédie","horreur","thriller","documentaire","animation"};

    public ContenuVideo(String titre, String categorie) {
        if (titre==null || categorie==null)
            throw new IllegalArgumentException("Paramètre invalide");
        if (!Arrays.asList(categoriesPossibles).contains(categorie))
            throw new IllegalArgumentException("Catégorie inexistante");
        this.titre = titre;
        this.categorie = categorie;
        this.id=idSuivant;
        idSuivant++;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this==o) return true;
        if (o==null || this.getClass() != o.getClass()) return false;
        ContenuVideo contenuVideo = (ContenuVideo) o;
        return this.id==contenuVideo.id;
    }

    @Override
    public String toString() {
        return "Contenu video : ";
    }
}
