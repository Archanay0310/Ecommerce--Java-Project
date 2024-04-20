package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping("/{id}")
    public String getProductById(@PathVariable("id") Long id){
        return "My First product "  +id;
    }

    //@RequestBody Product product-> Converts the received json to a product java objects;

    @PostMapping("")
    public String createdProduct(@RequestBody Product product){
        System.out.println(product.getCategory());
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        return "Product Created.";

    }

}
