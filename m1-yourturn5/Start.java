package yourturn5;

import youtun5complete.CellPhone;

public class Start {

	public static void main(String[] args) {
		
		try {
			
			CellPhone c1 = new CellPhone();
	        c1.makeCall(9999999);
	        c1.powerButton();
	        c1.makeCall(9999999);
	        c1.makeCall(9999999);
	        c1.hangUp();
	        c1.makeCall(9999999);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

}
