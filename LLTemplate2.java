//LinkedList : Learnt from GFG + JAVATpoint .
//Codeforces - gunar_320
//To run The file use the following command - java LinkedList.java
// FOR FIRST QUESTION!
import java.util.*;
public class LinkedList{

	public class Node{
		int data;
		Node Link;
		public Node(int data){
			this.data = data;
			this.Link = null;

		}
	}
		public Node head = null;
		public Node tail = null;
		public void AddNode(int data){
			Node newNode = new Node(data);
			if(head==null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.Link = newNode;
				tail = newNode;
			}
		}
		// Prints the LinkedList
		public void printLL(){
			Node n = head;
			while(n!=null){
				System.out.print(n.data+" ");
				n=n.Link;
			}
		}
		//Supplement Count Node is used so that the initialising part of
		//head is done in a seperate function as if it is done in recursive
		//one then at every call head would change!
		public int supplement_rec_CountNode(){
			return rec_CountNode(head);
		}
		public int rec_CountNode(Node node){
			if(node == null){
				return 0;
			}
			else{
				return 1+ rec_CountNode(node.Link);
			}

		}
		public void CountSum(){
			Node res = head;
			int sum =0;
			while(res!=null){
				sum+=res.data;
				res=res.Link;
			}
			System.out.println(sum);
		}
		public int countNode(){
			Node res = head;
			int count =0;
			while(res!=null){
				count+=1;
				res=res.Link;
			}
			return count;
		}
		// PushNode adds Data in Front
		public void PushNode(int data){
			Node newNode = new Node(data);
			newNode.Link = head;
			head = newNode;

		}
		public void InsertBetween(int pos , int data){
			int i=1;
			Node res = head;
			while (i<pos-1){
				res= res.Link;
				i+=1;
			}
			Node newNode = new Node(data);
			newNode.Link = res.Link;
			res.Link = newNode;
		}
		public void deleteNodeAt(int pos){
			Node res = head;
			if(head==null){
				return;
			}
			if(pos==0){
				head = res.Link;
				return;
			}
			int i=1;
			while(i<pos-1){
				i+=1;
				res=res.Link;
			}
			Node res2 = res.Link.Link;
			res.Link = res2;

		}
		public void DeleteHead(){
			if(head.Link!=null){
				head=head.Link;
			}
			else{
				head.Link = null;
			}
		}
		public void addNodeEnd(int data){
			Node newNode = new Node(data);
			if(head==null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.Link = newNode;
				tail = newNode;
			}
		}
		

		public static void main (String[] args){
			LinkedList b = new LinkedList();
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			for(int i=0;i<t;i++){
				int a;
				a= sc.nextInt();
				if(a==3){
					b.printLL();
				}
				else{
					int c;
					c=sc.nextInt();
					if(a==1){
						b.addNodeEnd(c);
					}
					if(a==2){
						b.deleteNodeAt(c);
					}
					if(a==4){
						int k = sc.nextInt();
						b.InsertBetween(c,k);
					}
					

			}

		}
			
	}
					

}
