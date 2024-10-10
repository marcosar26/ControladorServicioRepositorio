package com.dwes.ControladorServicioRepositorio.service;

import com.dwes.ControladorServicioRepositorio.dto.ProductoRequestDTO;
import com.dwes.ControladorServicioRepositorio.model.Producto;
import com.dwes.ControladorServicioRepositorio.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {
    private final ProductoRepository productoRepository;

    @Autowired
    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    private ProductoRequestDTO mapToDTO(Producto producto) {
        return ProductoRequestDTO.builder().
                nombre(producto.getNombre())
                .categoria(producto.getCategoria())
                .precio(producto.getPrecio())
                .build();
    }

    public List<ProductoRequestDTO> findAllByNombre(String nombre) {
        List<Producto> productos = productoRepository.findAllByNombre(nombre);
        return (productos == null || productos.isEmpty()) ?
                new ArrayList<>() :
                productos.stream().map(this::mapToDTO).toList();
    }

    public List<ProductoRequestDTO> findAllByCategoria(String categoria) {
        List<Producto> productos = productoRepository.findAllByCategoria(categoria);
        return (productos == null || productos.isEmpty()) ?
                new ArrayList<>() :
                productos.stream().map(this::mapToDTO).toList();
    }

    public List<ProductoRequestDTO> findAllByPrecio(double precio) {
        List<Producto> productos = productoRepository.findAllByPrecio(precio);
        return (productos == null || productos.isEmpty()) ?
                new ArrayList<>() :
                productos.stream().map(this::mapToDTO).toList();
    }
}
