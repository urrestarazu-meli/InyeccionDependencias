package inyeccion.usecases;

import inyeccion.entities.Vehiculo;

public class AcelerarVehiculo {
    public void acelerar(Vehiculo vehiculo) {
        vehiculo.setVelocidad(vehiculo.getVelocidad() + 10);
    }
}
