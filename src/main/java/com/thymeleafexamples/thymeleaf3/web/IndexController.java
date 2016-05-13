package com.thymeleafexamples.thymeleaf3.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("recipient", "World");

        return "index.html";
    }

    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello3(Model model3) {
        model3.addAttribute("name", "thymeleaf");
        return "hello.html";
    }

    @RequestMapping("/list")
    public String list(Model model3) {
        model3.addAttribute("name", "thymeleaf");
        return "list.xhtml";
    }

    @RequestMapping("/index")
    public String index1(Model model3) {
        model3.addAttribute("name", "thymeleaf");
        return "index.xhtml";
    }
}
