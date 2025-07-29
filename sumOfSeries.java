
import java.util.*;

public class sumOfSeries{

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static double sumseries(int n) {
        double sum = 0;
        if (n == 1) {
            return 1;
        }
        if (n % 2 == 0) {
            sum -= 1.0 / factorial(n);
        }
        if (n % 2 != 0 && n != 1) {
            sum += 1.0 / factorial(n);
        }
        return sum + sumseries(n - 1);
    }

    public static void printseries(int n) {
        if (n == 1) {
            System.out.print("1");
            return;
        }
        String x;
        if (n % 2 == 0) {
            x = "-1";
        } else {
            x = "+1";
        }
        printseries(n - 1);
        System.out.print(x + "/" + n + "!");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("enter the number of terms of series:");
            int n = sc.nextInt();
            System.out.print("respective terms of the series:");
            printseries(n);
            System.out.println();
            System.out.println("sum of series:" + sumseries(n));
        }
    }
}
