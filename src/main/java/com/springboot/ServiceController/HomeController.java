package com.springboot.ServiceController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.JsonNode;
import com.springboot.Entity.Product;
import com.springboot.mapper.ProductMapper;

@RestController
public class HomeController {
    @Autowired ProductMapper productMapper;


    @GetMapping( "/getProductList" )
    public @ResponseBody List<Product> productList() {
        List<Product> productList = productMapper.selectAllProduct();
        System.out.println(productList);
        return productList;
    }
}