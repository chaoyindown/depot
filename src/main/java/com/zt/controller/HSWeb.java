package com.zt.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.zt.bean.Dog;


@EnableWebMvc
@Controller
public class HSWeb {
	
	@Autowired
	Dog dog;
	
	@ResponseBody
	@RequestMapping("/hello")
	String get() {
		
		System.out.println(dog.toString());
		return "hello";
	}
	
	@RequestMapping("/dog")
	String main(Map<String, Object> map) {
		map.put("name", "张师傅");
		return "dog";
	}
}
