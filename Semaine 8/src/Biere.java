public class Biere extends BoissonAlcoolisee {
    private boolean pression;

    public Biere(String nom, int contenance, double prix, double degreAlcool, boolean pression) {
        super(nom, contenance, prix, degreAlcool);
        this.pression = pression;
    }

    public boolean getPression() {
        return pression;
    }

    @Override
    public String toString() {
        if (pression == false) {
            return getNom()+" en bouteille (" + getContenance() + "cl)" +
                    "\nDegre d'alcool : " + getDegreAlcool() + "°." +
                    "\nAu prix de : " + getPrix() + "€";
        }
        return getNom()+" pression (" + getContenance() + "cl)" +
                "\nDegre d'alcool : " + getDegreAlcool() + "°." +
                "\nAu prix de : " + getPrix() + "€";
    }
}
