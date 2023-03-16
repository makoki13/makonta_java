package com.makokienterprises.makonta.grupoEmpresas;

import com.makokienterprises.makonta.empresa.Empresa;
import com.makokienterprises.makonta.empresa.Factoria;

import java.util.List;

public class GrupoEmpresasApp {
    public static void main(String[] args) {
        GrupoEmpresas.inicializa(1, "Makoki Enterprises");
        System.out.println(GrupoEmpresas.getId() + ".- " + GrupoEmpresas.getNombre());

        Empresa empresa1 = new Empresa(1,"Makoki Games",2023,14);
        GrupoEmpresas.addEmpresa(empresa1);
        Empresa empresa2 = new Empresa(2,"Makoki Apps",2023,12);
        GrupoEmpresas.addEmpresa(empresa2);
        Empresa empresa3 = new Empresa(3,"Makoki Printers",2023,10);
        GrupoEmpresas.addEmpresa(empresa3);

        List<Empresa> empresasDelGrupo = GrupoEmpresas.getEmpresas();
        for(Empresa empresa: empresasDelGrupo) {
            System.out.println(empresa.getNombre());
        }

        Factoria factoria = new Factoria(10,"Ford", 2023, 8);
        System.out.println("digitos PC de la factoria: " + factoria.getDigitosSubcuenta());

    }
}
