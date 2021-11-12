package ru.com.ibs.homerwork3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/hello-world")
    public String sayHello(){
        return "WEB-INF.view.hello_world.html";
    }
}
