/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.domain.service;

import com.arya.belajar.domain.model.Item;
import java.util.List;
import net.bull.javamelody.MonitoredWithSpring;

/**
 *
 * @author Artha
 */
@MonitoredWithSpring
public interface ItemService {
    
    public Item saveItem(Item item);
    
    public List<Item> findItems();
    
    public List<Item> findItemsByCode(String code);
    
    public List<Item> findItemsByName(String name);
    
    public Item findById(String id);
}
