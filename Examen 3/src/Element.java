public  abstract class Element {
    private String titre;
    private int idDansPortfolio, points;

    public Element(String titre, int points) {
        this.titre = titre;
        this.points = points;
    }

    public boolean attribuerDansPortfolio(int idDansPortfolio) {
        if (this.idDansPortfolio!=0)
            return false;
        this.idDansPortfolio = idDansPortfolio;
        return true;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Element N°"+idDansPortfolio+" - "+titre+" : ";
    }
}
