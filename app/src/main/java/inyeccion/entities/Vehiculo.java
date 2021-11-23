package inyeccion.entities;

public abstract class Vehiculo {
    private static final String MARCA = "Honda";
    private int velocidad = 0;

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return MARCA;
    }
}
