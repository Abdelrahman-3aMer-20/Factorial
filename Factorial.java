//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Enter The Num:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;

        for(int i = 1; i <= num; ++i) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
