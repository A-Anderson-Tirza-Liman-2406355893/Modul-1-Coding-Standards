package id.ac.ui.cs.advprog.eshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        // Ini akan otomatis mengalihkan (redirect) user dari "/" ke "/product/list"
        return "redirect:/product/list";
    }
}