package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //웹 요청 처리 준비가 되었음을 의미 & @Controller와 @ResponseBody를 결합한 것
public class HelloController {
	
	@GetMapping("/") // "/"와 index()를 맵핑하는 역할
	public String index() {
		return "Greetings from Spring Boot!!";
	}
}
