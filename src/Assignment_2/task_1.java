package Assignment_2;

import java.util.Scanner;

public class task_1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите температуру:");
        int temp = sc.nextInt();

        if (temp > 0) {
            System.out.println("it’s warm outside");
        }
        else {
            System.out.println("it’s cold outside");
        }
    }
}
