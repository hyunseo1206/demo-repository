package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("test")
public class TestController {
	@GetMapping
	public String testController(){
	return "Hello World!(안녕하세요!)"; 
	}
	
	@GetMapping("/{id}")
	public String testContollerWithPathVariables(@PathVariable(required =false) int	id){
	return "Hello World! ID "+ id;
	}
	
	@GetMapping("/Param")
	public String testContollerRequestParam(@RequestParam(required =false) int id){
	return "Hello World! ID param "+ id;
	}
}

// @GetMapping URI만을 사용하여 요청 를 처리할 수 있다
// RequestMapping을 삭제한 경우 서비스 그룹핑이 어려울 수 있다.
//@RestController
//public class TestController {
//	@GetMapping("/test")
//	public String testController(){
//		return "Hello World!(안녕하세요!)"; 
//	
//	@GetMapping("/test/{id}")
//	public String testContollerWithPathVariables(@PathVariable(required =false) int	id){
//		return "Hello World! ID "+ id;
//	}
//	
//	@Ge	tMapping("/Param")
//	public String testContollerRequestParam(@RequestParam(required =false) int id){
//		return "Hello World! ID "+ id;
//	}
//}
