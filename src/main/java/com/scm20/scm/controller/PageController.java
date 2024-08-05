package com.scm20.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@GetMapping("/")
    public String index() {
        return "redirect:/home";
    }
	
	@RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");
        // sending data to view
        model.addAttribute("name", "Substring Technologies");
        model.addAttribute("youtubeChannel", "Learn Code With Durgesh");
        model.addAttribute("githubRepo", "https://github.com/learncodewithdurgesh/");
        return "home";
    }
	
	@RequestMapping("/about")
	public String about(Model model) {
		
		System.out.println("About page controller");
		model.addAttribute("isLogin",true);
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("Services page controller");
		return "services";
	}
	
	@RequestMapping("/contanct")
	public String contanct() {
		System.out.println("Contanct page controller");
		return "contanct";
	}
	
	@RequestMapping("/login")
	public String login() {
		System.out.println("Login page controller");
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(Model model) {
		System.out.println("Register page controller");
		return "register";
	}
}

