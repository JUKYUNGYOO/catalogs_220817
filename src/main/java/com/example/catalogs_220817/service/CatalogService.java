package com.example.catalogs_220817.service;


import com.example.catalogs_220817.model.CatalogEntity;


//모든 상품 정보를 조회하는 서비스인 CatalogService.java 인터페이스
public interface CatalogService {

    Iterable<CatalogEntity> getAllCatalogs();

//    CatalogEntity를 반환시킬 수 있는 Iterable 데이터
}
