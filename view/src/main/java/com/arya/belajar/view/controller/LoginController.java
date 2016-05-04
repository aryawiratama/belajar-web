/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Artha
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {
    
    @RequestMapping("")
    public String login(){
        return "login/login";
    }
}
