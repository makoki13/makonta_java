package com.makokienterprises.makonta.persistencia;

import com.makokienterprises.makonta.interfaces.IPersistencia;
import com.makokienterprises.makonta.libros.Apunte;

public class ApuntePersistencia implements IPersistencia {
    @Override
    public boolean inserta() {
        System.out.println("inserta apunte");
        return false;
    }

    @Override
    public boolean actualiza() {
        System.out.println("actualiza apunte");
        return false;
    }

    @Override
    public boolean borra() {
        System.out.println("borra apunte");
        return false;
    }
}
