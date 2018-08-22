package recipeApplication;
public class Starter extends Recipe {
	protected int levelOfSalt;
	
	public Starter(String[] ingredient, String dishName, double prepTime) {
		super(ingredient,dishName,prepTime);
		this.ingredient = ingredient;
		this.dishName = dishName;
		this.prepTime= prepTime;
	}
	
	@Override
	public void prepare() {
		System.out.println("preparing a starter!!!");
	}

	@Override
	public void taste() {
		if(tasteGood())
		System.out.println("salt level is " + levelOfSalt);
		else
			System.out.println("Salt level is not accurate !");
	}
	
	public boolean tasteGood() {
		if(levelOfSalt > 4 && levelOfSalt <8)
			return true;
			return false;
	}

}
