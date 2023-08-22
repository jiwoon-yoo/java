package yourturn1b;

public abstract class Animal {
	
	protected String name;
	protected int numberOfLegs; 
	protected String favFood; 
	
	//constructor 
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	

	public Animal(String name, int numberOfLegs, String favFood) {
	
		this.name = name;
		this.numberOfLegs = numberOfLegs;
		this.favFood = favFood;
	}


	//getter, setter 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	
	//method 
	public abstract void makeNoise(); 
	
	public void eat() {
		
		System.out.println(this.name + " is eating " + this.favFood);
	}
	
}
