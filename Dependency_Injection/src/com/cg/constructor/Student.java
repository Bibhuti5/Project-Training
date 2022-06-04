package com.cg.constructor;
public class Student {

	int id;
	MathCheat mathCheat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MathCheat getMathCheat() {
		return mathCheat;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", mathCheat=" + mathCheat + "]";
	}

}