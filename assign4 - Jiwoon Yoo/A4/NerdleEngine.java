package A4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class NerdleEngine {


    private final String JOKEFILE = "src/a4/words.txt";
    private String[] deflatedObjectParts; 	
	private String secretWord; 
	private int guessNumber = 0; 	//
	private int[] letterStatus = new int[5]; 
	private Boolean winner = false; 
	
	//constructor
	public NerdleEngine() {
		this.secretWord = selectSecretWordFromFile(); 
	}
	
	
	//method()
	public GuessResponse makeGuess(String guessWord) {
		guessNumber++; 
		
		//letterStatus - secretWord / guessWord 
		for(int i = 0; i < 5; i++) {
			if(secretWord.charAt(i) == guessWord.charAt(i)) {
				letterStatus[i] = 2; 
			}else{		
				
				letterStatus[i] = 0; 
				
				for(int j = 0; j < 5; j++) {
					if(secretWord.charAt(i) == guessWord.charAt(j) ) {		
						letterStatus[i] = 1; 
					}
				}
				
				
			}
		}
		
		//all 2 
		if(letterStatus[0] == 2 && letterStatus[1] == 2 && letterStatus[2] == 2 && letterStatus[3] == 2 && letterStatus[4] == 2) {
			winner = true; 
		}
		

		GuessResponse guessResponse = new GuessResponse(guessNumber, winner, guessWord, letterStatus); 

	

		
		return guessResponse; 
	}


	
	

	public String selectSecretWordFromFile() 
    {
        File file = new File(JOKEFILE);
        try (Scanner scan = new Scanner(file)) {
           
            deflatedObjectParts = scan.nextLine().split("#");
 
                
        } catch (FileNotFoundException err) {
            System.out.println("LOG- ERROR - jokefile not found");
      
        }
        

        
        Random r = new Random();         
       
        String selectedStr =deflatedObjectParts[r.nextInt(0, 25)]; 
        
       System.out.println("hint : " + selectedStr);
        
        return selectedStr; 
		
	
    }

}
