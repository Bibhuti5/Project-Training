package com.cg.ioc;

public class Airtel implements sim {

	public Airtel() {
		System.out.println("\n Airtel Class Called \n");
	}

	@Override
	public void calling() {
		System.out.println("Calling Using Airtel Sim");

	}


	@Override
	public void data() {
		System.out.println("Browing Internet Using Airtel Sim");

	}

}
