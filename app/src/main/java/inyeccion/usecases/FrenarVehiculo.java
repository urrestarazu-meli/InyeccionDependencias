package inyeccion.usecases;

import inyeccion.entities.Vehiculo;

public class FrenarVehiculo {
    public void frenar(Vehiculo vehiculo) {
        vehiculo.setVelocidad(0);
    }
}
