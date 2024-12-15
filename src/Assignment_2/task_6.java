package Assignment_2;

import java.util.Scanner;

public class task_6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            n += x;
        }

        System.out.println(n);
    }
}
