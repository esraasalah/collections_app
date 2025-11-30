package com.esraa.collections.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.esraa.collections.service.ArrayListService;

@RequestMapping("/api")
@RestController
public class MyController {
	
	
	
	@Autowired
	ArrayListService arrayListServcie ;
	
	
	@PostMapping("/reverse")
	public Collection<Integer> reverseList (@RequestBody List<Integer> myList)
	{
		
		return arrayListServcie.reverseArray(myList);
		
		
		
	}
	
	
	
	
	@PostMapping("/sort")
	public Collection<Integer> sortList (@RequestBody List<Integer> myList)
	{
		
		return arrayListServcie.sortArray(myList);
			
	}
	
	
	
	
	

}
