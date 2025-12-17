package feature.CoreProgramming.JavaArrays.level2;

import java.util.Scanner;

class SumAverageArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        double[] arr = new double[size];

        double sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        double average = sum / arr.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        sc.close();
    }
}