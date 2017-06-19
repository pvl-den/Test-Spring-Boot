package com.springjpa.repositories;

import com.springjpa.entity.Fridge;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by denis on 18.06.2017.
 */
public interface FridgeRepository extends JpaRepository<Fridge,Long> {
}
