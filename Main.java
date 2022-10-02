import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//ArrayList = a collection of resizable array.
		// Elements can be added and removed after compilation phase
		// store reference data types
		
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		food.add("mushrooms");
		food.set(0, "sushi");
		//food.remove(2);
		//food.clear();
		
		for(int i=0; i <food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		
		
		
		
		
	}

}
