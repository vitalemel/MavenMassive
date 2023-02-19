package ru.netology.stats;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StatsServiceTest {


    @Test
    public void minSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void maxSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }
    @Test
    public void TestSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum= 180;
        long actualSum = service.allMonthSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }
    @Test
    public void  ShouldAverage(){

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverage= 15;
        long actualAverage= service.average(sales);
         Assertions.assertEquals(expectedAverage,actualAverage);
    }

    @Test
    public void  ShouldBellowAverage(){

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected= 5;
        long actual= service.saleBellowAverage(sales);
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void  ShouldHigherAverage(){

        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected= 5;
        long actual= service.saleHigherAverage(sales);
        Assertions.assertEquals(expected,actual);
    }

}