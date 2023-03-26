package com.example.testproject.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ShortUrlResponseDto implements Serializable {

    private static final long serialVersionUID = -214490344996507077L;

    @Id
    private String orgUrl;

    private String shortUrl;

}