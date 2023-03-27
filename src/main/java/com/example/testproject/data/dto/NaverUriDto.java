package com.example.testproject.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class NaverUriDto {

    /*
    응답 JSON
    {
        "message":"ok",
        "result": {
            "hash":"GyvykVAu",
            "url":"https://me2.do/GyvykVAu",
            "orgUrl":"http://d2.naver.com/helloworld/4874130"
        }
        ,"code":"200"
    }
    */

    private String message;

    private String code;

    private Result result;

    @Getter
    @Setter
    public static class Result {

        private String hash;

        private String url;

        private String orgUrl;

    }

}