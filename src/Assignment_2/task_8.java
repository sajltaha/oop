package Assignment_2;

public class task_8 {
    public static void main (String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            if (n % 3 != 0) {
                n++;
                continue;
            }
            sum += n;
            n++;
        }
        System.out.println(sum);
    }
}

