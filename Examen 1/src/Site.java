import java.util.ArrayList;
import java.util.Arrays;

public class Site {
    private String url;
    private ArrayList<ContenuVideo> contenusVideos = new ArrayList<>();

    public Site(String url) {
        if (url==null)
            throw new IllegalArgumentException("URL invalide");
        this.url = url;
    }

    public boolean ajouter(ContenuVideo contenuVideo) {
        if (contenuVideo==null)
            throw new IllegalArgumentException("Contenu invalide");
        if (contenusVideos.contains(contenuVideo))
            return false;
        contenusVideos.add(contenuVideo);
        return true;
    }

    public boolean effacer(ContenuVideo contenuVideo) {
        if (contenuVideo==null)
            throw new IllegalArgumentException("Contenu invalide");
        if (!contenusVideos.contains(contenuVideo))
            return false;
        contenusVideos.remove(contenuVideo);
        return true;
    }

    @Override
    public String toString() {
        if (contenusVideos.isEmpty()) {
            return "Site [url="+url+"]"+"\nListe de contenus vidéos \n Aucun contenu vidéo";
        }
        String text="Site [url="+url+"]"+"\nListe de contenus vidéos";
        for (ContenuVideo contenusVideo : contenusVideos) {
            text+="\n"+contenusVideo;
        }
        return text;
    }
}
