package Controller;


import Model.Product;
import Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/test/product")
public class ProductController {


    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/all")
    public List<Product> getAll(){
        return productRepository.findAll();
    }

    @PostMapping(value ="/create")
    public List<Product> createProduct(@RequestBody Product product){
        productRepository.save(product);
        return productRepository.findAll();

    }
}
