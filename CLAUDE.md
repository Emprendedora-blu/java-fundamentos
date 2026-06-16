# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

This is a Java learning project for IDAT IV Ciclo (Java 2 course). It uses **Maven** with **Java 17** and demonstrates OOP fundamentals, inheritance, abstract classes, and Java collections.

## Build & Run Commands

All commands run from the `java/` subdirectory (where `pom.xml` lives):

```bash
# Compile
mvn compile

# Run main application (student management menu)
mvn exec:java -Dexec.mainClass="com.idat.fundamentos.Main"

# Run collections demo
mvn exec:java -Dexec.mainClass="com.idat.colecciones.Colecciones"

# Clean build artifacts
mvn clean
```

## Package Structure & Architecture

The source root is `java/src/main/java/` with three packages:

### `com.idat.fundamentos`
Core OOP examples. `Vehiculo` is an abstract base class with `arrancar()` as an abstract method; `Auto` and `Moto` extend it. `Alumno` is a POJO with grading logic (`evaluarNota()` uses a 0–20 scale where ≥11 = Aprobado, ≥18 = Excelente).

`Main` is the active entry point — it runs a console menu for student management using `List<Alumno>`, with both traditional loops and Java Streams for filtering/aggregation. Older demo code (vehicle examples, control flow exercises) is preserved but commented out.

### `com.idat.poo`
Payment method hierarchy: `MetodoPago` (abstract) → `PagoTarjeta` and `PagoYape`. Demonstrates abstract classes as a contract for different implementations.

### `com.idat.colecciones`
Static demo methods showing `int[]`, `ArrayList`, `HashSet`, and `HashMap`. The `main()` method controls which demo runs via comments.

## Grading Scale

The system uses a 0–20 numeric scale (Peruvian education standard): ≤10 = Desaprobado, 11–17 = Aprobado, 18–20 = Excelente.

## Important Notes

- `Main.java` intentionally contains commented-out code from earlier lessons — do not delete or reorganize it without explicit instruction. The user preserves this history on purpose.
- There are no tests in this project; it is a classroom learning exercise.
