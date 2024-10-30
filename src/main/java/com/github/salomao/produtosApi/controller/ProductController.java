package com.github.salomao.produtosApi.controller;

import com.github.salomao.produtosApi.model.Product;
import com.github.salomao.produtosApi.repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping
    public void saveProduct(@RequestBody Product product) {
        productRepository.save(product);
        System.out.printf("Produto recebido: %s", product);
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") String id) {
        return productRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") String id) {
        productRepository.deleteById(id);
    }

    @PatchMapping("/{id}")
    public void updateProduct(@PathVariable("id") String id,
                              @RequestBody Product product) {
        product.setId(id);
        productRepository.save(product);
    }

    @GetMapping
    public List<Product> getProducts(@RequestParam("name") String name) {
        return productRepository.findByName(name);
    }
}
