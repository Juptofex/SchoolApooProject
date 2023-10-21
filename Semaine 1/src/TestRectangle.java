public class TestRectangle {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(3, 5);
        Rectangle rectangle2 = new Rectangle(6, 10);
        Rectangle rectangle3 = new Rectangle(2, 8);

        System.out.println("Aire du rectangle 1 : "+rectangle1.calculerAire());
        System.out.println("Perimetre du rectangle 2 : "+rectangle2.calculerPerimetre());
        System.out.println(rectangle3);
    }
}
