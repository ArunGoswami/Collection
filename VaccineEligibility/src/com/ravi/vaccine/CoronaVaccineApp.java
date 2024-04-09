package com.ravi.vaccine;

public class CoronaVaccineApp  {
public static void main(String[] args) {
	User user1=new User("sonu",new VaccineEligibility(18, false),new DoseBooking(true) );
	User user2=new User("monu",new VaccineEligibility(18, false),new DoseBooking(true) );

	
	 Thread thread1=new Thread() {
		@Override
		public void run() {
			boolean b=user1.bookDose();
			if(user1.isEligible()) {
				System.out.println(user1.bookDose());
			}	
		} 
	 };
	 Thread thread2=new Thread() {
			@Override
			public void run() {
				user2.bookDose();
				if(user2.isbookDose()) {
					System.out.println(user1.bookDose());
				}	
			} 
		 };
	 thread1.start();
	 thread2.start();
}
}
