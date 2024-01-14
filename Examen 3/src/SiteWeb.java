public class SiteWeb extends Element {
    private String url, technologies;
    public static final int POINT=2;

    public SiteWeb(String titre, String url, String technologies) {
        super(titre, POINT);
        this.url = url;
        this.technologies = technologies;
    }

    @Override
    public String toString() {
        return "Element N°";
    }
}
