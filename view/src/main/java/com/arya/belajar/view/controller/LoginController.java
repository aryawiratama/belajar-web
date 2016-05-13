/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.arya.belajar.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Artha
 */
@Controller
@RequestMapping(value = "login")
public class LoginController {
    
    @RequestMapping("")
    public String login(@RequestParam(value = "error", required = false) String error, Model model){
        model.addAttribute("error", error);
        return "login/login";
    }
}
