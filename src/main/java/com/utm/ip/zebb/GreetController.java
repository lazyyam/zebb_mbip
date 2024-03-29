package com.utm.ip.zebb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetController {
    @RequestMapping("/hello")
    public String greet(@RequestParam String name,Model model){
        model.addAttribute("name", name);
        return "welcome";
    }
}

