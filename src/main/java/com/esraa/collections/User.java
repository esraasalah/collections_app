package com.esraa.collections;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User implements Serializable {
	
	private String name ;
	private transient String password ; 
	private Integer age ;
	
	@Override
	public String toString()
	{
		return "User:"+"{"+
	               "name:"+name+
	               "password:"+password
	               +"age:"+age ;
		
	}
	
	

}
