import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter an integer: ");

        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();
        System.out.println(factorial(num));
    }

    public static int factorial(int n) {
        if(n == 1) {
            return 1;
        } else {

            return n * factorial(n-1);
        }
    }

}
