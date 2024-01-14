public class Document extends Element{
    private String contenu;
    public static final int POINT=1;

    public Document(String titre, String contenu) {
        super(titre, POINT);
        this.contenu = contenu;
    }

    public Document(String titre) {
        super(titre, POINT);
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Element N°";
    }
}
