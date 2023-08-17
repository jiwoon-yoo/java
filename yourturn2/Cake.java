package yourturn2;

public class Cake {

	private int numberOfCandles; 
	private String icingFlavour; 
	private String message; 

	
	

	//setter
	public void setNumberOfCandles(int numberOfCandles) throws Exception{
		
		if(numberOfCandles < 0) {
		
			throw new Exception("illegal number of candles " + this.numberOfCandles); 
		}
		
		this.numberOfCandles = numberOfCandles;
	}




	public void setIcingFlavour(String icingFlavour) {
		this.icingFlavour = icingFlavour;
	}




	public void setMessage(String message) {
		this.message = message;
	}



	//getter

	public int getNumberOfCandles() {
		return numberOfCandles;
	}




	public String getIcingFlavour() {
		return icingFlavour;
	}




	public String getMessage() {
		return message;
	}
	
	
	//method 

	public String describeCake() {
		
		String output = "numer of candles : " + this.numberOfCandles 
				+ "icing flavor : " + this.icingFlavour 
				+ "message : " + this.message; 
		
		return output; 
	}


	
}
