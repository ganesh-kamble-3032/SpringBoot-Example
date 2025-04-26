package com.car.SpringBootFristExample;

import java.util.List;

public class Hostel {

	private static String hName = "JAVA BY KIRAN HOSTEL IN KARVE NAGAR";
	private int stdId;
	private String stdName;
	private String StdAddress;
	private long mobileNumber;
	private String Acadymicyear;
	private String Branch;
	private String roomNumber;
	private String floor;
	
	
	
	
	private List<BoysHosteStaff> staff;
	private List<GirlssHosteStaff> staff1;

	public static String gethName() {
		return hName;
	}

	public static void sethName(String hName) {
		Hostel.hName = hName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAddress() {
		return StdAddress;
	}

	public void setStdAddress(String stdAddress) {
		StdAddress = stdAddress;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAcadymicyear() {
		return Acadymicyear;
	}

	public void setAcadymicyear(String acadymicyear) {
		Acadymicyear = acadymicyear;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}


	public List<BoysHosteStaff> getStaff() {
		return staff;
	}

	public void setStaff(List<BoysHosteStaff> staff) {
		this.staff = staff;
	}

	

	public Hostel(int stdId, String stdName, String stdAddress, long mobileNumber, String acadymicyear, String branch,
			String roomNumber, String floor, List<BoysHosteStaff> girlshstaff) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		StdAddress = stdAddress;
		this.mobileNumber = mobileNumber;
		Acadymicyear = acadymicyear;
		Branch = branch;
		this.roomNumber = roomNumber;
		this.floor = floor;
		this.staff = girlshstaff;
	}

	public Hostel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hostel [stdId=" + stdId + ", stdName=" + stdName + ", StdAddress=" + StdAddress + ", mobileNumber="
				+ mobileNumber + ", Acadymicyear=" + Acadymicyear + ", Branch=" + Branch + ", roomNumber=" + roomNumber
				+ ", floor=" + floor + ", staff=" + staff + "]";
	}
	
	
	


	

	
	
}
