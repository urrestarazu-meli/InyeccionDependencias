package inyeccion.services.impl;

import com.google.inject.Inject;
import inyeccion.entities.Vehiculo;
import inyeccion.services.ConducirService;
import inyeccion.usecases.AcelerarVehiculo;
import inyeccion.usecases.FrenarVehiculo;

public class ConducirServiceImpl implements ConducirService {
    //Inyeccion en la declaracion de la variable
    @Inject
    AcelerarVehiculo motor;

    @Inject
    FrenarVehiculo paracaidas;

    @Override
    public void conducir(Vehiculo vehiculo) {


        System.out.println("Conduciendo..");

        //Lo hacemos acelerar
        for (int i = 0; i < 5; i++) {
            motor.acelerar(vehiculo);

            System.out.println(vehiculo.toString());
        }

        //lo frenamos
        paracaidas.frenar(vehiculo);
        System.out.println(vehiculo.toString());

        System.out.println("Me detuve..");
    }
}
