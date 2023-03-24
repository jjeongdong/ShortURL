package com.example.testproject.data.dao.impl;

import com.example.testproject.data.dao.ProductDAO;
import com.example.testproject.data.entity.ProductEntity;
import com.example.testproject.data.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductDAOImpl implements ProductDAO {

    //private final Logger LOGGER = LoggerFactory.getLogger(ProductDAOImpl.class);

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        //LOGGER.info("[saveProduct] product 정보 저장. productId : {}", product.getId());
        ProductEntity product1 = productRepository.save(productEntity);
        //LOGGER.info("[saveProduct] product 정보 저장완료. productId : {}", product1.getId());
        return product1;
    }

    @Override
    public ProductEntity getProduct(String productId) {
        //LOGGER.info("[getProduct] product 정보 요청. productId : {}", productId);
        ProductEntity product = productRepository.getById(productId);
        //LOGGER.info("[getProduct] product 정보 요청 완료. productId : {}", product.getId());
        return product;
    }
}