package com.example.catalogs_220817.repository;

import com.example.catalogs_220817.model.CatalogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {

    //
//    @Query("SELECT p " +
//            "FROM catalog p " +
//            "ORDER BY p.id DESC")
    CatalogEntity findByProductId(String productId);

}
