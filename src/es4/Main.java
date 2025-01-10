package es4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        countdown();
    }

    public static void countdown() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
        scanner.close();
    }
}

