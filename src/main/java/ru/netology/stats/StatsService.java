package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }


    public int calculateAverage(int[] sales) {
        return calculateSum(sales) / sales.length;

    }

    public int minSales(int[] sales) {
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

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int amountMounthWhichMinSales(int[] items) {
        int average = calculateAverage(items);
        int count = 0;
        for (int item : items) {
            if (item > average) {
                count++;
            }
        }
        return count;
    }

    public int amountMounthWhichMaxSales(int[] items) {
        int average = calculateAverage(items);
        int count = 0;
        for (int item : items) {
            if (item < average) {
                count++;
            }
        }
        return count;
    }
}