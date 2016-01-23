/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.view.controller;

import com.arya.belajar.domain.model.Item;
import com.arya.belajar.domain.service.ItemService;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Artha
 */
@Controller
@RequestMapping("item")
public class ItemController {
    
    @Autowired
    private ItemService itemService;
    
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String itemForm(Model model){
        return "item/item-form";
    }
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public String saveItem(Item item, @RequestParam("expiredDateParam")String expiredDateParam){
        DateTime expiredDate = DateTimeFormat.forPattern("yyyy-MM-dd").parseDateTime(expiredDateParam);
        item.setExpiredDate(expiredDate);
        itemService.saveItem(item);
        return "redirect:/item/form";
    }
}
