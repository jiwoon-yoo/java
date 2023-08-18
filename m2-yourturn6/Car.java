package yourturn6;

public class Car {

	private String model; 
	private String colour; 
	private String licensePlate;
	
	//constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String model, String colour, String licensePlate) {

		this.model = model;
		this.colour = colour;
		this.licensePlate = licensePlate;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	

	
}
