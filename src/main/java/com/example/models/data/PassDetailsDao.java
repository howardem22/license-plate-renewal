package com.example.models.data;

import com.example.models.PassDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Emily on 4/29/2017.
 */
@Repository
@Transactional
public interface PassDetailsDao extends CrudRepository<PassDetails, Integer> {
}
