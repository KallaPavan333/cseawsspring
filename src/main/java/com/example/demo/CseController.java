package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CseController {
	@GetMapping("/cseadd")
	public int addCSE(@RequestParam int a, @RequestParam int b) {
		sum=a+b;
		return sum + "23mh1a05h3";
	}

}
