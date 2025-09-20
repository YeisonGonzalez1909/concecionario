package Modelo;

public abstract class Vehiculo {
    
    private int id = 0; 
    protected String modelo;
    protected double precio; 
    protected String marca; 
    protected int año;

    public Vehiculo() {
    
    }

    public Vehiculo(int id, String modelo, double precio, String marca, int año) {
        this.id = id;
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
        this.año = año;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "Vehiculo [" + "id=" + id + ", modelo=" + modelo + ", precio=" + precio + ", marca=" + marca + ", año=" + año + "]";
    }

    



}
