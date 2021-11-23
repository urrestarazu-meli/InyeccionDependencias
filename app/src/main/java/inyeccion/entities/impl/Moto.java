package inyeccion.entities.impl;

import inyeccion.entities.Vehiculo;

public class Moto extends Vehiculo {
    private final int ruedas = 2;

    @Override
    public String toString() {
        return "Moto {" +
                "marca= '" + this.getMarca() + '\'' +
                ", ruedas= " + ruedas +
                ", velocidad= " + this.getVelocidad() +
                '}';
    }
}
