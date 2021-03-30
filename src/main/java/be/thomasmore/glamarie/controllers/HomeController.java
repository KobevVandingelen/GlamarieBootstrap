package be.thomasmore.glamarie.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {





    @GetMapping("/error")
    public String error(){
        return "error";
    }


    @GetMapping({"/", "/home"})
    public String home() {
        return "home";
    }

    @GetMapping("/Contact")
    public String contact() {
        return "Contact";
    }

    @GetMapping("/Price")
    public String price() {
        return "Price";
    }




}



