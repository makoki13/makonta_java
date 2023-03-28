package com.makokienterprises.makonta;

import com.makokienterprises.makonta.cuentas.Cuenta;
import com.makokienterprises.makonta.cuentas.Ejercicio;
import com.makokienterprises.makonta.cuentas.PGC;
import com.makokienterprises.makonta.empresa.Empresa;
import com.makokienterprises.makonta.grupoEmpresas.GrupoEmpresas;
import com.makokienterprises.makonta.libros.Apunte;
import com.makokienterprises.makonta.libros.Asiento;

import java.util.Date;
import java.util.List;

public class TestAsiento {
    static {
        cargaSimulada();
    }
    public static void main(String[] args) {
        Empresa empresa = GrupoEmpresas.getEmpresa(1);
        Ejercicio ejercicio = empresa.getEjercicioActual();

        Cuenta cuenta1 = empresa.getPlanContable().getCuenta("100");
        Cuenta cuenta2 = empresa.getPlanContable().getCuenta("101");

        Apunte apunte1 = new Apunte(cuenta1, 600.0, Asiento.Diario.DEBE,"Ingreso en banco");
        Apunte apunte2 = new Apunte(cuenta2,600.0, Asiento.Diario.HABER,"Sacar de caja");

        Cuenta cuenta3 = empresa.getPlanContable().getCuenta("102");

        Apunte apunte3 = new Apunte(cuenta3, 50.0, Asiento.Diario.DEBE,"Impuestos");
        Apunte apunte4 = new Apunte(cuenta2,50.0, Asiento.Diario.HABER,"Sacar de caja");

        Asiento asiento = new Asiento(ejercicio,new Date());
        asiento.addApunte(apunte1);
        asiento.addApunte(apunte2);
        asiento.addApunte(apunte3);
        asiento.addApunte(apunte4);

        //asiento.borraApunte(apunte4.getCardinal());



        System.out.println("DEBE:");
        for(Apunte apunte: asiento.apuntesEnDebe()) {
            System.out.println("cuenta : " + apunte.getCuenta().getNombre() +  " --- importe: " + apunte.getImporte());
        }
        System.out.println("HABER:");
        for(Apunte apunte: asiento.apuntesEnHaber()) {
            System.out.println("cuenta : " + apunte.getCuenta().getNombre() +  " --- importe: " + apunte.getImporte());
        }
        System.out.println("SALDOS:");
        System.out.println("saldo debe = " + asiento.saldoDebe() +"\t" + "saldo haber = " + asiento.saldoHaber());
        System.out.println("DIFERENCIA:" + (asiento.saldoDebe() - asiento.saldoHaber()) );
        if (asiento.estaCuadrado()) {
            System.out.println("CORRECTO");
        }
        else {
            System.out.println("DESCUADRADO");
        }

        System.out.println("Fin del módulo de prueba");
    }

    private static void cargaSimulada() {
        Ejercicio ejercicio = new Ejercicio(2023);
        Empresa empresa = new Empresa();
        empresa.setNombre("Empresa 1");
        empresa.setEjercicioActual(ejercicio);
        PGC planContable = new PGC((byte) 14);

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setCodigo("100");
        cuenta1.setNombre("Capital Social");
        planContable.addCuenta(cuenta1);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setCodigo("101");
        cuenta2.setNombre("Fondo Social");
        planContable.addCuenta(cuenta2);

        Cuenta cuenta3 = new Cuenta();
        cuenta3.setCodigo("102");
        cuenta3.setNombre("Impuestos");
        planContable.addCuenta(cuenta3);

        empresa.setPlanContable(planContable);
        GrupoEmpresas.addEmpresa(empresa);
    }
}
