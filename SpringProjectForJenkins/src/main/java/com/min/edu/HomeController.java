package com.min.edu;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

   @GetMapping(value = "/")
   public String home(Model model) {
      model.addAttribute("result","안녕하세요 CI/CD교육중입니다 1단계");
      
      return "home";
   }
}
