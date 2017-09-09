package com.lxzweb.modules.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/index")
public class IndexController {

	@RequestMapping("/")
	public String main() {
		return "index";
	}
	@RequestMapping("/about.do")
	public String about() {
		return "about";
	}

	@RequestMapping("/top.do")
	public String top() {
		return "top";
	}

	@RequestMapping("/content.do")
	public String content() {
		return "content";
	}

	@RequestMapping("/login.do")
	public String login() {
		return "/login";
	}

}
