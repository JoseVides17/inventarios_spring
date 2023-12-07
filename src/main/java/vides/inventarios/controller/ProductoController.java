package vides.inventarios.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vides.inventarios.entities.Producto;
import vides.inventarios.services.ProductoService;

import java.util.List;

@RestController
@RequestMapping("/inventario-app")
@CrossOrigin(value = "http://localhost:4200")
public class ProductoController {
    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);

    @Autowired
    private ProductoService productoService;

    @GetMapping("/productos")
    public List<Producto> getProducts(){
        return productoService.listarProductos();
    }

    @PostMapping("/productos")
    public void registrarProductos(Producto producto){
        this.productoService.registrarProducto(producto);
    }

    @GetMapping("/productos/{id}")
    public Producto findById(Integer id){
        return productoService.findById(id);
    }
}
