package LinkedList;

public class InsertNodeAtHead {	
	
	static SingleNode head;

	static void addNodeToHead(SingleNode node) {
	
	if(head == null) {
		
		head =  node;
		
		System.out.println(node.data);
		
	}else {
	
	SingleNode temp = node;
	
	temp.next = head;
	
	head = temp;
	
	
	
	while(temp != null) {
		
		System.out.println(temp.data);
		
		temp = temp.next;
		
	}
	
	}
	
}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
//	head = new  SingleNode(1);
//	head.next =  new SingleNode(4);
//	head.next.next =  new SingleNode(14);
	
	SingleNode t = new SingleNode(25);
	
	addNodeToHead(t);

}

}
