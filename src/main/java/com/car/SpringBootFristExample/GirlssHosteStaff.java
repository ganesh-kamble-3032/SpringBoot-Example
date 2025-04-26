package com.car.SpringBootFristExample;

public class GirlssHosteStaff {

	int ghsId;
	String ghsName;

	public GirlssHosteStaff() {
		super();
	}

	public GirlssHosteStaff(int ghsId, String ghsName) {
		super();
		this.ghsId = ghsId;
		this.ghsName = ghsName;
	}

	public int getGhsId() {
		return ghsId;
	}

	public void setGhsId(int ghsId) {
		this.ghsId = ghsId;
	}

	public String getGhsName() {
		return ghsName;
	}

	public void setGhsName(String ghsName) {
		this.ghsName = ghsName;
	}

	@Override
	public String toString() {
		return "GirlssHosteStaff [ghsId=" + ghsId + ", ghsName=" + ghsName + "]";
	}

}
