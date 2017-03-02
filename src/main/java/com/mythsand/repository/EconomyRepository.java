package com.mythsand.repository;

import com.mythsand.model.EconomyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by mythsand on 27/02/2017.
 */
@Repository
public interface EconomyRepository extends JpaRepository<EconomyEntity,Integer> {

    @Query("select economy from EconomyEntity economy join economy.cityByCity cityEntity where cityEntity.city=?1")
    Page<EconomyEntity> findByCity(String city, Pageable pageable);
}
