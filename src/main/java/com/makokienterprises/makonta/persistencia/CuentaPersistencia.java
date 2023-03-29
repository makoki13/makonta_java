package com.makokienterprises.makonta.persistencia;

import com.makokienterprises.makonta.interfaces.IPersistencia;

public class CuentaPersistencia implements IPersistencia {
    @Override
    public boolean inserta() {
        System.out.println("inserta cuenta");
        return false;
    }

    @Override
    public boolean actualiza() {
        System.out.println("actualiza cuenta");
        return false;
    }

    @Override
    public boolean borra() {
        System.out.println("borra cuenta");
        return false;
    }
}
