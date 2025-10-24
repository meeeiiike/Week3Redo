package ie.atu.week3redo.controller;

import ie.atu.week3redo.model.Product;
import ie.atu.week3redo.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController("/api")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/showListOfProducts")
    public List<Product> showAllProducts(){
        return service.showAllProducts();
    }
    @PostMapping("/addSingleProduct")
    public Product addProduct(@Valid @RequestBody Product product){
        return service.addProduct(product);
    }
    @PostMapping("/addList")
    public List<Product> addList(@Valid @RequestBody List<Product> product){
        return service.addList(product);
    }
    @GetMapping("/countProducts")
    public int count(){
        return service.count();
    }
}