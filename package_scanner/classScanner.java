package package_scanner;

import java.util.Scanner;

public class classScanner {
    public static void main(String[] args) {
        System.out.println("Please enter your name: ");
        Scanner dannyScanner = new Scanner(System.in);
        String nombreIngresado = dannyScanner.nextLine();

        System.out.println("Hello, " + nombreIngresado);
    }
}
