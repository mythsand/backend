package com.mythsand.repository;

import com.mythsand.model.AirEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by mythsand on 25/02/2017.
 */
@Repository
public interface AirRepository extends JpaRepository<AirEntity,Integer> {

}
