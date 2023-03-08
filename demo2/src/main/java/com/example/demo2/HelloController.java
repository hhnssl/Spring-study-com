package com.example.demo2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //�� ��û ó�� �غ� �Ǿ����� �ǹ� & @Controller�� @ResponseBody�� ������ ��
public class HelloController {
	
	@GetMapping("/") // "/"�� index()�� �����ϴ� ����
	public String index() {
		return "Greetings from Spring Boot!!";
	}
}
