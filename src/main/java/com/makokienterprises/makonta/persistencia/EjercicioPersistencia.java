package com.makokienterprises.makonta.persistencia;

import com.makokienterprises.makonta.interfaces.IPersistencia;

public class EjercicioPersistencia implements IPersistencia {
    @Override
    public boolean inserta() {
        System.out.println("inserta ejercicio");
        return false;
    }

    @Override
    public boolean actualiza() {
        System.out.println("actualiza ejercicio");
        return false;
    }

    @Override
    public boolean borra() {
        System.out.println("borra ejercicio");
        return false;
    }
}
