/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.service.test;

import com.arya.belajar.domain.model.Item;
import com.arya.belajar.domain.service.ItemService;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Artha
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:com/arya/belajar/application/config/applicationContext.xml")
public class ItemServiceTest {
    
    @Autowired
    private ItemService itemService;
    
    @Test
    public void findAllTest(){
        List<Item> items = itemService.findItems();
        assertNotNull(items);
    }
}
