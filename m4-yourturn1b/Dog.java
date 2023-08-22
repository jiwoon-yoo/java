package yourturn1b;

public class Dog extends Animal{

	//constructor 
	public Dog(String name, String favFood) {
		super(name, 4, favFood); 
	}
	
	@Override
	public void makeNoise() {
	
		System.out.println(this.name + "bark");
		
	}
}
