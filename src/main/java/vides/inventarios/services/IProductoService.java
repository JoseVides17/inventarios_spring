package vides.inventarios.services;

import vides.inventarios.entities.Producto;

import java.util.List;

public interface IProductoService {
    public List<Producto> listarProductos();
    public void registrarProducto(Producto producto);
    public Producto findById(Integer id);
    public void eliminarProducto(Integer idProducto);
}
