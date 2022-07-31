package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleGenerics {

	public static void main(String[] args) {
		Map<Integer,String>obj=new HashMap<Integer,String>();
		obj.put(1, "Vipul");
		obj.put(2, "Vishal");
		System.out.println(obj);
		
		Set<Map.Entry<Integer,String>>itr=obj.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itr1=itr.iterator();
		
		while(itr1.hasNext())
		{
			//type-casting is not required
			Entry<Integer, String> e=itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}