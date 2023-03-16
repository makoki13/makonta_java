package com.makokienterprises.makonta.empresa;

public class Factoria extends Empresa {
    public Factoria(int id, String nombre, int ejercicioActual, int digitosSubcuenta) {
        super();
        //super(id, nombre, ejercicioActual, digitosSubcuenta);
        System.out.println("Se crea la factoria");
    }

    @Override
    public int getDigitosSubcuenta() {
        return 10;
    }
}
