package com.example.testproject.data.entity;


import com.example.testproject.data.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "product")
public class Product extends BaseEntity{

    @Id
    String id;
    String name;
    Integer price;
    Integer stock;


    public ProductDto toDto(){
        return ProductDto.builder()
                .productId(id)
                .productName(name)
                .productPrice(price)
                .productStock(stock)
                .build();
    }

}