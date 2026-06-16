package com.idat.fundamentos.examples;

public class ControlFlowExamples {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        ejemploOperadorTernario(10);
        ejemploSwitch();
        ejemploFor();
        ejemploWhile();
        ejemploTryCatch();
    }

    public static void ejemploOperadorTernario(int numero) {
        String resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es: " + resultado);
    }

    public static void ejemploSwitch() {
        /*ESTRUCTURA SWITCH*/
        System.out.println("Ejemplo de estructura SWITCH:");
        int dia = 7;
        switch (dia) {
            case 1, 2, 3, 4, 5:
                System.out.println("Es un dia laboral");
                break;
            case 6, 7:
                System.out.println("Es fin de semana");
                break;
            default:
                System.out.println("Dia no valido");
        }

        String estado = "ENTREGADO";
        switch (estado) {
            case "EN_CAMINO":
                System.out.println("El pedido esta en camino");
                break;
            case "ENTREGADO":
                System.out.println("El pedido ha sido entregado");
                break;
            default:
                System.out.println("Estado no reconocido");
        }

        int statusCode = 404;
        String mensaje = switch (statusCode) {
            case 200 -> "OK";
            case 404 -> "Not Found";
            case 500 -> "Internal Server Error";
            default  -> "Unknown Status";
        };
        System.out.println("El mensaje para el código de estado " + statusCode + " es: " + mensaje);
    }

    public static void ejemploFor() {
        /*BUCLES FOR*/
        System.out.println("Ejemplo de bucle FOR:");
        String[] productos = {"Laptop", "Smartphone", "Tablet"};
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i]);
        }
        for (String producto : productos) {
            System.out.println("Producto: " + producto);
        }
    }

    public static void ejemploWhile() {
        /*BUCLES WHILE */
        System.out.println("Ejemplo de bucle WHILE:");
        boolean conectado = false;
        int intentos = 0;
        while (!conectado && intentos < 3) {
            System.out.println("Intentando conectar... Intento #" + (intentos + 1));
            intentos++;
            if (intentos == 3) {
                conectado = true;
            }
        }
        System.out.println("CONECTADO.");

        /*BUCLES DO WHILE */
        System.out.println("Ejemplo de bucle DO WHILE:");
        boolean desconectado = true;
        int intentosDesconexion = 0;
        do {
            System.out.println("Desconectando... Intento #" + (intentosDesconexion + 1));
            intentosDesconexion++;
            if (intentosDesconexion == 3) {
                desconectado = false;
            }
        } while (desconectado);
        System.out.println("DESCONECTADO.");
    }

    public static void ejemploTryCatch() {
        try {
            int resultado = 10 / 0;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }
}
