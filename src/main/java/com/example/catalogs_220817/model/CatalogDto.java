package com.example.catalogs_220817.model;


import lombok.Data;

import java.io.Serializable;



//Dto - 데이터 전환 용도로 사용됨.
@Data
public class CatalogDto implements Serializable {

    private String productId;
    private Integer qty;
    private Integer unitPrice;
    private Integer totalPrice;


    private String orderId;
    private String userId;


}
