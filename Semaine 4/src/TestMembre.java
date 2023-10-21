public class TestMembre {

    public static void main(String[] args) {

        Membre membre1 = new Membre("Emeline","Leconte", "0456636363");
        System.out.println(membre1.parrainInit(membre1));
        membre1.parrainInit(membre1);
        System.out.println(membre1);
        Membre membre2 = new Membre("Isabelle","Cambron", "0465363636");
        membre1.parrainInit(membre2);
        System.out.println(membre1);
        Membre membre3 = new Membre("Raphaël","Baroni","0455555555");
        membre1.parrainInit(membre3);
        System.out.println(membre1.parrainInit(membre3));
        System.out.println(membre1);
    }
}
