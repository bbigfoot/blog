package com.bigfoot.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllerTest {

	//http://localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get 요청 : " + m.getId()+", "+ m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	@PostMapping("/http/post")// text/plain, application/json
	public String postTest(@RequestBody Member m) { // Messageconverter(스프링부트)
		return "post 요청 : " + m.getId()+", "+ m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청:"  + m.getId()+", "+ m.getUsername()+", "+m.getPassword()+", "+m.getEmail();
	}
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
