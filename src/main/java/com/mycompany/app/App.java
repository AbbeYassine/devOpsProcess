package com.mycompany.app;

import java.util.Scanner;

public final class App {


    private App() {
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My-App is running !");
        while (true) {
            int x, y, res = 0;
            System.out.println();
            System.out.println("Choose an operator :");
            System.out.println("1) +");
            System.out.println("2) *");
            System.out.println("** Or, u may enter 0 to exit");
            int operator = scanner.nextInt();

            if (operator == 0) {
                break;
            }
            System.out.println("Entrez 2 entiers :");
            scanner.nextLine();
            x = scanner.nextInt();
            y = scanner.nextInt();
            Calcul calcul = new Calcul();
            switch (operator) {
                case 1:
                    res = calcul.additionner(x, y);
                    break;
                case 2:
                    res = calcul.multiplier(x, y);
                    break;
                // #FindBugs default statement is missing
            }

            System.out.println("resultat : " + res);
        }
    }
}
