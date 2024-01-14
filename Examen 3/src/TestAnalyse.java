public class TestAnalyse {
    public static void main(String[] args) {
        //Scenario 1
        System.out.println("Scénario 1");
        SiteWeb webKen = new SiteWeb("Ken sur le web", "www.ken.io", "html, css, js");
        Document motivationKen = new Document("Motivation de Ken");
        Document cvKen = new Document("CV de Ken Masters", "bla bla...");
        PortfolioEtudiant portfolioKen = new PortfolioEtudiant("ken.masters@vinci.be");
        Analyse analyseKenParTencent = new Analyse(portfolioKen, "Tencent");

        //Scenario 2
        System.out.println("Scénario 2");
        try {
            analyseKenParTencent.determinerCompletudePortfolio();
        } catch (IllegalStateException ise){
            System.out.println(ise.getMessage());
        }

        //Scenario 3
        System.out.println("Scénario 3");
        portfolioKen.ajouter(webKen);
        portfolioKen.ajouter(motivationKen);
        portfolioKen.supprimer(motivationKen);
        portfolioKen.ajouter(cvKen);
        System.out.println(portfolioKen);
    }
}
