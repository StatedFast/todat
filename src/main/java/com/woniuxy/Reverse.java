package com.woniuxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {
	private static List<char[]> asList;

	public static void main(String[] args) {
//		String str = "abcdefg";
//		char[] cs = str.toCharArray();
//		System.out.println(cs);
		  
		        //×Ö·û´®×ªlist<String>
		 String str = "asdfghjkl";
		  List<String> list = Arrays.asList(str.split(""));
		       //list<String>×ª×Ö·û´®
		  
		     System.out.println(String.join("", list));
		     Collections.reverse(list);
		     System.out.println(String.join("", list));
		     
		    }
	
	
}
