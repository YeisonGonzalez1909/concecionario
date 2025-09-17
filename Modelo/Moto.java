package Modelo;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String modelo, double precio, String marca, int año, int cilindraje) {
        super(modelo, precio, marca, año);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public String toString() {
        return "Moto [cilindraje=" + cilindraje + "]";
    }


}
