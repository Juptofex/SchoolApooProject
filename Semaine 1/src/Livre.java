public class Livre {

    String isbn;
    String titre;
    String nomPrenomAuteur;
    double prixConseille;
    int anneeEdition;
    int nombrePage;

    Livre(String newIsbn, String newTitre, String newNomPrenomAuteur, double newPrixconseille, int newAnneeEdition, int newNombrePage) {
        isbn = newIsbn;
        titre = newTitre;
        nomPrenomAuteur = newNomPrenomAuteur;
        prixConseille = newPrixconseille;
        anneeEdition = newAnneeEdition;
        nombrePage = newNombrePage;
    }

    public String toString() {
        return "ISBN : "+isbn+
                "\nTitre : "+titre+
                "\nNom et Prénom de l'auteur : "+nomPrenomAuteur+
                "\nPrix conseillé : "+prixConseille+"€"+
                "\nAnnée d'édition : "+anneeEdition+
                "\nNombre de pages : "+nombrePage;
    }
}
