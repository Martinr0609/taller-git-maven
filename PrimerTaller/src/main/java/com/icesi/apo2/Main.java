package com.icesi.apo2;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Hola, " + nombre + ". Bienvenido al sistema!");
        scanner.nextLine();

        System.out.println("Gracias" + nombre + " por haber usado el sistema!");
            scanner.close();






    }
}
