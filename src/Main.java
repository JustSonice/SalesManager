public class Main {
    public static void main(String[] args) {
        SalesManager user1 = new SalesManager(new int[]{100, 55, 200, 74});
        System.out.println("Максимальная сумма продажи составила: " + user1.max());
        System.out.println("Расчет обрезанного среднего: " + user1.average());
    }
}