public class Main {
    public static void main(String[] args) {
        SalesManager user1 = new SalesManager(new long[]{100, 55, 200, 74});
        System.out.println("Максимальная сумма продажи составила: " + user1.max());
    }
}