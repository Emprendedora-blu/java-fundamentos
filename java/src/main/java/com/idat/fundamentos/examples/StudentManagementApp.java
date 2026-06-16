package com.idat.fundamentos.examples;

import com.idat.fundamentos.Alumno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagementApp {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Alumno> alumnos = crearAlumnos();
        mostrarMenu(alumnos);
    }

    private static List<Alumno> crearAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("Juan", 20, 18);
        Alumno alumno2 = new Alumno("Maria", 22, 15);
        Alumno alumno3 = new Alumno("Pedro", 19, 10);
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(new Alumno("Richar", 34, 20));
        return alumnos;
    }

    private static void mostrarMenu(List<Alumno> alumnos) {
        int opcion = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println();
                System.out.println("=== SISTEMA DE GESTION DE ALUMNOS ===");
                System.out.println("1. Mostar alumnos");
                System.out.println("2. Mostar aprobados");
                System.out.println("3. Mostrar desaprobados");
                System.out.println("4. Mostrar promedio de notas");
                System.out.println("5. Salir");
                try {
                    System.out.print("Seleccione una opción: ");
                    opcion = scanner.nextInt();
                    switch (opcion) {
                        case 1:
                            mostrarAlumnos(alumnos);
                            break;
                        case 2:
                            mostrarAprobados(alumnos);
                            break;
                        case 3:
                            mostrarDesaprobados(alumnos);
                            break;
                        case 4:
                            mostrarPromedioNotas(alumnos);
                            break;
                        case 5:
                            System.out.println("Saliendo del programa...");
                            break;
                        default:
                            System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 4.");
                            break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                    scanner.next(); // Limpiar el buffer
                    continue; // Volver al inicio del bucle
                }

            } while (opcion != 5);
        }
    }

    private static void mostrarAlumnos(List<Alumno> alumnos) {
        System.out.println("Lista de alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.mostrarInformacion());
        }
    }

    private static void mostrarAprobados(List<Alumno> alumnos) {
        System.out.println("Alumnos aprobados:");
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() > 10) {
                System.out.println(alumno.mostrarInformacion());
            }
        }

        //uso de streams
        long contadorAprobados = alumnos.stream().filter(alumno -> alumno.getNota() > 10).count();
        System.out.println("Total de aprobados: " + contadorAprobados);
        System.out.println("Alumnos aprobados (usando streams):");
        alumnos.stream().filter(alumno -> alumno.getNota() > 10)
                .forEach(alumno -> System.out.println(alumno.mostrarInformacion()));
    }

    private static void mostrarDesaprobados(List<Alumno> alumnos) {
        System.out.println("Alumnos desaprobados:");
        for (Alumno alumno : alumnos) {
            if (alumno.getNota() <= 10) {
                System.out.println(alumno.mostrarInformacion());
            }
        }
    }

    private static void mostrarPromedioNotas(List<Alumno> alumnos) {
        double promedio = alumnos.stream().mapToInt(Alumno::getNota).average().orElse(0);
        System.out.println("Promedio de notas: " + promedio);
    }
}
