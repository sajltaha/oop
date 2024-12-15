package Assignment_2;

import java.util.Scanner;

public class task_3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean isHigh, isLow;
        double temp = sc.nextDouble();

        isHigh = temp > 37.5;
        isLow = temp < 36;

        if (isHigh) {
            System.out.println("Temperature high");
        }

        if (isLow) {
            System.out.println("Temperature low");
        }

        if (temp <= 37.5 && temp >= 36) {
            System.out.println("Temperature normal");
        }
    }
}
