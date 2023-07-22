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
        int average = getAverage(sales);
        int monthAboveAverage = 0;
        for (int sale : sales) {
            if (average < sale){
              monthAboveAverage += 1;
            }
        }
        return monthAboveAverage;
    }

    public static int getBelowAverage(int[] sales) {
        int average = getAverage(sales);
        int monthBelowAverage = 0;
        for (int sale : sales) {
            if (average < sale){
                monthBelowAverage += 1;
            }
        }
        return monthBelowAverage;
    }


}



