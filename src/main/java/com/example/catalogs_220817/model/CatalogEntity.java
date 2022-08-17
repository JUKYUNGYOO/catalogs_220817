package com.example.catalogs_220817.model;


import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

//@Data
//@Entity
//@Table

@Data
@Entity
@Table(name="catalog")
@Getter
@Setter
public class CatalogEntity implements Serializable {
//    데이터 직렬화 : 메모리의 객체를 디스크에 저장하거나, 네트워크를 통해 전송되는
//    형식으로 변환되는 작업
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length=120, unique=true, name="productId")
    private String productId;

    @Column(nullable = false, name="productName")
    private String productName;

    @Column(nullable = false, name="stock")
    private Integer stock;

    @Column(nullable = false, name="unitPrice")
    private Integer unitPrice;

    @Column(nullable = false, updatable = false, insertable = false, name="createdAt")
    @ColumnDefault(value = "CURRENT_TIMESTAMP")
    private Date createdAt;

}
