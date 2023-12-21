public class TestProjets {
    public static void main(String[] args) {
        Projet projet1 = new Projet("Site stages");
        Developpeur olivier = new Developpeur("Olivier","infra", 3500);
        DeveloppeurStagiaire zoe = new DeveloppeurStagiaire("Zoe", "back-end", "IPL");
        Developpeur loic = new Developpeur("Loic", 3000);

        projet1.ajouter(olivier);
        projet1.ajouter(loic);
        projet1.ajouter(zoe);
        projet1.retirer(zoe);
        projet1.retirer(loic);
        projet1.ajouter(zoe);
        System.out.println(projet1);

        projet1.terminer();
        System.out.println(projet1);

    }
}
