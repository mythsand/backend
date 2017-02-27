package com.mythsand.repository;

import com.mythsand.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mythsand on 27/02/2017.
 */
@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity,Integer> {
}
