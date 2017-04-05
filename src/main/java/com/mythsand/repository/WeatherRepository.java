package com.mythsand.repository;

import com.mythsand.model.WeatherEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by mythsand on 27/02/2017.
 */
@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity,Integer> {

    @Query("select weather from WeatherEntity weather join weather.cityByCity cityEntity where cityEntity.pinyin=?1")
    Page<WeatherEntity> findByCity(String city, Pageable pageable);

    @Query("select weather from WeatherEntity weather join weather.cityByCity cityEntity where weather.time between ?1 and ?2")
    List<WeatherEntity> findByTime(Timestamp fromTime, Timestamp toTime);
}
