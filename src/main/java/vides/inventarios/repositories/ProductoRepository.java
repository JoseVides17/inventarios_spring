package vides.inventarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vides.inventarios.entities.Producto;
@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
