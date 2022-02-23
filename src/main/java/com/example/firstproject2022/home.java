/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.firstproject2022;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ican
 */
@Controller
public class home {
    @RequestMapping("/")
    public String mainHome(Model model){
        ArrayList<String> list = new ArrayList<>();
        list.add(0,"Hey , I'm Priya Ihsan Amirullah");
        list.add(1,"Front end Developer - Backend Developer, ohh you found me in here nice then...");
        model.addAttribute("profile",list);
        return "index";
    }
}
