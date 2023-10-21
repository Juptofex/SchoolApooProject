public class TestCompteEnBanque {

    public static void main(String[] args) {

        Date date1 = new Date(23,12,2010);
        Date date2 = new Date(23,12,2005);
        Date dateN = new Date(23,12,2000);
        Adresse adresse1 = new Adresse("Rue Caremberg", "10", "7850", "Enghien");
        Personne personne1 = new Personne("Jean", "Marc", dateN, adresse1);
        CompteEnBanque compte1 = new CompteEnBanque(personne1, date1, "000-000000089-89", date2, 1200.0);
        System.out.println(compte1);
        compte1.depot(100.0);
        System.out.println(compte1);
    }
}
