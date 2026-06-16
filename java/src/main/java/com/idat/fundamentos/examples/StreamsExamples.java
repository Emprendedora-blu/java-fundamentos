package com.idat.fundamentos.examples;

import com.idat.fundamentos.Alumno;

import java.util.ArrayList;
import java.util.List;

public class StreamsExamples {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno("Juan", 20, 18));
        alumnos.add(new Alumno("Maria", 22, 15));
        alumnos.add(new Alumno("Pedro", 19, 10));
        alumnos.add(new Alumno("Richar", 34, 20));

        System.out.println("=== STREAMS EXAMPLES ===");

        System.out.println("\nFiltrar aprobados (nota > 10):");
        alumnos.stream()
                .filter(alumno -> alumno.getNota() > 10)
                .forEach(alumno -> System.out.println(alumno.mostrarInformacion()));

        long totalAprobados = alumnos.stream()
                .filter(alumno -> alumno.getNota() > 10)
                .count();
        System.out.println("Total aprobados: " + totalAprobados);

        System.out.println("\nPromedio de notas:");
        double promedio = alumnos.stream()
                .mapToInt(Alumno::getNota)
                .average()
                .orElse(0);
        System.out.println("Promedio: " + promedio);

        System.out.println("\nNota máxima:");
        int notaMax = alumnos.stream()
                .mapToInt(Alumno::getNota)
                .max()
                .orElse(0);
        System.out.println("Nota máxima: " + notaMax);

        System.out.println("\nOrdenar por nota:");
        alumnos.stream()
                .sorted((a, b) -> b.getNota() - a.getNota())
                .forEach(alumno -> System.out.println(alumno.mostrarInformacion()));
    }
}
