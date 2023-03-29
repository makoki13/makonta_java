package com.makokienterprises.makonta.cuentas;

import com.makokienterprises.makonta.persistencia.PgcPersistencia;

import java.util.ArrayList;
import java.util.List;

public class Pgc extends PgcPersistencia {
    private static int ultimaEmpresa;
    static {
        ultimaEmpresa = 0 ; //TODO get from database
    }

    private long id;
    private List<Cuenta> planGeneralContable = new ArrayList<>();
    private byte numeroDigitos;

    public Pgc() {
        this((byte)14);
    }

    public Pgc(byte numeroDigitos) {
        this.id = ++numeroDigitos;
        this.numeroDigitos = numeroDigitos;

        //this.inserta();
    }

    public void addCuenta(Cuenta cuenta) {
        planGeneralContable.add(cuenta);
    }

    public List<Cuenta> lista() {
        return planGeneralContable;
    }

    public boolean existeCuenta(String codigo) {
        for(Cuenta c: planGeneralContable) {
            if (c.getCodigo().trim() == codigo.trim()) {
                return true;
            }
        }

        return false;
    }

    public Cuenta getCuenta(String codigo) {
        for(Cuenta c: planGeneralContable) {
            if (c.getCodigo().trim() == codigo.trim()) {
                return c;
            }
        }

        return null;
    }

    public byte getNumeroDigitos() {
        return numeroDigitos;
    }
}
