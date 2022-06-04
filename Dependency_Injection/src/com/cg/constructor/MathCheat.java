package com.cg.constructor;

public class MathCheat {

	public void mathCheat() {
		System.out.println("****************** This is MathCheat ****************");
	}

	@Override
	public String toString() {
		return "MathCheat [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}