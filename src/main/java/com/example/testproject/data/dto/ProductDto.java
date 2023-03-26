package com.example.testproject.data.dto;

import com.example.testproject.data.entity.Product;
import lombok.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {

    @NotNull
    private String productId;
    @NotNull
    private String productName;
    @NotNull
    @Min(value = 500)
    @Max(value = 30000000)
    private int productPrice;

    @Min(value = 0)
    @Max(value = 9999)
    private int productStock;

    public Product toEntity(){
        return Product.builder()
                .id(productId)
                .name(productName)
                .price(productPrice)
                .stock(productStock)
                .build();
    }

}