package com.makokienterprises.makonta.cuentas;

import com.makokienterprises.makonta.empresa.Empresa;

import java.util.ArrayList;
import java.util.List;

public class PGC {
    private List<Cuenta> planGeneralContable = new ArrayList<>();
    private byte numeroDigitos = 14;

    public PGC( byte numeroDigitos) {
        this.numeroDigitos = numeroDigitos;
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
