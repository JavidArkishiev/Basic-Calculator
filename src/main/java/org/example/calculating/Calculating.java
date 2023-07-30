package org.example.calculating;

import java.util.Scanner;

public class Calculating {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the proccecing : "
                + "\n1.Toplama"
                + "\n2.Cixma"
                + "\n3.Vurma"
                + "\n4.Bolme");
        int choose = scanner.nextInt();
        System.out.println("Enter first number");
        double a = scanner.nextDouble();
        System.out.println("Enter second number");
        double b = scanner.nextDouble();
        if (choose == 1) {
            System.out.println("result :" + (a + b));
        } else if (choose == 2) {
            System.out.println("result :" + (a - b));
        } else if (choose == 3) {
            System.out.println("result :" + (a * b));
        } else if (choose == 4) {
            System.out.println("result  :" + (a / b));
        }

    }
}
