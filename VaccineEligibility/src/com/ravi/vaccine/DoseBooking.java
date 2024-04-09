package com.ravi.vaccine;

public class DoseBooking {
	private boolean booked;

	public DoseBooking(boolean booked) {
		super();
		this.booked = booked;
	}
	
	public boolean bookDose()
{
		if(booked==true) {
		throw new RuntimeException("vaccine already booked");
		}
		else {
			System.out.println("Vaccine not booked");
		}
		return booked;
}
	public boolean isDoseBooked(){
    if(booked==true) {
	return true;
    }
     else {
	return false;
}
}
}


