package abst;

public class Egg extends Food{
	int tastyScore = 7;
			String type = "non-vegetarian";


	public Egg(int tastyScore,double proteins,double fats,double carbs ) {
				super(carbs, carbs, carbs, carbs);
				this.tastyScore =7 ;
				this.type = "non-vegetarian" ;
				this.proteins=proteins;
			}

	@Override
	public void getMacroNutrients() {
		System.out.println( "An egg has"+""+this.proteins +"gms of protein,"
				+  this.fats+" gms of fats and"
				+this.carbs+" gms of carbohydrates.");
		
	}

}
