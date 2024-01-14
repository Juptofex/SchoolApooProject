import java.util.ArrayList;

public class PortfolioEtudiant {
    private String emailEtudiant;
    private ArrayList<Element> elements = new ArrayList<>();
    private int nombreOperationDAjout = 0;

    public PortfolioEtudiant(String emailEtudiant) {
        if (emailEtudiant== null || emailEtudiant.equals(""))
            throw new IllegalArgumentException();
        this.emailEtudiant = emailEtudiant;
    }

    public boolean ajouter(Element element) {
        nombreOperationDAjout++;
        boolean ajouter = element.attribuerDansPortfolio(nombreOperationDAjout);
        if (!ajouter)
            return false;
        elements.add(element);
        return true;
    }

    public boolean supprimer(Element element) {
        if (element==null || !elements.contains(element))
            return false;
        elements.remove(element);
        return true;
    }

    public boolean estComplet() {
        int somme = 0;
        for (Element element : elements) {
            somme+=element.getPoints();
        }
        if (somme<3)
            return false;
        return true;
    }

    public int fournirNbrElements() {
        return elements.size();
    }

    @Override
    public String toString() {
        String text="Etudiant(e) : "+emailEtudiant;
        for (Element element : elements) {
            text+="\n"+element;
        }
        return text;
    }
}
