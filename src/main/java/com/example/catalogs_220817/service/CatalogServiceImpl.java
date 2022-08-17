package com.example.catalogs_220817.service;


import com.example.catalogs_220817.model.CatalogEntity;
import com.example.catalogs_220817.repository.CatalogRepository;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;



//인터페이스의 메소드를 구현할 CatalogServiceImpl.java를 만들어줌.
@Data
@Slf4j
@Service
public class CatalogServiceImpl implements CatalogService{

    CatalogRepository repository;

    Environment env;

    @Autowired
    public CatalogServiceImpl(CatalogRepository repository,
                              Environment env){
        this.repository = repository;
        this.env = env;
    }

//    Jpa 데이터베이스에 있는 모든 값을 반환 함.
    @Override
    public Iterable<CatalogEntity> getAllCatalogs(){
        return repository.findAll();

    }
}
