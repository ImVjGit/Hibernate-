package com.jcp.mvc;

import java.util.ArrayList;
import java.util.List;

//Business Logic ...  
public class ModelClass {

	public List<User> executeTheQuery(String qu)
	{
		//create User Arraylist 
		List<User> list ;
		DataAccess obj = new DataPersistace ();
		list =obj.getData(qu);
		
		return list;
		
	}
	
}
 