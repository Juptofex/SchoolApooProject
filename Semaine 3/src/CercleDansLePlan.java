public class CercleDansLePlan {

    private double rayon;
    private Point centre;

    public CercleDansLePlan(double nRayon, Point nCentre){
        rayon = nRayon;
        centre = nCentre;
    }

    public double getRayon() {
        return rayon;
    }
    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point getCentre() {
        return centre;
    }
    public void setCentre(double nX, double nY) {
        centre.setX(nX);
        centre.setY(nY);
    }

    @Override
    public String toString() {
        return "Il s'agit d'un cercle de rayon "+rayon+" et dont les coordonnees du centre sont les suivante : "+centre+".";
    }
}
