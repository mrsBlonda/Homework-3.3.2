public class Main {
    public static void main (String[] args) throws InterruptedException {

        Shop shop = new Shop();

        long[] count1 = new long[]{2000, 2000, 3000};
        long[] count2 = new long[]{1000, 1000, 1000};
        long[] count3 = new long[]{2000, 2000, 2000};

        Thread shop1 = new Thread(null,() -> shop.sumRevenue(count1) , "Магазин 1");
        Thread shop2 = new Thread(null,() -> shop.sumRevenue(count2) , "Магазин 2");
        Thread shop3 = new Thread(null,() -> shop.sumRevenue(count3) , "Магазин 3");

        shop1.start();
        shop2.start();
        shop3.start();

        shop3.join();
        shop2.join();
        shop1.join();

        shop.totalIncome();

    }
}
