package vides.inventarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vides.inventarios.entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
