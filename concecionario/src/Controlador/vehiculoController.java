package Controlador;

import java.util.ArrayList;
import java.util.List;

import Modelo.Carro;
import Modelo.Moto;
import Modelo.Vehiculo;

public class vehiculoController{

    private List<Vehiculo> vehiculos;
    private int id; 

    public vehiculoController(){
        this.vehiculos = new ArrayList<>();
    }

    public Boolean agregarVehiculo( String modelo, double precio, String marca, int año, int potencia, int velocidadMax, int aceleracion){

        Carro vehiculoNuevo = new Carro(id, modelo, precio, marca, año, potencia, velocidadMax, aceleracion);

        boolean agregar = vehiculos.add(vehiculoNuevo);

        if (agregar)
        id++;

        return agregar;
    }

    public Boolean agregarVehiculo( String modelo, double precio, String marca, int año, int cilindraje){

        Moto vehiculoNuevo = new Moto(id, modelo, precio, marca, año, cilindraje);

        boolean agregar = vehiculos.add(vehiculoNuevo);

        if (agregar)
        id++;

        return agregar;

    }

}
