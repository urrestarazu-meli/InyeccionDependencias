package inyeccion.usecases;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;
import inyeccion.entities.TiposVehiculos;
import inyeccion.entities.Vehiculo;
import inyeccion.modules.VehiculosModule;

public class CrearVehiculo {

    public Vehiculo crear(TiposVehiculos tipo) {
        Injector injector = Guice.createInjector(new VehiculosModule());

        //Obtiene una instancia enlacazada con un nombre
        return injector.getInstance(Key.get(Vehiculo.class, Names.named(tipo.toString())));
    }
}
