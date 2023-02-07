public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long average() {
        long numMax = sales[0];
        long numMin = sales[0];
        long sumArr = 0;
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] > numMax) {
                numMax = sales[(int) i];
            }
        }
        for (long i = 0; i < sales.length; i++) {
            if (sales[(int) i] < numMin) {
                numMin = sales[(int) i];
            }
        }
        long totalAverage = 0;
        for (long i = 0; i < sales.length; i++) {
            sumArr = sumArr + sales[(int) i];
            {
                totalAverage = (sumArr - numMin - numMax) / 3;
            }
        }
        return totalAverage;
    }
}