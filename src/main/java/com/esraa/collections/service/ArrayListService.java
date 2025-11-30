package com.esraa.collections.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ArrayListService {
	
	 
	
	//Reverse a List
	public static Collection<Integer> reverseArray(List<Integer> myArr)
	{
		
		
		Collections.reverse(myArr);  // take array of list not of set 
		
	   
		
		 return myArr ;	
		
	}
	
	//sort a List
		public static Collection<Integer> sortArray(Collection<Integer> myArr)
		{
			
			List<Integer> mylist = (List<Integer>)myArr;
			List<String> placeholders = Collections.nCopies(5, "N/A");
             
			
			 Collections.sort(mylist);
			 
			 return mylist ;
			
		
			
			
			
			
		}
		
		
		
	
	
	
	
	
	

}
