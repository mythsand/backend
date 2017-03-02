package com.mythsand.repository;

import com.mythsand.model.AirEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by mythsand on 25/02/2017.
 */
@Repository
public interface AirRepository extends JpaRepository<AirEntity,Integer> {

    @Query("select air from AirEntity air join air.cityByPoint cityAirEntity where cityAirEntity.airPoint=?1")
    Page<AirEntity> findByAirPoint(String airPoint,Pageable pageable);

}
