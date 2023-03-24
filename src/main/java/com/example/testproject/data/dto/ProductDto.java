package com.example.testproject.data.dto;

import com.example.testproject.data.entity.ProductEntity;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    public ProductEntity toEntity(){
        return ProductEntity.builder()
                .id(productId)
                .name(productName)
                .price(productPrice)
                .stock(productStock)
                .build();
    }

}