package com.arun.ticketBooking;

public class TicketDispenser extends Thread
{
	static int maxSeat=200;
	int allotedSeat=1;
	int n=1;
	
	
	public synchronized int allotSeatNumber(int wantedSeat)
	{
		this.n=wantedSeat;
		if(allotedSeat<=200)
		{
			//td.start();
			System.out.println(allotedSeat++);
			return allotedSeat;
		}
		else
			return -1;
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<n;i++)
		{
			System.out.println(this.allotSeatNumber(5));
		}
	}
	
	public static void main(String[] args) {
		TicketDispenser td = new TicketDispenser();
		td.start();
		
	}
}
