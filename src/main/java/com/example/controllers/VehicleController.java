package com.example.controllers;

import com.example.models.data.VehicleDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Emily on 4/29/2017.
 */
@Controller
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    private VehicleDao vehicleDao;
}
