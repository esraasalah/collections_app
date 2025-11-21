package com.esraa.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionsAppApplication.class, args);
		
		
		
		
		Collection<Integer> c1 = new ArrayList<Integer>();
		
		Collection<Integer> c2 = new HashSet<Integer>();
		
		c1 = c2 ;
		
		List<Integer> l1 = (List)c1 ;
		
	//	Collection<Integer> c3 = new HashMap<Integer,Integer>() ;
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(2);
		nums.add(10);
		nums.add(90);
		nums.add(100);
		
		System.out.println(nums);
		
		
	}

}
