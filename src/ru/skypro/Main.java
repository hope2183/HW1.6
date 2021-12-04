package ru.skypro;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TASK 1
        int[] dailyExpenses = generateRandomArray();
        for (int i = 0; i < dailyExpenses.length; i++) {
            if (i == dailyExpenses.length - 1) {
                System.out.println(dailyExpenses[i]);
                break;
            }
            System.out.print(dailyExpenses[i] + " ");
        }
        int sum = 0;
        for (int i = 0; i < dailyExpenses.length; i++) {
            sum += dailyExpenses[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //TASK 2
        int maxDailyExpenses = -1;
        for (int dailyExpens : dailyExpenses) {
            if (dailyExpens > maxDailyExpenses) {
                maxDailyExpenses = dailyExpens;
            }
        }
        int minDailyExpenses = dailyExpenses[0];
        for (int dailyExpens : dailyExpenses) {
            if (dailyExpens < minDailyExpenses) {
                minDailyExpenses = dailyExpens;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxDailyExpenses + " рублей, а минимальная - " + minDailyExpenses + " рублей.");

        //TASK 3
        double averageDailyExpenses = sum / dailyExpenses.length;
        System.out.println("Средняя сумма трат в день в текущем месяце составила " + averageDailyExpenses + " рублей.");

        //TASK 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;

    }

}












