public class TestSite {
    public static void main(String[] args) {
        Site superContent = new Site("www.supercontent.com");
        Film endgame = new Film("Avengers: Endgame", "action", 181, 279800000);
        Serie bigbang = new Serie("The Big Bang Theory", "comédie", 279);
        try {
            Film mauvaisEndgame = new Film("Avengers: Endgame", "superhéros", 181, 279800000);
        } catch (IllegalArgumentException iae) {
            System.out.println("Paramètre invalide");
        }
        Film avengers = new Film("The Avengers", "action", 143);
        System.out.println(superContent);
        superContent.ajouter(endgame);
        superContent.ajouter(bigbang);
        superContent.ajouter(avengers);

        System.out.println(superContent);
    }
}
