package com.cg.ioc;



public class Mobile {

	public static void main(String[] args) {
		com.cg.ioc.sim sim = new Vodafone ();
		sim.calling();
		sim.data();
	}
} 