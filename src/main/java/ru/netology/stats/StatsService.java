package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public long allMonthSum(long[] sales) {

         long result = 0;
        for (long sale : sales) {
            result  += sale;
        }
        return result;
    }
    public long average(long[] sales){

        return allMonthSum(sales)/sales.length;
    }


    public  int saleBellowAverage(long[]sales){
        int counter =0;
        for(long sale: sales){
            if (sale < average(sales)){
                counter++;
            }
        }
        return  counter;
    }

    public  int saleHigherAverage(long[]sales){
        int counter =0;
        for(long sale: sales){
            if (sale > average(sales)){
                counter++;
            }
        }
        return  counter;
    }
}
