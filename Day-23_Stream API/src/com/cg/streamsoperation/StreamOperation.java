package com.cg.streamsoperation;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		List<Integer>obj=Arrays.asList(10,20,45,30,40,32,10,78);
		//distinct:it takes unique values
		obj.stream().distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		//it sets the limit -first n -limit elements
		obj.stream().limit(5).forEach(i->System.out.print(i+" "));
		System.out.println();
		obj.stream().sorted().forEach(i->System.out.print(i+" "));
	}

}