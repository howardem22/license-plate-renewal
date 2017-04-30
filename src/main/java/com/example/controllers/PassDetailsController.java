package com.example.controllers;

import com.example.models.data.PassDetailsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Emily on 4/30/2017.
 */
@Controller
@RequestMapping("vehicle/details")
public class PassDetailsController {
    @Autowired
    private PassDetailsDao passDetailsDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("vehicles", passDetailsDao.findAll());
        model.addAttribute("title", "Vehicle Details");

        return "vehicle/index";
    }
}
