package com.esraa.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.plaf.synth.SynthStyleFactory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class TransientExample {
	
	
	public static User user = new User("esraa", "e123" , 31) ;
	
	// write to file .
	
	public static void writeToFile()
	{
	try {
		
		FileOutputStream fileOut =  new FileOutputStream("user.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		
		 System.out.println("User object serialized.");
	} 
	catch (Exception e)
	{
		
		e.printStackTrace();
		
	}
	
	}
	
	// read from file 
	
	public static void readFromFile()
	{
		User deserializedUser = new User();
		
		try {
		FileInputStream fileInput = new FileInputStream("user.ser");
		ObjectInputStream in = new ObjectInputStream(fileInput);
		deserializedUser = (User) in.readObject();
		System.out.println(deserializedUser);
		
		} catch(Exception e)
		{
			 e.printStackTrace();
			
		}
		
		
		
	}
	
	
	

}
