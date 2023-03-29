package com.makokienterprises.makonta.persistencia;

import com.makokienterprises.makonta.interfaces.IPersistencia;

public class PgcPersistencia implements IPersistencia {
    @Override
    public boolean inserta() {
        System.out.println("inserta PGC");
        return false;
    }

    @Override
    public boolean actualiza() {
        System.out.println("actualiza PGC");
        return false;
    }

    @Override
    public boolean borra() {
        System.out.println("borra PGC");
        return false;
    }
}
