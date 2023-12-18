import java.time.LocalDate;

public class Voiture extends Vehicule {
    public int dureAvantPremierCT=4,dureeMaxEntreCT=1;
    public Voiture(String nChassis, String immatriculation, LocalDate dateMiseCirculation) {
        super(nChassis, immatriculation, dateMiseCirculation);
    }

    @Override
    public boolean ordreControleTech() {
        int anneeActuelle = LocalDate.now().getYear();
        if ((anneeActuelle-getDateMiseCirculation().getYear()) < dureAvantPremierCT && getDernierControleTech() == getDateMiseCirculation())
            return true;
        return anneeActuelle - getDernierControleTech().getYear() < dureeMaxEntreCT;
    }

    @Override
    public String toString() {
        return "Voiture : " +
                "\nNumeros de chassis : "+getnChassis()+
                "\nImmatriculation : "+getImmatriculation()+
                "\nDate de Mise en Circulation : "+getDateMiseCirculation()+
                "\nDate de dernier Controle technique : "+getDernierControleTech()+
                "\nKilometrage : "+getKilometrage()+
                "\nEn ordre de Controle technique : "+ordreControleTech();
    }
}
