package com.woniuxy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test2 {
	public static void main(String[] args) {
		Set set  = new HashSet();
		List list = new ArrayList();
		while(true) {
			int a = (int) (Math.random()*(100));
			set.add(a);
			if(set.size()==7) {
				break;
			}
		}
		for (Object obj : set) {
			list.add((int)obj);
		}
		System.out.println(list);
	}

}
