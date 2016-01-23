/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.view.controller;

import com.arya.belajar.domain.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *`
 * @author Artha
 */
@Controller
@RequestMapping(value = "customer")
public class CustomerController {
    
    @Autowired
    private ItemService itemService;
    
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String customerForm(Model model){
        
        return "customer-form";
    }
}
