package org.example;

import java.util.Scanner;

public class FiveNumberStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int index = 0;
        int summ = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        while(index < 5){
            System.out.printf("Please input the %dth number:", index + 1);
            int number = scanner.nextInt();
            array[index++] = number;
            summ += number;
            if(number > max) max = number;
            if(number < min) min = number;
        }
        System.out.printf("The sum of the array is %d\n", summ);
        System.out.printf("The largest of the array number is %d\n", max);
        System.out.printf("The smallest of the array number is %d\n", min);

    }
}
