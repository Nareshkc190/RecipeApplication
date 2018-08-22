package recipeApplication;

public abstract class Recipe {
	protected String[] ingredient;
	protected String dishName;
	protected double prepTime;
	
	
	
	public Recipe(String[] ingredient, String dishName, double prepTime) {
		this.ingredient = ingredient;
		this.dishName = dishName;
		this.prepTime = prepTime;
	}
	
	//abstract methods
	public abstract void prepare();
	public abstract void taste();
	public void cleanUp() {
		System.out.println("Load Dishwasher \n");
	}

}
