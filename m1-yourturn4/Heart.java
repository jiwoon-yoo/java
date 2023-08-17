package yourturn4;

public class Heart {

	private int bpm; 
	
	public Heart() {
		// TODO Auto-generated constructor stub
	}

	public Heart(int bpm) throws Exception {

		setBpm(bpm); 
	}

	//setter
	public void setBpm(int bpm) throws Exception{
		
		if(bpm < 50) {
			
			throw new Exception("wrong bpm " + bpm);
		}
		
		this.bpm = bpm;
	}
	
	//getter
	public int getBpm() {
		return bpm;
	}
	
	//method 
	public void oneMinute() {
		
		for(int i = 1; i <= bpm; i++) {
			
			System.out.println(i + " Thumpity");
		}
	}
	
	
}
