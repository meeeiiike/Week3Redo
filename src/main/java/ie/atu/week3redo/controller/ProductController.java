package ie.atu.week3redo.controller;

import ie.atu.week3redo.model.Product;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/api")
public class ProductController {

    List<Product> productList = new ArrayList<>();

    @GetMapping("/showListOfProducts")
    public List<Product> showAllProducts(){
        return productList;
    }
    @PostMapping("/addSingleProduct")
    public Product addProduct(@Valid @RequestBody Product product){
        productList.add(product);
        return product;
    }
    @PostMapping("/addList")
    public List<Product> addList(@Valid @RequestBody List<Product> product){
        productList.addAll(product);
        return productList;
    }
    @GetMapping("/countProducts")
    public int count(){
        return productList.size();
    }
}
