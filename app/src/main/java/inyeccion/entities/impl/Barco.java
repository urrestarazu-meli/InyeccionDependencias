package inyeccion.entities.impl;

import inyeccion.entities.Vehiculo;

public class Barco extends Vehiculo {
    private final int ruedas = 0;

    @Override
    public String toString() {
        return "Barco {" +
                "marca= '" + this.getMarca() + '\'' +
                ", ruedas= " + ruedas +
                ", velocidad= " + this.getVelocidad() +
                '}';
    }
}
