import java.util.Scanner;

public class BubbleSortLL {
	
	 public static Node<Integer> sort(Node<Integer> head , int size) {
		    if (size > 1) {
		    //	Node<Integer>temp=head;
		        for (int i = 0; i < size; i++ ) {
		            Node<Integer> currentNode = head;
		            Node<Integer> nextNode = currentNode.next;
		            for (int j = 0; j < size - 1; j++) {
		                if (currentNode.data > nextNode.data) {
		                    int temp1 = currentNode.data;
		                    currentNode.data = nextNode.data;
		                    nextNode.data = temp1;
		                } 
		                currentNode = currentNode.next;
		                nextNode = currentNode.next;                   
		            } 
		            
		        }
		    }
	return head;	
	 }
	 
	 public static int Length_LL(Node<Integer>head) {
		
		 int c=0;
		 while(head!=null) {
			 c++;
			 head=head.next;
		 }
		 return c;
	}
	 
	 public static Node <Integer> takeInput(){
			
			Node<Integer> head = null;
			Scanner s = new Scanner(System.in);
			int data = s.nextInt();
			
			while(data!=-1) {
				
				Node <Integer> newNode = new Node <Integer>(data);
				if(head==null)
					head = newNode;
				
				else {
					Node<Integer> temp = head;
					while(temp.next!=null)
						temp= temp.next;
				temp.next= newNode;
				}
				
				data = s.nextInt();
			}
			return head;
			
		}
		
	 public static void print(Node<Integer>head) {
			
				while(head!=null)
		{
				
		System.out.print(head.data+" ");
		head= head.next;
		}
				
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
int size =Length_LL(head);
	Node<Integer> head2 =sort(head, size);
	print(head2);
	}

}
