public class test {
    public static void main(String[] args) {

        Livre l1 = new Livre("565678", "test", "test", "test", 541, 12, 2000);
        Livre l2 = new Livre("55555", "test", "test", "test", 541, 12, 2000);
        Livre l3 = new Livre("565678", "test2", "test", "test", 5415, 12, 2000);

        System.out.println(l1.equals(l2));
        System.out.println(l1.equals(l1));
        System.out.println(l1.equals(l3));
    }
}
