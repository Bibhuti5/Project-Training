package com.cg.ioc;

public class Vodafone implements sim {

	@Override
	public void calling() {
		System.out.println("Calling Using Vodafone Sim");

	}

	@Override
	public void data() {
		System.out.println("Browing Internet Using  Vodafone Sim");

	}

}