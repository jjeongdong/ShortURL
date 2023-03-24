package com.example.testproject.data.handler.impl;

import javax.transaction.Transactional;

import com.example.testproject.data.dao.ProductDAO;
import com.example.testproject.data.entity.ProductEntity;
import com.example.testproject.data.handler.ProductDataHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler {
    ProductDAO productDAO;

    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public ProductEntity saveProductEntity(String productId, String productName, int productPrice, int productStock) {

        ProductEntity product = new ProductEntity(productId, productName, productPrice,
                productStock);

        return productDAO.saveProduct(product);
    }

    @Override
    public ProductEntity getProductEntity(String productId) {
        return productDAO.getProduct(productId);
    }
}