package Assignment_2;

import java.util.Scanner;

public class task_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name:");
        String name = sc.nextLine();

        System.out.print("Age:");
        int age = sc.nextInt();

        if (age <= 28 && age >= 18) {
            System.out.println(name + ", come to the military registartion and enlistment office");
        }
    }
}
