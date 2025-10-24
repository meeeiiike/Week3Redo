package ie.atu.week3redo.service;

import ie.atu.week3redo.model.Product;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> productList = new ArrayList<>();

    public List<Product> showAllProducts(){
        return productList;
    }

    public Product addProduct(Product product){
        productList.add(product);
        return product;
    }

    public List<Product> addList(List<Product> product){
        productList.addAll(product);
        return productList;
    }
    public int count(){
        return productList.size();
    }

}
