package inyeccion.entities.impl;

import inyeccion.entities.Vehiculo;

public class Auto extends Vehiculo {
    private final int ruedas = 4;

    @Override
    public String toString() {
        return "Auto {" +
                "marca= '" + this.getMarca() + '\'' +
                ", ruedas= " + ruedas +
                ", velocidad= " + this.getVelocidad() +
                '}';
    }
}
