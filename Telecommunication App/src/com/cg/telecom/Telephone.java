package com.cg.telecom;

public interface Telephone {
	void powerOn();
	void dial(String phoneNumber);
	void answer();
	boolean callPhone(String phoneNumber);
	boolean isRinging();
}

