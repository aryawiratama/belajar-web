/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.service.repository;

import com.arya.belajar.domain.model.Item;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Artha
 */
public interface ItemRepository extends JpaRepository<Item, String>{
    
    public List<Item> findByCode(String code);
    
    @Query("SELECT i FROM Item i WHERE i.name LIKE %:name%")
    public List<Item> findByName(@Param("name")String name);
}
