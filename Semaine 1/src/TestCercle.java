public class TestCercle {

    public static void main(String[] args) {
        Cercle cercle1 = new Cercle(10.4);
        Cercle cercle2 = new Cercle(25);
        Cercle cercle3 = new Cercle(125.63);

        System.out.println("Rayon du cercle 1 : "+cercle1.rayon);
        System.out.println("Aire du cercle 2 : "+cercle2.calculerAire());
        System.out.println(cercle3);
    }
}
