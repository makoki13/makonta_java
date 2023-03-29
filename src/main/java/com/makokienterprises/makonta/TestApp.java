package com.makokienterprises.makonta;

import com.makokienterprises.makonta.cuentas.Cuenta;
import com.makokienterprises.makonta.cuentas.Ejercicio;
import com.makokienterprises.makonta.cuentas.Pgc;
import com.makokienterprises.makonta.empresa.Empresa;
import com.makokienterprises.makonta.grupoEmpresas.GrupoEmpresas;

import java.util.List;

public class TestApp {
    public static void main(String[] args) {
        Ejercicio ejercicio = new Ejercicio(2023);
        Empresa empresa = new Empresa();
        empresa.setNombre("Empresa 1");
        empresa.setEjercicioActual(ejercicio);
        Pgc planContable = new Pgc((byte) 14);

        Cuenta cuenta1 = new Cuenta();
        cuenta1.setCodigo("100");
        cuenta1.setNombre("Capital Social");
        planContable.addCuenta(cuenta1);

        Cuenta cuenta2 = new Cuenta();
        cuenta2.setCodigo("101");
        cuenta2.setNombre("Fondo Social");
        planContable.addCuenta(cuenta2);

        empresa.setPlanContable(planContable);
        GrupoEmpresas.addEmpresa(empresa);

        Ejercicio ejercicio2 = new Ejercicio(2023);
        Empresa empresa2 = new Empresa();
        empresa2.setNombre("Empresa 2");
        empresa2.setEjercicioActual(ejercicio2);
        Pgc planContable2 = new Pgc((byte) 10);

        Cuenta cuenta3 = new Cuenta();
        cuenta3.setCodigo("100");
        cuenta3.setNombre("Capital Social");
        planContable2.addCuenta(cuenta3);

        Cuenta cuenta4 = new Cuenta();
        cuenta4.setCodigo("101");
        cuenta4.setNombre("Fondo Social");
        planContable2.addCuenta(cuenta4);

        empresa2.setPlanContable(planContable2);
        GrupoEmpresas.addEmpresa(empresa2);

        List<Empresa> listaEmpresas = GrupoEmpresas.getEmpresas();
        for(Empresa emp: listaEmpresas) {
            System.out.println("emp = " + emp.getNombre());
            List<Cuenta> cuentas = emp.getPlanContable().lista();
            for(Cuenta cuenta: cuentas) {
                System.out.println("cuenta = " + cuenta.getCodigo() + ": " + cuenta.getNombre());
            }
        }
    }
}
