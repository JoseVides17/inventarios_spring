package vides.inventarios.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vides.inventarios.entities.Producto;
import vides.inventarios.repositories.ProductoRepository;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductoRepository productoRepository;
    @Override
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    @Override
    public void registrarProducto(Producto producto) {
        this.productoRepository.save(producto);
    }

    @Override
    public Producto findById(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarProducto(Integer idProducto) {
        this.productoRepository.deleteById(idProducto);
    }
}
