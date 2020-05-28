package LinkedList;

public class PrintElement {
	
	static SingleNode head;
	
	public static void printElement() {
		
		if(head ==  null) {
			System.out.println("list is empty");
		}
		
		SingleNode temp = head;
		
		while(temp != null) {
			System.out.println(temp.data);
			temp =  temp.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		head = new  SingleNode(1);
		head.next =  new SingleNode(4);
		head.next.next =  new SingleNode(14);
		printElement();

	}

}
