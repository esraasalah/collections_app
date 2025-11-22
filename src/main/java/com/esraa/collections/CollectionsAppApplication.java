package com.esraa.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CollectionsAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CollectionsAppApplication.class, args);
		
		
		
		
		Collection<Integer> c1 = new ArrayList<Integer>();
//		
//		Collection<Integer> c2 = new HashSet<Integer>();
//		
//		c1 = c2 ;
		
		List<Integer> l1 = (List)c1 ;
		
	//	Collection<Integer> c3 = new HashMap<Integer,Integer>() ;
		
		Set<Integer> nums = new HashSet<Integer>(); // cannot access set elements using index (unlike list)
		nums.add(2);
		nums.add(10);
		nums.add(90);
		nums.add(100);
		
		System.out.println(nums);
		
		
		
		// how we can access data inside set 
		
		      // 1- iterate over set elements
		
		          // a_ using for each
		          System.out.println("using foreach"); 
		     
		         for (Integer i : nums)
		         {System.out.println(i);}
		
		         
		         
		         
		          // b_ using  ierattor 
		         System.out.println("using  ierattor");
		        Iterator<Integer> iterator = nums.iterator();
		        while (iterator.hasNext())
		        {
		        	System.out.println(iterator.next());
		        }
		          
		     
		      //2_ check element existence  
		        
		        System.out.println(nums.contains(10));
		        
		        
		      //3_ convert to list or array
		        
		          // a_ convert to Array 
		        Integer[] numsArr = nums.toArray(new Integer[0]) ;
		        
		        
		        
		       
		         //b_ convert to list 
		        List<Integer> numsList = new ArrayList<>(nums);
		        System.out.println(numsList.get(0));
		        
		        
		        String three = null;
		        Set<String> set = Set.of("1", "2", "3", "4", "5");
		        
		        int count = 0 ;
		        for (String item : set)
		        {
		        	count ++ ;
		        	System.out.println(count + "from loop");
		            if (item.equals(new String("3")))
		            {
		                three = item;
		                break ;
		            }
		        }
		       System.out.println(three);
		         
		         
		       Set<String> set2 = Set.of("1", "2", "3", "4", "5"); 
		       System.out.println(set2);
		       
		       
		       
		       System.out.println(set.contains("3") +"_"+ "using contains");
		       
		       
		       
		
	}

}
