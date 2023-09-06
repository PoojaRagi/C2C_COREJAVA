package com.cg.overriding;

import com.cg.overriding.RBI;

//sub class
public class SBI extends RBI {

	public float getRateofInterest() {
		return 7.0f;
	}
	
	public SBI getObject() {
		return this;
	}
}
