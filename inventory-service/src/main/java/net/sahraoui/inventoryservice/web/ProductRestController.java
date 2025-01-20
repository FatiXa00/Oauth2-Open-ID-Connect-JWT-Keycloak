package net.sahraoui.inventoryservice.web;

import net.sahraoui.inventoryservice.entities.Product;
import net.sahraoui.inventoryservice.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api")
//@CrossOrigin("*")//ce n est pas la bonne solution ca marche parce que endopoint api n est pas securise
public class ProductRestController {
    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    @GetMapping("/products")
    public List<Product> productList(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id){
        return productRepository.findById(id).get();
    }
}
