package yourturn6;

public class ParkingLot {

	private String lotName; 
	private Car[][] cars; 
	
	//constructor
	public ParkingLot() {
		// TODO Auto-generated constructor stub
	}

	public ParkingLot(String lotName) {
		
		cars = new Car[2][]; 	//
		cars[0] = new Car[3];	// 
		cars[1] = new Car[2]; 	//
		this.lotName = lotName;
	}
	
	//getter
	public String getLotName() {
		return lotName;
	}
	
	
	//method 
	public String parkCar(Car car) {
		
		for(int i = 0; i < cars.length; i++) {
			for(int j = 0 ; j < cars[i].length; j++) {
				
				if(cars[i][j] == null) {
					cars[i][j] = car; 
					
					return "cars is parked";
				}
			}
		}
		
		return "parking lot is full"; 
		
	}
	
	public void printStatus() {
		
		String returnVal = this.lotName + "\n";
		
		for(int i = 0; i < cars.length; i++) {
			
			returnVal += "Lot Level " + i + "\t"; 
			
			for(int j = 0; j  < cars[i].length; j++) {
				
			
				
				if(cars[i][j] == null) {
					returnVal += "EMPTY\t"; 
				}else {
					returnVal += cars[i][j].getLicensePlate() + "\t"; 
				}
			}

			returnVal += "\n"; 
		}
		
		System.out.println(returnVal);
	}
	
	
	
	public Car retrieveCar(String licensePlate) {
		
		for(int i = 0; i < cars.length; i++) {
			for(int j = 0 ; j < cars[i].length; j++) {
				
				if(cars[i][j].getLicensePlate() == licensePlate) {
					
					Car returnCar = cars[i][j]; 
					cars[i][j] = null;	
					
					return returnCar;
				}
			}
		}
		
		return null;
	}
	
}
