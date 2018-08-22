package recipeApplication;

public class testingRecipe {
	
	
	public static void main(String[] args) {
		String[] ingredient1 = {"flour","sugar", "milk"};
		String[] ingredient2 = {"flour","salt", "milk"};
		
	//	String ingredient[] = {"flour","sugar", "milk"}
		
	Dessert a = new Dessert(ingredient1, "Rasmalai",23.0);
	System.out.println(a.dishName);

	a.prepare();
	a.taste();
	a.cleanUp();
	Starter b = new Starter(ingredient2,"Samosa",12.0);
	System.out.println(b.dishName);
	b.prepare();
	b.taste();
	
	b.cleanUp();
	printIsDessert(a); 
	
	}
	


	
	public static boolean isDesert(Recipe a) {  // checks based on ingredient if the recipe is desert or starter
		for(int i=0;i<a.ingredient.length;i++) {
		if(a.ingredient[i] == "salt")
			return false;}
		 return true;
		}
	
	public static void printIsDessert(Recipe a) {  // prints based on isDessert method result
		if(isDesert(a)) 
			System.out.println( a.dishName + " is in " + a.getClass().getSimpleName() + " class and is a desert");
		else
			System.out.println(a.dishName +" is in " +  a.getClass().getSimpleName() + " class and  is a starter !!");
			
		}
		
	}
	



