package Controlador;

import Modelo.Vehiculo;

public class Main {

    public static void main(String[] args) {

        Vehiculo[] vehiculos = new Vehiculo[3];        
        vehiculos[0] = new Vehiculo("Toyota Corolla", 25000.0, "Toyota", 2022);
        vehiculos[1] = new Modelo.Moto("Yamaha FZ", 8000.0, "Yamaha", 2023, 150);
        vehiculos[2] = new Modelo.Carro("Ford Mustang", 45000.0, "Ford", 2021, 450, 250, 4);

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }

    }
    


}
