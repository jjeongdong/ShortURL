package com.example.testproject.data.repository;

import com.example.testproject.data.entity.ProductEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {

}
