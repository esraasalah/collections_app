package com.esraa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
		       
		       
		       Set<String> names = new HashSet<>();
		       
		       // transient 
		       TransientExample.writeToFile();
		       
		       TransientExample.readFromFile();
		       
		       
		       // Arrays.asList()
		       
		       
		       List<String>  mylist = Arrays.asList("esraa","omar","hamza") ;
		       
		       ArrayList<String> myNewList = new ArrayList<>(Arrays.asList("esraa","omar","hamza"));
		       
		       
		       myNewList.add("nancy");
		       
		       System.out.println(mylist);
		       
		       System.out.println(myNewList);
		    
		       Collection<String> c = new ArrayList<>();
		       
		       List<String> l =(List<String>) c ;
		       
		       
		       
		       
		       // maps 
		       HashMap<String,Integer> map = new HashMap<>();
		       map.put("esraa", 31);
		       map.put("omar"  , 5) ;
		       map.put("hamza", 7);
		       
		       System.out.println(map);
		    		   
		       System.out.println(map.containsKey("eaa"));
		       
		       
		       
		       
		       // diffrence between put and replace 
		       
		       // put add in not exist _ update if exist 
		       map.put("hamza", 10);
		       map.put("maha", 6);
		       System.out.println(map);
		     // update if exist else no thing happens 
		       
		       map.replace("kkkk", 3);
		       
		       System.out.println(map);
		       
		       
		       
		       System.out.println("_______________________________");
		       
		       //  set 
		       
		       Collection<String> mySet = new HashSet<>(); // متغير
		       mySet.add("B");
		       mySet.add("A");
		       mySet.add("c");
		       mySet.add("z");
		       System.out.println("hashSet___" + mySet);
		       
		      
		       
		       
		       Collection<String> mySet3 = new LinkedHashSet<String>(); // نفس ترتيب ال insertion 
		       mySet3.add("B");
		       mySet3.add("A");
		       mySet3.add("c");
		       mySet3.add("z");
		       
		       System.out.println("linkedHashSet___" + mySet3);
		       
		       
		       
		       Collection<String> mySet2 = new TreeSet<>();  // natural order
		       mySet2.add("B");
		       mySet2.add("A");
		       mySet2.add("c");
		       mySet2.add("z");
		       
		       System.out.println("TreeSet___" + mySet2);
		       
		
		       System.out.println("test entry set "+  map.entrySet());
		       System.out.println("test key set "+  map.keySet());
		       System.out.println("test values  "+  map.values());
		       
		       Object langs = "esraa" ;
		       
		       System.out.println(langs);
		       
		       langs = 200 ;
		       
		       System.out.println(langs);
		       
		       
		       langs = new User("esraa" , "123" , 12 ) ;
		       
		       System.out.println(langs.toString());
		       
		       langs =  new ArrayList<>(Arrays.asList(3,4,5,6,7,8));
		        
		        System.out.println(langs);
		        
		        
		        ////////////////////////////////////////////////////
		        
		        System.out.println("====================================================");
		   String name1 = new String("esraa") ;    
		   String name2 = new String ("esraa") ;
		   
		   System.out.println(name1==name2   + "  using ==");
		   
		   System.out.println(name1.equals(name2)+ "  using equals");
		        
		        
		   System.out.println("====================================================");
		   
		   User user1 = new User("esraa","123",20);
		   User user2 = new User("esraa","123",20);
		   User user3 = user1 ;
		   
		   
		   
		   System.out.println(user1==user2);
		   
		   System.out.println(user1==user3);
		   
		   
		   System.out.println(user1.equals(user2));
		   
		   System.out.println(user1.equals(user3));
		   
		   
		   
		   
		   
		   
		   
		   
		       
	}

}
