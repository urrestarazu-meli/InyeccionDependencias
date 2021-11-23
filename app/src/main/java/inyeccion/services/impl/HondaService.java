package inyeccion.services.impl;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import inyeccion.entities.Vehiculo;
import inyeccion.entities.impl.Auto;
import inyeccion.entities.TiposVehiculos;
import inyeccion.modules.VehiculosModule;
import inyeccion.services.FabricaVehiculosService;
import inyeccion.usecases.CrearVehiculo;

//@Singleton
public class HondaService implements FabricaVehiculosService {
    private int contadorProduccion = 0;

    @Inject
    CrearVehiculo robot;

    public int getContadorProduccion() {
        return contadorProduccion;
    }

    public Vehiculo fabricarAuto() {
        contadorProduccion++;

        Injector injector = Guice.createInjector(new VehiculosModule());
        return injector.getInstance(Auto.class);
    }

    public Vehiculo fabricarMoto() {
        contadorProduccion++;

        return robot.crear(TiposVehiculos.MOTO);
    }

    public Vehiculo fabricarBarco() {
        contadorProduccion++;

        return robot.crear(TiposVehiculos.BARCO);
    }

    public Vehiculo fabricar(TiposVehiculos tipo) {
        contadorProduccion++;

        return robot.crear(tipo);
    }
}
