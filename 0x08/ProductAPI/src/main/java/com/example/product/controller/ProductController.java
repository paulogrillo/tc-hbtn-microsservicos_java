package com.example.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.model.Product;
import com.example.product.model.ProductRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/products")
public class ProductController {
	
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @ApiOperation(value = "Responsável por retornar uma mensagem de boas vindas" )
    @GetMapping("/welcome")
    public String welcome() {
        return "BEM VINDO À PRODUCT REST API.";
    }

    @ApiOperation(value = "Responsável por retornar uma lista de produtos")
    @ApiResponse(code = 11, message = "Warning - the process returned more than 1000 products.")
    @GetMapping("/allProducts")
    public List<Product> listAllProducts() {
        return productRepository.getAllProducts();
    }

    @ApiOperation(value = "Responsável por retornar um produto pelo id")
    @ApiResponse(code = 12, message = "The field id not informed. This information is required.")
    @GetMapping("/findProductById/{id}")
    public Product findProductById(@PathVariable Long id){
        return productRepository.getProductById(Math.toIntExact(id));
    }

    @ApiOperation(value = "Responsável por adicionar um novo produto")
    @ApiResponse(code = 10, message = "Required fields not informed.")
    @PostMapping("/addProduct")
    public void addProduct(@RequestBody Product product){
        productRepository.addProduct(product);
    }

    @ApiOperation(value = "Responsável por atualizar um produto")
    @ApiResponse(code = 13, message = "User not allowed to remove a product from this category.")
    @PutMapping("updateProduct")
    public void updateProduct(@RequestBody Product product){
        productRepository.updateProduct(product);
    }

    @ApiOperation(value = "Responsável por remover um produto")
    @ApiResponse(code = 14, message = "No information has been updated. The new information is the same as recorded in the database.")
    @DeleteMapping("/removeProduct")
    public void removeProduct(@RequestBody Product product){
        productRepository.removeProduct(product);
    }

}
