public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int average() {
        int numMax = sales[0];
        int numMin = sales[0];
        int sumArr = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > numMax) {
                numMax = sales[i];
            }
        }
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < numMin) {
                numMin = sales[i];
            }
        }
        int totalAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            sumArr = sumArr + sales[i];
            {
                totalAverage = (sumArr - numMin - numMax) / 3;
            }
        }
        return totalAverage;
    }
}