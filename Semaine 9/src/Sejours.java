import java.time.LocalDate;

public class Sejours extends FormuleSimple {
    private Hotel reservationHotel;

    public Sejours(LocalDate depart, int duree, Vol volAller, Vol volRetour, Hotel reservationHotel) {
        super(depart, duree, volAller, volRetour);
        this.reservationHotel = reservationHotel;
    }

    public Hotel getReservationHotel() {
        return reservationHotel;
    }

    @Override
    public double prixTotal() {
        return getVolAller().getPrix()+getVolRetour().getPrix()+(getDuree()*reservationHotel.getPrixNuit());
    }

    @Override
    public String toString() {
        return "Formule simple comprenant deux vols : "+
                "\n"+getVolAller()+"\n"+getVolRetour()+"\n"+reservationHotel+
                "\n\nPrix total : "+prixTotal();
    }
}
