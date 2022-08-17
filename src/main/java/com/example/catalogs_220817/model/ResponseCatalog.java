package com.example.catalogs_220817.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;



// 사용자에게 반환시켜주기 위한 ResponseCatalog
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseCatalog {

    private String productId;
    private String productName;
    private Integer stock;
    private Integer unitPrice;
    private Date createdAt;

}
