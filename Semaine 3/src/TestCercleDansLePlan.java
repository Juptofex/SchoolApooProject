public class TestCercleDansLePlan {

    public static void main(String[] args) {

        Point point1 = new Point(4,2.5);
        CercleDansLePlan cercle1 = new CercleDansLePlan(4, point1);
        CercleDansLePlan cercle2 = new CercleDansLePlan(12.5, point1);
        System.out.println(cercle1);
        System.out.println(cercle2);
        cercle2.setCentre(8, 2.5);
        System.out.println(cercle1);
        System.out.println(cercle2);
    }
}
