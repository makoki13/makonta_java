package com.makokienterprises.makonta.persistencia;

import com.makokienterprises.makonta.interfaces.IPersistencia;

public class EmpresaPersistencia implements IPersistencia {
    @Override
    public boolean inserta() {
        System.out.println("inserta empresa");
        return false;
    }

    @Override
    public boolean actualiza() {
        System.out.println("actualiza empresa");
        return false;
    }

    @Override
    public boolean borra() {
        System.out.println("borra empresa");
        return false;
    }
}
