public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(2000,12,23);
        Adresse a1 = new Adresse("Rue Korenbeek", "150", "1080", "Bruxelles");
        Club c1 = new Club("000", "1", a1);
        Club c2 = new Club("001", "2", a1);
        Joueur j1 = new Joueur("Jean","Christophe", d1, c1);
        Joueur j2 = new Joueur("Marc", "Antoine", d1, c2);
        Tournoi t1 = new Tournoi("T1", d1, d1, c1);
        Partie p1 = new Partie(d1, j1, j2, t1);

        System.out.println(j1);
        System.out.println();
        System.out.println(j2);
        System.out.println();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();
        System.out.println(t1);
        System.out.println();
        System.out.println(p1);
        System.out.println();

        c1.designerDirecteur(j2);
        System.out.println(c1);
        c1.designerDirecteur(j1);
        System.out.println(c1);
        System.out.println();


        System.out.println(j1.changerClub(c1));
        j1.changerClub(c2);
        System.out.println(j1);
        System.out.println();
        System.out.println(c1);

        System.out.println();
        System.out.println(p1.resultat());
        System.out.println();
        System.out.println(p1);
        System.out.println();
        p1.resultat(0.5);
        System.out.println(p1);
        System.out.println();
        p1.resultat(1);
        System.out.println(p1);
    }
}
