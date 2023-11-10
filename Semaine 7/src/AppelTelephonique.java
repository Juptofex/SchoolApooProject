import java.text.DecimalFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class AppelTelephonique {
    private LocalDateTime dateAppel;
    private Duration duree;
    private String numero;
    private double tarif;
    private static double defaultTarif = 0.15;

    public AppelTelephonique(LocalDateTime dateAppel, Duration duree, String numero, double tarif) {
        if (dateAppel == null) throw new IllegalArgumentException("Date invalide");
        if (dateAppel.isAfter(LocalDateTime.now())) throw new IllegalArgumentException("Date invalide");
        if (duree == null) throw new IllegalArgumentException("Duree invalide");
        if (duree.isNegative() || duree.isZero()) throw new IllegalArgumentException("Duree invalide");
        if (numero == null) throw new IllegalArgumentException("Numero invalide");
        if (tarif < 0) throw new IllegalArgumentException("Tarif invalide");
        this.dateAppel = dateAppel;
        this.duree = duree;
        this.numero = numero;
        this.tarif = tarif;
    }

    public AppelTelephonique(LocalDateTime date, Duration duree, String numero) {
        this.dateAppel = date;
        this.duree = duree;
        this.numero = numero;
        this.tarif = defaultTarif;
    }

    public LocalDateTime getDate() {
        return dateAppel;
    }

    public Duration getDuree() {
        return duree;
    }

    public String getNumero() {
        return numero;
    }

    public static double getDefaultTarif() {
        return defaultTarif;
    }

    public static void setDefaultTarif(double defaultTarif) {
        AppelTelephonique.defaultTarif = defaultTarif;
    }

    public double coutAppel() {
        double cout = tarif*((int) duree.getSeconds()/60);
        return cout;
    }

    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        String infos = "Appel passé le " + formatter.format(dateAppel)+
            "\nDate d'appel : "+dateAppel+
            "\nDuree : "+duree+
            "\nNumero : "+numero+
            "\nTarif à la minute"+tarif+"€";
        return infos;
    }
}
