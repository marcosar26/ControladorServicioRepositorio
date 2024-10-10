package com.dwes.ControladorServicioRepositorio.controller;

import com.dwes.ControladorServicioRepositorio.dto.ProductoRequestDTO;
import com.dwes.ControladorServicioRepositorio.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    private final ProductoService productoService;

    @Autowired
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ProductoRequestDTO>> getProducto(
            @RequestParam(required = false) String nombre,
            @RequestParam(required = false) String categoria,
            @RequestParam(required = false) Double precio
    ) {
        List<ProductoRequestDTO> productos = null;
        if (nombre != null) {
            productos = productoService.findAllByNombre(nombre);
        } else if (categoria != null) {
            productos = productoService.findAllByCategoria(categoria);
        } else if (precio != null) {
            productos = productoService.findAllByPrecio(precio);
        }
        return (productos == null || productos.isEmpty()) ?
                ResponseEntity.notFound().build() :
                ResponseEntity.ok(productos);
    }
}
