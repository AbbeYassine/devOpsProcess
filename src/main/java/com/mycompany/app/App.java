package com.mycompany.app;

import java.util.Scanner;

public final class App {


    private App() {
    }

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("My-App is running !");
        int x, y, res = 0;
        System.out.println("Choisissez un operateur :");
        System.out.println("1) +");
        System.out.println("2) *");
        int operator = scanner.nextInt();

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
        }


        System.out.println("resultat : " + res);
    }
}
