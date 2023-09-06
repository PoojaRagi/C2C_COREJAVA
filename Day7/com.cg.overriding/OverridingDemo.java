package com.cg.overriding;

import com.cg.overriding.RBI;

public class OverridingDemo {

	public static void main(String[] args) {
		
		RBI rbi;
		
		//dynamic binding
		rbi = new SBI();
		System.out.println(rbi.getRateofInterest());
		System.out.println(rbi.getClass());
		rbi = new HDFC();
		System.out.println(rbi.getRateofInterest());
		System.out.println(rbi.getClass());
		rbi = new ICICI();
		System.out.println(rbi.getRateofInterest());

	}

}
