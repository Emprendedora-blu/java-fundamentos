package com.idat.fundamentos.examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExamplesMenu {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int opcion = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println();
                System.out.println("=== MENU DE EJEMPLOS ===");
                System.out.println("1. Control Flow Examples");
                System.out.println("2. OOP Examples");
                System.out.println("3. Method Overloading Examples");
                System.out.println("4. Streams Examples");
                System.out.println("5. Student Management");
                System.out.println("6. Salir");
                try {
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            ControlFlowExamples.run();
                            break;
                        case 2:
                            OOPExamples.run();
                            break;
                        case 3:
                            MethodOverloadingExamples.run();
                            break;
                        case 4:
                            StreamsExamples.run();
                            break;
                        case 5:
                            StudentManagementApp.run();
                            break;
                        case 6:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                    scanner.next();
                }
            } while (opcion != 6);
        }
    }
}
