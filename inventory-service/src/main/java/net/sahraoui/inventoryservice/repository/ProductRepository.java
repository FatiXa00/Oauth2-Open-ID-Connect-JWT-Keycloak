package net.sahraoui.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import net.sahraoui.inventoryservice.entities.Product;


public interface ProductRepository extends JpaRepository<Product,String> {

}
