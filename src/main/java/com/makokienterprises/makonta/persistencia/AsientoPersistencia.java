package com.makokienterprises.makonta.persistencia;

import com.makokienterprises.makonta.interfaces.IPersistencia;
import com.makokienterprises.makonta.libros.Asiento;

public class AsientoPersistencia implements IPersistencia {
    @Override
    public boolean inserta() {
        System.out.println("inserta asiento");
        return false;
    }

    @Override
    public boolean actualiza() {
        System.out.println("actualiza asiento");
        return false;
    }

    @Override
    public boolean borra() {
        System.out.println("borra asiento");
        return false;
    }
}
