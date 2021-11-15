package ru.com.ibs.homerwork3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PetrolController {

    @GetMapping("/petrol")
    public String petrolShow(){return "Petrol";}
}
