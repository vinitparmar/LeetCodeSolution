package LinkedList;

public class InsertNodeToTail {
	
	static SingleNode head;
	
	static void addNodeToTail(SingleNode node) {
		
		if(head == null) {
			
			head =  node;
			
		}
		
		SingleNode temp = head;
		
		while(temp != null) {
			
			System.out.println(temp.data);
			if(temp.next == null ) {
				temp.next =  node;
				temp =  temp.next;
				System.out.println(temp.data);
				break;
			}
			temp =  temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head = new  SingleNode(1);
		head.next =  new SingleNode(4);
		head.next.next =  new SingleNode(14);
		
		SingleNode t = new SingleNode(55);
		
		addNodeToTail(t);

	}

}
