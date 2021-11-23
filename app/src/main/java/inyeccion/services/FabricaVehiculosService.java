package inyeccion.services;

import inyeccion.entities.TiposVehiculos;
import inyeccion.entities.Vehiculo;

public interface FabricaVehiculosService {

    int getContadorProduccion();

    Vehiculo fabricarAuto();

    Vehiculo fabricarMoto();

    Vehiculo fabricarBarco();

    Vehiculo fabricar(TiposVehiculos tipo);
}
