package com.example.devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	@GetMapping(value="/get")
	public String get() {
		return "It's me";
	}

}
