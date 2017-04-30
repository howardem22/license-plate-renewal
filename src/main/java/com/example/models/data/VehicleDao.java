package com.example.models.data;

import com.example.models.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Emily on 4/29/2017.
 */
@Repository
@Transactional
public interface VehicleDao extends CrudRepository<Vehicle, Integer> {
    }
