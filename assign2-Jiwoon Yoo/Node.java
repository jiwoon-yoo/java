
public class Node {
	private Node nextNode = null; 
	private Customer payload = null;		
	
	//contructor
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(Customer cm) {
		this.payload = cm; 
	}
	public Node(Customer cm, Node nextNode) {
		this.payload = cm; 
		this.nextNode = nextNode; 
	}
	
	//setter()
	public void setPayload(Customer cm) {
		this.payload = cm;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	//getter()
	public Customer getPayload() {
		return payload;
	}
	public Node getNextNode() {
		return nextNode;
	}

	
}
