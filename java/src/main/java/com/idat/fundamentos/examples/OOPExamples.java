package com.idat.fundamentos.examples;

import com.idat.fundamentos.Auto;
import com.idat.fundamentos.Moto;
import com.idat.fundamentos.Vehiculo;
import com.idat.poo.PagoYape;

public class OOPExamples {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Vehiculo miVehiculo = new Auto();
        miVehiculo.setMarca("Toyota");
        miVehiculo.setVelocidad(120.5);
        System.out.println("Marca del vehículo: " + miVehiculo.getMarca());
        System.out.println("Velocidad del vehículo: " + miVehiculo.getVelocidad() + " km/h");

        Vehiculo miAuto = new Auto();
        miAuto.setMarca("Honda");
        miAuto.arrancar();

        Vehiculo miMoto = new Moto();
        miMoto.setMarca("Yamaha");
        miMoto.arrancar();

        PagoYape pagoYape = new PagoYape();
        pagoYape.setNumeroYape("987654321");
        pagoYape.pagar(150.75);
    }
}
