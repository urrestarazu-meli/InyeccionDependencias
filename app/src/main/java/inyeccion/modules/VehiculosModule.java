package inyeccion.modules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import inyeccion.services.ConducirService;
import inyeccion.services.FabricaVehiculosService;
import inyeccion.services.impl.HondaService;
import inyeccion.entities.Vehiculo;
import inyeccion.entities.impl.Auto;
import inyeccion.entities.impl.Barco;
import inyeccion.entities.impl.Moto;
import inyeccion.entities.TiposVehiculos;
import inyeccion.services.impl.ConducirServiceImpl;
import inyeccion.usecases.AcelerarVehiculo;
import inyeccion.usecases.CrearVehiculo;
import inyeccion.usecases.FrenarVehiculo;

/**
 * Definicion de los enlaces (bind)
 */
public class VehiculosModule extends AbstractModule {
    @Override
    protected void configure() {
        // enlace a nuevas instancias por defecto
        bind(FabricaVehiculosService.class).toInstance(new HondaService());
        bind(CrearVehiculo.class).toInstance(new CrearVehiculo());
        bind(FrenarVehiculo.class).toInstance(new FrenarVehiculo());
        bind(AcelerarVehiculo.class).toInstance(new AcelerarVehiculo());

        // enlace a una instancia
        bind(ConducirService.class).to(ConducirServiceImpl.class);

        //Enlaces con notacion nombrada
        bind(Vehiculo.class)
                .annotatedWith(Names.named(TiposVehiculos.AUTO.toString()))
                .to(Auto.class);

        bind(Vehiculo.class)
                .annotatedWith(Names.named(TiposVehiculos.MOTO.toString()))
                .to(Moto.class);

        bind(Vehiculo.class)
                .annotatedWith(Names.named(TiposVehiculos.BARCO.toString()))
                .to(Barco.class);
    }
}
