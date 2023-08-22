package yourturn3;

public class Node {

	private Movie payload; 		//Movie
	private Node nextNode; 
	
	//constructor 
	public Node() {
		// TODO Auto-generated constructor stub
	}

	public Node(Movie payload, Node nextNode) {
		this.payload = payload;
		this.nextNode = nextNode;
	}

	public Movie getPayload() {
		return payload;
	}

	public void setPayload(Movie payload) {
		this.payload = payload;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	
	
	
	
	
}
