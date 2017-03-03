package com.mythsand.repository;

import com.mythsand.model.WaterEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by mythsand on 27/02/2017.
 */
@Repository
public interface WaterRepository extends JpaRepository<WaterEntity,Integer> {

    @Query("select water from WaterEntity water join water.cityByPoint cityEntity where cityEntity.waterPoint=?1")
    Page<WaterEntity> findByPoint(String point, Pageable pageable);

//    @Query("select water from WaterEntity water join water.cityByPoint cityEntity where water.toWeek=")
//    List<WaterEntity> findByTime(Timestamp from , Timestamp to);
}
