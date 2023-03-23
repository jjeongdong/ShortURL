package com.example.testproject.controller;

import java.util.Map;

import com.example.testproject.dto.MemberDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    // http://localhost:8080/api/v1/put-api/default
    @PutMapping(value = "/default")
    public String putMethod() {
        return "Hello World!";
    }

    // http://localhost:8080/api/v1/put-api/member
    @PutMapping(value = "/member")
    public String postMember(@RequestBody Map<String, Object> putData) {
        StringBuilder sb = new StringBuilder();

        putData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

    /*
    param.forEach((key, value) -> sb.append(key).append(" : ").append(value).append("\n"));
     */

        return sb.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/member1")
    public String postMemberDto1(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/member2")         // 반환값이 MemberDTO이기 때문에 JSON 형태로 RETURN
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO) {
        return memberDTO;
    }

    // http://localhost:8080/api/v1/put-api/member2
    @PutMapping(value = "/member3")         // JSON 형태로 RETURN
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }

}