package com.springboot.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.springboot.Entity.Product;
@Mapper
public interface ProductMapper {

	public List<Product> selectAllProduct();
	public void deleteProductById(long id);
	public void insertProduct(Product product);


}