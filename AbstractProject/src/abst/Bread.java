package abst;

public class Bread extends Food {
	int tastyScore = 8;
			String type = "vegetarian";
Bread(double proteins,double fats,double carbs,double tastyScore){
	super(tastyScore, tastyScore, tastyScore, tastyScore);
	this.tastyScore =8 ;
	this.type = "vegetarian" ;
}
	@Override
	public void getMacroNutrients() {
		// TODO Auto-generated method stub
		System.out.println(" A slice of bread has "+this.proteins+" gms of protein,"
				+ this.fats+" gms of fats and+ this.carbs"+" gms of carbohydrates.");
		 
	}

}
