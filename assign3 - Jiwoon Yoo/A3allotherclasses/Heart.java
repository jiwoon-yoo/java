package A3allotherclasses;
import A3startclass.Start;

public class Heart {
	private int bpm; 
	private HeartBeat heartBeat;

	
	//constructor
	public Heart(int bpm, HeartBeat heartBeat) {
		this.bpm = bpm;
		this.heartBeat = heartBeat;
	} 
	
	//getter()
	public int getBpm() {
		return bpm;
	}
	
	//setter()

	public void setBpm(int bpm) {
		this.bpm = bpm;
		
	}
	
	//method() 
	public void oneMinute() {
		for(int i = 1; i <= bpm; i++) {
			System.out.print(heartBeat + " ");
		}
	}
	
}
