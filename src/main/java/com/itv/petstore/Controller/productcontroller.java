package com.itv.petstore.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itv.petstore.entites.Product;
import com.itv.petstore.services.ProductServices;

@RestController
public class productcontroller {
    // @RequestMapping("/")
    // public String getName() {
    // return "My Name is Kalpesh";
    // }

    // @RequestMapping("/score")
    // public int getscore() {
    // return 99;
    // }

    @Autowired
    private ProductServices productServices;
    // @RequestMapping(path = "/products", method = RequestMethod.GET)
    @GetMapping("/products")
    public Collection<Product> getProducts() {
        return this.productServices.getAllProducts();
    }

    //              #get by Id
    // @RequestMapping(path = "/products/{id}")
    // public Product getProductById(@PathVariable Integer id) {
    //     return this.productServices.getProductById(id);
    // }

    // @RequestMapping(path = "/products", method = RequestMethod.POST)
    @GetMapping("/products/{id}")
    public Product addProduct(@RequestBody Product product) {
        return this.productServices.addProduct(product);
    }

    // @RequestMapping(path="/products/{id}",method=RequestMethod.DELETE)
    @GetMapping("/products/{id}")
    public String deleteProduct(@PathVariable Integer id)
    {
        return this.productServices.deleteProduct(id);
    }

    // @RequestM`apping(path="/products/{id}",method=RequestMethod.PUT)
    @GetMapping("/products/{id}")
    public String updateProduct(@PathVariable Integer id, @RequestBody Product product)
    {
        return this.productServices.updateProduct(id,product);
    }

}