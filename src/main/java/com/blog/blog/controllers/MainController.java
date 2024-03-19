package com.blog.blog.controllers;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class MainController {
    
    @RequestMapping("/")
    public String home(Model model) {

      model.addAttribute("images", Arrays.asList(
        "flowers.jpg"
      ));

      return "index.html";
    }

}
