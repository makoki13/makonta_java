package com.makokienterprises.makonta.interfaces;

import com.makokienterprises.makonta.libros.Apunte;

import java.util.List;

public interface OrdenableApunte {
    public List<Apunte> listar(String campo, Direccion direccion);

}
