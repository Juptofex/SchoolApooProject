public class Rectangle {

    double largeur;
    double longueur;

    Rectangle(double newLargeur, double newLongueur) {
        largeur = newLargeur;
        longueur = newLongueur;
    }
    double calculerAire() {
        return largeur * longueur;
    }
    double calculerPerimetre() {
        return largeur * 2 + longueur * 2;
    }

    public String toString() {
        return "Rectangle de largeur "+largeur+" et de longueur "+longueur;
    }
}
