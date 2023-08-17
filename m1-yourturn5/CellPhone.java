package yourturn5;

public class CellPhone {

	private boolean powerOn = false; 	//default false 
	private boolean isUse = false; 
	
	
	//method 
	public void powerButton() {
		
		this.powerOn = !this.powerOn; 
		
		
	}
	
	public void hangUp() {
		
		this.isUse = false; 
	}
	
	
	public void makeCall(int callerNum) throws Exception {
		
		if(this.powerOn == false) {
			
			throw new Exception("power off"); 
		}
		
		System.out.println("Calling...." + callerNum);
		
		this.isUse = true; 
	}
	
}
