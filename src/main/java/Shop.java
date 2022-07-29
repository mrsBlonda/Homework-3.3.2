import java.util.concurrent.atomic.LongAdder;

public class Shop {
    LongAdder revenue = new LongAdder();

    public void sumRevenue(long[] income) {
        long sum = 0;
        for (int i = 0; i < income.length; i++) {
            sum += income[i];
        }
        revenue.add(sum);

    }

    public void totalIncome() {
        System.out.println("Выручка со всез магазинов составляет: " + revenue.sum());
    }
}
