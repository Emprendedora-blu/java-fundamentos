package com.idat.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.idat.fundamentos.Alumno;

public class Colecciones {

    public static void EjemploArray() {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en posición " + i + ": " + numeros[i]);
        }
        String[] cursos = {"Java", "Python", "JavaScript"};
        for (String curso : cursos) {
            System.out.println("Curso: " + curso);
        }
    }

    public static void ejemploArrayList() {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        System.out.println("Frutas Indice 1: " + frutas.get(1));
        frutas.remove("Banana");
        System.out.println("Frutas después de eliminar Banana: " + frutas);
        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }
    }

    public static void ejemploHashSet() {
        System.out.println("=== Ejemplo HashSet ===");

        Set<String> cursos = new HashSet<>();

        // Agregar elementos
        cursos.add("Java");
        cursos.add("Python");
        cursos.add("JavaScript");
        cursos.add("Java"); // duplicado: HashSet lo ignora automáticamente
        cursos.add("SQL");

        System.out.println("Cursos registrados: " + cursos);
        System.out.println("Total de cursos (sin duplicados): " + cursos.size());

        // Verificar si un elemento existe
        System.out.println("¿Existe Java? " + cursos.contains("Java"));
        System.out.println("¿Existe PHP? " + cursos.contains("PHP"));

        // Recorrer el HashSet
        System.out.println("--- Lista de cursos ---");
        for (String curso : cursos) {
            System.out.println("  Curso: " + curso);
        }

        // Eliminar un elemento
        cursos.remove("SQL");
        System.out.println("Cursos después de eliminar SQL: " + cursos);

        // Unión de dos conjuntos
        Set<String> cursosTarde = new HashSet<>();
        cursosTarde.add("Java");
        cursosTarde.add("Diseño Web");
        cursosTarde.add("Base de Datos");

        Set<String> union = new HashSet<>(cursos);
        union.addAll(cursosTarde);
        System.out.println("Unión de cursos: " + union);

        // Intersección (cursos en común)
        Set<String> interseccion = new HashSet<>(cursos);
        interseccion.retainAll(cursosTarde);
        System.out.println("Cursos en común: " + interseccion);
    }

    public static void ejemploHashMap() {
        Map<String, Alumno> alumnosByKey = new HashMap<>();
        alumnosByKey.put("Juan", new Alumno("Juan", 25, 10));
        alumnosByKey.put("Maria", new Alumno("Maria", 30, 15));
        alumnosByKey.put("Pedro", new Alumno("Pedro", 20, 5));

        Map<String, Integer> edades = new HashMap<>();
        edades.put("Juan", 25);
        edades.put("Maria", 30);

        System.out.println("Edad de Maria: " + edades.get("Maria"));
        alumnosByKey.remove("Pedro");
        System.out.println("Edades después de eliminar a Pedro: " + edades);
    }

    public static void main(String[] args) {
        ejemploHashSet();
    }

}
