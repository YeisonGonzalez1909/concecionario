package Modelo;

public class Vehiculo {
    
    protected String modelo;
    protected double precio; 
    protected String marca; 
    protected int año;

    public Vehiculo() {
    }

    public Vehiculo(String modelo, double precio, String marca, int año) {
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.año = año;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo [modelo=" + modelo + ", precio=" + precio + ", marca=" + marca + ", año=" + año + "]";
    }

    



}
