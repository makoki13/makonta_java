package com.makokienterprises.makonta.grupoEmpresas;

import com.makokienterprises.makonta.empresa.Empresa;
import com.makokienterprises.makonta.interfaces.IPersistencia;
import com.makokienterprises.makonta.persistencia.GrupoEmpresasPersistencia;

import java.util.*;

public class GrupoEmpresas extends GrupoEmpresasPersistencia {
    private static long ultimoId;

    static {
        ultimoId = 0;
    }
    private static long id;
    private static String nombre;

    private static List<Empresa> empresas = new ArrayList<Empresa>();


    public static void inicializa(String nombreGrupo) {
        id = ++ultimoId;
        nombre = nombreGrupo;
        //GrupoEmpresas.inserta();
    }

    public static long getId() {
        return id;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setId(int idGrupo) {
        id = idGrupo;
    }

    public static void setNombre(String nombreGrupo) {
        nombre = nombreGrupo;
    }

    @Override
    public String toString() {
        return "GrupoEmpresas{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public static void addEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public static List<Empresa> getEmpresas() {
        return empresas;
    }

    public static Empresa getEmpresa(long id) {
        for(Empresa emp: getEmpresas()) {
            if (emp.getId() == id) {
                return emp;
            }
        }

        return null;
    }
}
