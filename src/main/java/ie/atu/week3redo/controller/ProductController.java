package ie.atu.week3redo.controller;

import ie.atu.week3redo.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public List<Product> addProduct(){
        productList.add(new Product("milk", 1.99));
        return productList;
    }
}
