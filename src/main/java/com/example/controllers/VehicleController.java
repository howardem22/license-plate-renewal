package com.example.controllers;

import com.example.models.data.VehicleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Emily on 4/29/2017.
 */
@Controller
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    private VehicleDao vehicleDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("vehicles", vehicleDao.findAll());
        model.addAttribute("title", "All Vehicles");

        return "vehicle/index";
    }


}
