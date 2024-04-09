package day25;

public class Fitness {
 private int date;
 private int steptaken;
 private int caloriesburned;
public Fitness(int date, int steptaken, int caloriesburned) {
	super();
	this.date = date;
	this.steptaken = steptaken;
	this.caloriesburned = caloriesburned;
}
@Override
public String toString() {
	return "Fitness [date=" + date + ", steptaken=" + steptaken + ", caloriesburned=" + caloriesburned + "]";
}
 public void updatefitness(int date, int steptaken, int caloriesburned) {
	 System.out.println("date is"+date);
	 System.out.println("steptaken is"+steptaken);
	 System.out.println("clory burned is"+caloriesburned);
 }
}
