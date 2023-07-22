package ru.netology.javaqa.javaqamvn.services;
public class StatsService {

    public static int calculateSum(int[] sales) {
        int sum = 0;
        for (int num : sales) {
            sum = sum + num;
        }
        return sum;
    }


    public static int getAverage(int[] sales) {
        int sum = calculateSum(sales);
        int average = sum / sales.length;
        return average;
    }

    public static int getMaxSales(int[] sales) {
        int maxMonth = sales[0];
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public static int getMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public static int getAboveAverage(int[] sales) {
        int monthAboveAverage = sales[0];
        int month = 0;
        int average = getAverage(sales);
        for (int sale : sales) {
            if (sales[0] < average){
                monthAboveAverage = month;
            }
            month = month = month +1;
        }
        return monthAboveAverage +1;
    }

    public static int getBelowAverage(int[] sales) {
        int monthBelowAverage = sales[0];
        int month = 0;
        int average = getAverage(sales);
        for (int sale : sales) {
            if (sales[0] < average){
                monthBelowAverage = month;
            }
            month = month = month +1;
        }
        return monthBelowAverage +1;
    }


}



