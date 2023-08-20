package yourturn2;

public class Stack {

	private int topIndex; 	//주의. 최상단 element보다 한개더 상단의 가상 element의 index에 대한 변수임 
	private Movie[] movies = new Movie[10];		
	
	//push() 
	public void push(Movie movie) throws Exception {
		
		if(this.topIndex == movies.length) {
			
			throw new Exception("out of bound"); 
		}
		
		movies[this.topIndex] = movie;
	
		this.topIndex++; 
	}
	
	//pop() return element gotten rid of 
	public Movie pop() throws Exception {
		
		if(topIndex < 0) {
			
			throw new Exception("stack is empty"); 
		}
		
		this.topIndex--; 
		
		return movies[topIndex];  
	}
	
	//size() 
	public int size() {
		
		return this.topIndex;		//가상의 index이기 때문에, 그자체가 size가 됨  
	}
	
	//peek() 
	public Movie peek() {
		
		
		return this.movies[this.topIndex - 1];
	}

}
