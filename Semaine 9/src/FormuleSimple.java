import java.time.LocalDate;

public class FormuleSimple extends Formule {
    private Vol volAller, volRetour;

    public FormuleSimple(LocalDate depart, int duree, Vol volAller, Vol volRetour) {
        super(depart, duree);
        this.volAller = volAller;
        this.volRetour = volRetour;
    }

    @Override
    public double prixTotal() {
        return volAller.getPrix()+volRetour.getPrix();
    }

    public Vol getVolAller() {
        return volAller;
    }

    public Vol getVolRetour() {
        return volRetour;
    }

    @Override
    public String toString() {
        return "Formule simple comprenant deux vols : "+
                "\n"+volAller+"\n"+volRetour+
                "\n\nPrix total : "+prixTotal();
    }

}
