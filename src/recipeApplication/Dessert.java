package recipeApplication;

public class Dessert extends Recipe{
	protected int levelOfSugar;
	String creamColor;
	int marshmallow;
	
	public Dessert(String[] ingredient, String dishName, double prepTime) {
		super(ingredient,dishName,prepTime);
		this.ingredient = ingredient;
		this.dishName = dishName;
		this.prepTime= prepTime;
	}


	@Override
	public void prepare() {
		batter();
		bake();
		decorate("cream");
		System.out.println("\nPrepared !!! ");
		
	}

	@Override
	public void taste() {
		
		if(tasteGood())
		System.out.println("It is delicious !!! ");
		else
			System.out.println("sugar level is not accurate !!! ");
	}
	
	public void batter() {
		System.out.println("Battering !!!   ");
	}
	
	public void bake() {
		System.out.println("Baking !!!  ");
	}
	
	public void decorate(String creamColor) {
		System.out.println("decorating with string creamColor");
		
	}
	
	public int decorate(String creamColor,int marshmallow) {
		this.creamColor = creamColor;
		this.marshmallow = marshmallow;
		return marshmallow;
	}
	
	public String decorate(String[] creamColors) {
		return ("Decorating with colors");
	}
	
	public void decorate(int chocolateChip) {
		System.out.println("void method of decorate ");
	}
	
//	public int decorate(int chocolateChip) {  return type doesnt matter for overloading. 
//		return 1;
//	}
	
	
	
	public boolean tasteGood() {
		if(levelOfSugar > 4 && levelOfSugar <8)
			return true;
			return false;
			}

}
