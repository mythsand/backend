package com.mythsand.repository;

import com.mythsand.model.AirEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by mythsand on 25/02/2017.
 */
@Repository
public interface AirRepository extends JpaRepository<AirEntity,Integer> {

    @Query("select air from AirEntity air join air.cityByPoint cityAirEntity where cityAirEntity.airPoint=?1")
    Page<AirEntity> findByAirPoint(String airPoint,Pageable pageable);

    @Query("select air from AirEntity air join air.cityByPoint cityAirEntity where air.time between ?1 and ?2")
    List<AirEntity> findByTime(Timestamp from,Timestamp to);

//    @Query("select air from AirEntity air join CityAirEntity where CityAirEntity .pinyin=?1")
//    List<AirEntity> findByCity(String city);
    @Query("select air from AirEntity air join air.cityByPoint cityEntity where cityEntity.pinyin=?1")
    Page<AirEntity> findByCity(String city, Pageable pageable);
}
