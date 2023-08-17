package yourturn3;

public class Car {

	private String license;
	private String model; 
	private String colour; 
	private int year;
	
	//constructor
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	//full constructor		
	public Car(String license, String model, String colour, int year) {

		this.license = license;
		this.model = model;
		this.colour = colour;
		this.year = year;
	}



	//setter
	public void setLicense(String license) {
		this.license = license;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setYear(int year) throws Exception{
		
		if(year > 2015 || year < 2000) {
			throw new Exception("illegal manufactured year" + this.year); 
		}
		
		this.year = year;
	}

	//getter
	public String getLicense() {
		return license;
	}
	public String getModel() {
		return model;
	}
	public String getColour() {
		return colour;
	}
	public int getYear() {
		return year;
	} 
	
	
	//method 
	
	
	
	
}



