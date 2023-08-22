package yourturn1b;

public class Lion extends Animal{

	//constructor 
	public Lion(String name, String favFood) {
		super(name, 4, favFood); 
	}
	
	@Override
	public void makeNoise() {
		
		System.out.println(this.name + "arrr");
		
	}

}
