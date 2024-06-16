package com.makeAMatch.makeAMatch.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.makeAMatch.makeAMatch.model.OurUsers;
import com.makeAMatch.makeAMatch.model.Product;
import com.makeAMatch.makeAMatch.model.Role;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReqRes {
    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String email;
    private String role;
    private String address;
    private String password;
    private List<Product> products;
    private OurUsers ourUsers;
}
