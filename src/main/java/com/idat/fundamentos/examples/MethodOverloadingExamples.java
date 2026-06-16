package com.idat.fundamentos.examples;

public class MethodOverloadingExamples {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("===== EJEMPLOS DE METHOD OVERLOADING =====");
        demonstrateGreetingOverloading();
        System.out.println("\n===== EJEMPLOS DE SOBRECARGA CON DIFERENTES TIPOS =====");
        demonstrateOtherOverloading();
    }

    public static void demonstrateGreetingOverloading() {
        System.out.println("\n--- Sobrecarga de método: saludar() ---\n");

        System.out.println("1. saludar() sin parámetros:");
        saludar();

        System.out.println("\n2. saludar(String nombre):");
        saludar("Richard");

        System.out.println("\n3. saludar(int edad):");
        saludar(34);

        System.out.println("\n4. saludar(String nombre, int edad):");
        saludar("María", 25);

        System.out.println("\nConcepto: El mismo nombre de método, diferentes parámetros");
        System.out.println("Java elige qué versión ejecutar basándose en los argumentos");
    }

    public static void demonstrateOtherOverloading() {
        System.out.println("\n--- Otras sobrecargas numéricas ---\n");

        System.out.println("1. sumar(int, int):");
        System.out.println("sumar(5, 3) = " + sumar(5, 3));

        System.out.println("\n2. sumar(double, double):");
        System.out.println("sumar(5.5, 3.2) = " + sumar(5.5, 3.2));

        System.out.println("\n3. sumar(int, int, int) - tres parametros:");
        System.out.println("sumar(5, 3, 2) = " + sumar(5, 3, 2));
    }

    public static void saludar() {
        System.out.println("Hola, alumnos");
    }

    public static void saludar(String nombre) {
        System.out.println("Hola, " + nombre + "!");
    }

    public static void saludar(int edad) {
        System.out.println("Hola, tienes " + edad + " años.");
    }

    public static void saludar(String nombre, int edad) {
        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años.");
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
