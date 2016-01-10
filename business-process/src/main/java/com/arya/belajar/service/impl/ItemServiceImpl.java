/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.service.impl;

import com.arya.belajar.domain.model.Item;
import com.arya.belajar.domain.service.ItemService;
import com.arya.belajar.service.repository.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Artha
 */
@Service
public class ItemServiceImpl implements ItemService{
    
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    @Override
    public List<Item> findItemsByCode(String code) {
        return itemRepository.findByCode(code);
    }

    @Override
    public List<Item> findItemsByName(String name) {
        return itemRepository.findByName(name);
    }

    @Override
    public Item findById(String id) {
        return itemRepository.findOne(id);
    }
    
}
