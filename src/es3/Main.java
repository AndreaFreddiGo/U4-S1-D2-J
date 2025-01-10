package es3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        caratteri();
    }

    public static void caratteri() {
        String str = null;
        while (!Objects.equals(str, ":q")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Inserisci una stringa:");
            str = scanner.nextLine();
            System.out.println("I caratteri della stringa inserita sono: ");
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i) + ",");

            }
        }
    }
}