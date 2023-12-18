import java.time.LocalDate;

public class Utilitaire extends Vehicule {

    private int kilometrageMaxControlDefault=50000,kilometrageMaxControle,kilometrageDernierControle;

    public Utilitaire(String nChassis, String immatriculation, LocalDate dateMiseCirculation, int kilometrageMaxControle ) {
        super(nChassis, immatriculation, dateMiseCirculation);
        if (nChassis == null || immatriculation == null || dateMiseCirculation == null)
            throw new IllegalArgumentException();
        this.kilometrageMaxControle = kilometrageMaxControle;
    }

    public Utilitaire(String nChassis, String immatriculation, LocalDate dateMiseCirculation) {
        super(nChassis, immatriculation, dateMiseCirculation);
        kilometrageMaxControle = kilometrageMaxControlDefault;
    }

    @Override
    public boolean ordreControleTech() {
        return kilometrageMaxControle-getKilometrage() < kilometrageMaxControle;
    }

    @Override
    public String toString() {
        return "Utilitaire : " +
                "\nNumeros de chassis : "+getnChassis()+
                "\nImmatriculation : "+getImmatriculation()+
                "\nDate de Mise en Circulation : "+getDateMiseCirculation()+
                "\nDate de dernier Controle technique : "+getDernierControleTech()+
                "\nKilometrage : "+getKilometrage()+
                "\nEn ordre de Controle technique : "+ordreControleTech();
    }
}
