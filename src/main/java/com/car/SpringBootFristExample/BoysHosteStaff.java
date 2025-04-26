package com.car.SpringBootFristExample;

public class BoysHosteStaff {

	 int sId;
	 String sName;

	public BoysHosteStaff() {
		super();
	}

	public BoysHosteStaff(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "BoysHosteStaff [sId=" + sId + ", sName=" + sName + "]";
	}

}
