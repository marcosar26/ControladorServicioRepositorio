package com.dwes.ControladorServicioRepositorio.repository;

import com.dwes.ControladorServicioRepositorio.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    List<Producto> findAllByNombre(String nombre);

    List<Producto> findAllByCategoria(String categoria);

    List<Producto> findAllByPrecio(double precio);
}
