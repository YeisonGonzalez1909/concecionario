package Modelo;

public class Carro extends Vehiculo{

    private int potencia; 
    private int velocidadMax;
    private int aceleracion;

    public Carro(int potencia, int velocidadMax, int aceleracion) {
        this.potencia = potencia;
        this.velocidadMax = velocidadMax;
        this.aceleracion = aceleracion;
    }
    public Carro(String modelo, double precio, String marca, int año, int potencia, int velocidadMax, int aceleracion) {
        super(modelo, precio, marca, año);
        this.potencia = potencia;
        this.velocidadMax = velocidadMax;
        this.aceleracion = aceleracion;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public int getVelocidadMax() {
        return velocidadMax;
    }
    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }
    public int getAceleracion() {
        return aceleracion;
    }
    public void setAceleracion(int aceleracion) {
        this.aceleracion = aceleracion;
    }
    @Override
    public String toString() {
        return "Carro [potencia=" + potencia + ", velocidadMax=" + velocidadMax + ", aceleracion=" + aceleracion + "]";
    } 

    

    
    
}
