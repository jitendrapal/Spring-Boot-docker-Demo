package com.example.SpringBootdockerDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@RequestMapping("/getMessage")
	public String getMessage() {
		return "Welcome Spring Boot Rest API!";
	}

}
