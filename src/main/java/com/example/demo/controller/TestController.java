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
	return "Hello World!(�ȳ��ϼ���!)"; 
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

// @GetMapping URI���� ����Ͽ� ��û �� ó���� �� �ִ�
// RequestMapping�� ������ ��� ���� �׷����� ����� �� �ִ�.
//@RestController
//public class TestController {
//	@GetMapping("/test")
//	public String testController(){
//		return "Hello World!(�ȳ��ϼ���!)"; 
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
