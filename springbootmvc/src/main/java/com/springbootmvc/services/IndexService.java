package com.springbootmvc.services;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexService {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
