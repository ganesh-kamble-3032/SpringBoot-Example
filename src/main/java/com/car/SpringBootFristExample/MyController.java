package com.car.SpringBootFristExample;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@PostMapping("inserthostel")
	public void insertHostel(@RequestBody Hostel hostel) {

		System.err.println(hostel);
	}

	@DeleteMapping("removestudents/{stdId}")
	public void removeStudents(@PathVariable("stdId") int stdId) {

		System.err.println("Id Of Students" + stdId);
		System.err.println();

	}

	@PutMapping("updatestudent")
	public void updateStudnts() {

	}

//	@GetMapping("/springFrist")
//	public String getWelcome() {
//
//		return "Welcome Spring Boot";
//
//	}
//
//	@GetMapping("/allStudents")
//	public static ArrayList<Hostel> fetchAllHostelStudent() {
//		ArrayList<Hostel> hostel = new ArrayList<Hostel>();
//		hostel.add(
//				new Hostel(12, "Rutvik Patil", "Shivaji Nagar(Pune)", 747485965, "Final Year", "CSE", "C-38", "5th"));
//		hostel.add(new Hostel(13, "Mangesh Patil", "Karve Nagar(Pune)", 789456123, "Final Year", "CSE", "C-42", "4th"));
//
//		return hostel;
//
//	}

	@GetMapping("/boyshostel")
	public static List<Hostel> fetchAllBoysHostelStaff() {
		BoysHosteStaff bhs1 = new BoysHosteStaff(1, "Prathmesh");
		BoysHosteStaff bhs2 = new BoysHosteStaff(2, "Rutvik");
		BoysHosteStaff bhs3 = new BoysHosteStaff(3, "Mahadev");
		List<BoysHosteStaff> boyshstaff = new ArrayList<BoysHosteStaff>();
		boyshstaff.add(bhs1);
		boyshstaff.add(bhs2);
		boyshstaff.add(bhs3);
		Hostel hostel = new Hostel(101, "BoyHostel", "pune", 456787654L, "2022", "CSE", "1001", "2nd", boyshstaff);
		List<Hostel> allStaff = new ArrayList<Hostel>();
		allStaff.add(hostel);

		return allStaff;

	}

//	public static List<Hostel> fetchAllGirlsHostelStaff(){
//		GirlssHosteStaff ghs1 = new GirlssHosteStaff(1,"xyz");
//		GirlssHosteStaff ghs2 = new GirlssHosteStaff(2,"abx");
//		GirlssHosteStaff ghs3 = new GirlssHosteStaff(3,"pqr");
//		List<GirlssHosteStaff> girlshstaff = new ArrayList<GirlssHosteStaff>()	;
//		girlshstaff.add(ghs1);
//		girlshstaff.add(ghs2);
//		girlshstaff.add(ghs3);
//		List<Hostel> allStaff = new ArrayList<Hostel>();
//		
//		return null;
//	}

}
