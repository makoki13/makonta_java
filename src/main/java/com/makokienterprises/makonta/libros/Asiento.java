package com.makokienterprises.makonta.libros;

import com.makokienterprises.makonta.cuentas.Ejercicio;
import com.makokienterprises.makonta.interfaces.IPersistencia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Asiento implements IPersistencia {
    private static long ultimoId;

    static {
        ultimoId = 0;
    }
    private long id;
    private Ejercicio ejercicio;
    private int cardinal;
    private Date fecha;
    private Date momento;
    private boolean cuadrado;
    private boolean vacio;

    private int ordinalApunte = 0;
    private List<Apunte> apuntes;

    @Override
    public boolean inserta() {
        return false;
    }

    @Override
    public boolean actualiza() {
        return false;
    }

    @Override
    public boolean borra() {
        return false;
    }

    public enum Diario {
        DEBE,
        HABER
    }

    public Asiento(Ejercicio ejercicio, Date fecha) {
        this.id = ++ultimoId;
        this.ejercicio = ejercicio;
        this.fecha = fecha;
        this.apuntes = new ArrayList<>();
    }

    public void addApunte(Apunte apunte) {
        apunte.setCardinal(++ordinalApunte);
        this.apuntes.add(apunte);
        apunte.inserta();
    }

    public List<Apunte> apuntes() {
        return this.apuntes;
    }

    public List<Apunte> apuntesEnDebe() {
        List<Apunte> lista = new ArrayList<>();
        for(Apunte apunte: this.apuntes) {
            if (apunte.getPosicion() == Diario.DEBE) {
                lista.add(apunte);
            }
        }

        return lista;
    }

    public List<Apunte> apuntesEnHaber() {
        List<Apunte> lista = new ArrayList<>();
        for(Apunte apunte: this.apuntes) {
            if (apunte.getPosicion() == Diario.HABER) {
                lista.add(apunte);
            }
        }

        return lista;
    }

    public double saldoDebe() {
        double saldo = 0;
        for(Apunte apunte: this.apuntesEnDebe()) {
            saldo += apunte.getImporte();
        }

        return saldo;
    }

    public double saldoHaber() {
        double saldo = 0;
        for(Apunte apunte: this.apuntesEnHaber()) {
            saldo += apunte.getImporte();
        }

        return saldo;
    }

    public boolean estaCuadrado() {
        return this.saldoDebe() == this.saldoHaber();
    }
}
