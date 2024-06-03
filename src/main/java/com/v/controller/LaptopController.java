package com.v.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v.util.AsusLaptop;

@RestController
public class LaptopController {

	@Autowired
	private AsusLaptop laptop;
	
	@GetMapping("/build")
	public String buildLaptop() {
		return this.laptop.buildLaptop();
	}
}
