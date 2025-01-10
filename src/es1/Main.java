package es1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        stringaPariDispari();
        annoBisestile();

    }

    public static void stringaPariDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una stringa:");
        String str = scanner.nextLine();
        if (str.length() % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
        scanner.close();
    }

    public static void annoBisestile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un anno:");
        int anno = Integer.parseInt(scanner.nextLine());
        if (anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);

        }
        scanner.close();
    }

}