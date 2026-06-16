public class HolaMundo {

    public static void main(String[] args) {

        // Crear una variable de tipo String para almacenar el nombre del alumno
        String alumno = "Juan Perez";

        // Imprimir mensaje en la consola
        System.out.println("Hola Mundo Bienvenido al curso de Java, " + alumno);

        String producto = "Laptop";
        int cantidad = 5;
        double precioUnitario = 799.99;
        boolean enOferta = false;

        double total = cantidad * precioUnitario;
        System.out.println("------ TICKET DE VENTA ------");
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total A Pagar: " + total);

        if (total > 1000) {
            System.out.println("¡El producto tiene descuento!");
            System.out.println("Total A Pagar con descuento: " + (total * 0.9));
        } else {
            System.out.println("El producto no tiene descuento.");
        }
        if (enOferta) {
            System.out.println("¡El producto está en oferta!");
        } else {
            System.out.println("El producto no está en oferta.");
        }

        int edad = 8;
        edad = edad + 1; // Incrementar edad en 1
        edad++; // Incrementar nuevamente

        System.out.println("Edad del alumno: " + edad);
        boolean esMayorDeEdad = edad >= 18;

        if (esMayorDeEdad) {
            System.out.println("El alumno es mayor de edad.");
        } else if (edad == 8) {
            System.out.println("El alumno es niño.");
        } else {
            System.out.println("El alumno es menor de edad.");
        }
    }
}