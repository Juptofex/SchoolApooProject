public class Analyse {
    private PortfolioEtudiant  portfolio;
    private String resultat, interviewer;
    private static final String  RESULTAT_NC="Portfolio non complet", RESULTAT_A_INTERVIEWER="A interviewer",
            RESULTAT_INTERESSE="Intéressé", RESULTAT_NON_INTERESSE="Non intéressé";

    public Analyse(PortfolioEtudiant portfolio, String interviewer) {
        if (portfolio==null)
            throw new IllegalArgumentException();
        this.portfolio = portfolio;
        this.interviewer = interviewer;
        determinerCompletudePortfolio();
    }

    public void determinerCompletudePortfolio() {
        if (!portfolio.estComplet())
            resultat=RESULTAT_NC;
        resultat=RESULTAT_A_INTERVIEWER;
    }

    public void terminerAnalyseAvecInteret() {
        if (resultat!=RESULTAT_A_INTERVIEWER)
            throw new IllegalStateException("Impossible de terminer l'analyse si l'étudiant n'a pas été interviewé");
        resultat=RESULTAT_INTERESSE;
    }

    public void terminerAnalyseSansInteret() {
        if (resultat==RESULTAT_A_INTERVIEWER || resultat==RESULTAT_NC)
            resultat=RESULTAT_NON_INTERESSE;
        throw new IllegalStateException();
    }

    @Override
    public String toString() {
        return "";
    }
}
