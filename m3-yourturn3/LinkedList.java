package yourturn3;

public class LinkedList {

	private int size = 0; 			//(주의. Stack 구현과 달리, size 변수자체로 존재)
	private Node head = null; 		//가장 first, left, front node를 가리키는 변수 
	
	//size() 
	public int size() {
		
		return this.size;
	}
	
	//addFirst(node)
	public void addFirst(Movie movie) {
		
		Node node = new Node(movie, this.head); 
		this.head = node; 
		
		this.size++;
	}
	
	//addLast(node)
	public void addLast(Movie movie) {		
		
		Node node = new Node(movie, null);
		
		//no Node until now 
		if(this.head == null) {
			

			this.head = node; 	///중요 
			this.size++; 
			
			return; 	//
		}
		
		
		Node shuttle = this.head; 
		
		while(shuttle.getNextNode() != null) {
		
			shuttle = shuttle.getNextNode(); 
		}
		
		shuttle.setNextNode(node);
		this.size++;
		
	}
	
	
	
	
	//removeFirst()
	public Movie removeFirst() throws Exception {  //return 제거되는 node의 payload가 반환됨 
		
		if(this.head == null) {
			
	         throw new Exception("No nodes in list...cannot remove node");
		}
		
		Movie returnVal = this.head.getPayload();
		this.head = this.head.getNextNode(); 
		
		
		return returnVal; 
	}
	
	//removeLast()
	public Movie removeLast() throws Exception {

	   if (head == null) {
		   throw new Exception("No nodes in list...cannot remove node");
	   }
		
		
		Node shuttle = this.head; 
		Node secondLastNode = null;
		
		while(shuttle.getNextNode() != null) {
	
			secondLastNode = shuttle;
			
			shuttle = shuttle.getNextNode(); 
			
		}
		
		//shuttle - 뒤에서 두번째 노드    shuttle.getNExtNode - 마지막 노드 
		Movie returnVal = shuttle.getPayload(); 
		secondLastNode.setNextNode(null);
		
		this.size--;
		
		return  returnVal; 
	}
	
	
	
	
	
}
