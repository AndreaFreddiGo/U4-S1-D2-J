package es2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numeroInLettere();
    }

    public static void numeroInLettere() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero da 0 a 3:");
        int num = Integer.parseInt(scanner.nextLine());
        switch (num) {
            case 0:
                System.out.println("Hai inserito il numero: ZERO");
                break;
            case 1:
                System.out.println("Hai inserito il numero: UNO");
                break;
            case 2:
                System.out.println("Hai inserito il numero: DUE");
                break;
            case 3:
                System.out.println("Hai inserito il numero: TRE");
                break;
            default:
                System.out.println("Numero non valido");
                scanner.close();
        }
    }
}
