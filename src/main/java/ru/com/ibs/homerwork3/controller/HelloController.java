package ru.com.ibs.homerwork3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/my")
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "a", required = false) int a,
                            @RequestParam(value = "b",required = false)int b,
                           @RequestParam(value="doing",required = false)String doing,
                           Model model){

       // System.out.println("Hello "+name+" "+surname);

        switch (doing){
            case "add":model.addAttribute("doing",a+b);
            break;
            case "sub":model.addAttribute("doing",a-b);
            break;
            case "mul":model.addAttribute("doing",a*b);
            break;
            case "div":model.addAttribute("doing",a/(double)b);
            break;
            default: model.addAttribute("doing", 0);
            break;

        }
        //model.addAttribute("message", "Hello "+name+" "+surname);
        return "hello";
    }
}
