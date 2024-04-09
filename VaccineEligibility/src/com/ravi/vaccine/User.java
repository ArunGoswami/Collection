package com.ravi.vaccine;

public class User {
	private String name;
	private VaccineEligibility eligibility;
	private DoseBooking doseBooking;
	

	
	public User(String name, VaccineEligibility eligibility, DoseBooking doseBooking) {
		super();
		this.name = name;
		this.eligibility = eligibility;
		this.doseBooking = doseBooking;
	}
	public boolean bookDose()
    { 
		return doseBooking.bookDose();
		
    }
	public boolean isbookDose()
    { 
		return doseBooking.isDoseBooked();
		
    }
	public boolean isEligible() {
		return eligibility.isEligible();
	}
}
