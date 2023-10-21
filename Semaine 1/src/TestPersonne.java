public class TestPersonne {

    public static void main(String[] args) {
        Personne personne1 = new Personne("Jean B", 01, 01, 2000, "Rue Caremberg","10", "7850", "Enghien", 2023);

        System.out.println(personne1.DateNaissance());
        System.out.println(personne1.Adresse());
        System.out.println(personne1.calculerAgeFin());
        System.out.println(personne1.calculerAge(2001));
    }
}
