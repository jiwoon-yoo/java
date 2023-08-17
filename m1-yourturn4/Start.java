package yourturn4;

public class Start {

	public static void main(String[] args)  {
		
		
		try {

			Heart heart = new Heart(30);
			heart.oneMinute();
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	
		

	}

}
