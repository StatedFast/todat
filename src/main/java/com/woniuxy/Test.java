package com.woniuxy;

public class Test {
	private int sum=0,num = 1;
	public int calSum(int maxnum) {
		if(num<=maxnum) {
			sum+=num;
			num++;
			calSum(maxnum);
		}
		return sum;
	}
	public static void main(String[] args) {
		Test  t =  new Test();
		System.out.println(t.calSum(100));
	}
}

