package com.mythsand.repository;

import com.mythsand.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by mythsand on 25/04/2017.
 */
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

    @Query("select city from CityEntity city where city.province = ?1")
    List<CityEntity> findByProvince(String province);

    @Query("select distinct city.province from CityEntity city")
    List findProvince();
}
