package Assignment_2;

import java.util.Scanner;

public class task_10 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int multiple = sc.nextInt();
        int sum = 0;

        for (int i = start; i < end; i++) {
            if (i % multiple != 0) {
                continue;
            }
            sum += i;
        }

        System.out.println(sum);
    }
}
