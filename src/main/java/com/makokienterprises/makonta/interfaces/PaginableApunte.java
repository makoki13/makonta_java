package com.makokienterprises.makonta.interfaces;

import com.makokienterprises.makonta.libros.Apunte;

import java.util.List;

public interface PaginableApunte {
    List<Apunte> listar(int desde, int hasta);
}
