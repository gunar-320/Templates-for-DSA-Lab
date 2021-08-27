//Developed and Learned from GeeksforGeeks and JavaTpoint.
//GUNAR SINDHWANI ROLL NUMBER - 2020199
import java.util.*;
public class Queues{
	class Node{
	int data;
	Node Link;
	public Node(int data){
		this.data = data;
		this.Link = null;
		}
	}
	Node front;
	Node rear;
	public Queues(){
	this.front = null;
	this.rear = null;
	}
	

	public void enqueue(int data){
		Node temp = new Node(data);
		if(this.rear == null){
			this.front = this.rear = temp;
			return;
		}

		this.rear.Link = temp;
		this.rear = temp;
	}
	public void dequeue(){
		if(this.front == null){
			System.out.println("EMPTY");
			return;
		}
		Node temp = this.front;
		this.front = this.front.Link;
		if(this.front == null){
			this.rear = null;
		}
	}
	public int peek(){
		if (front!=null){
			return front.data;
		}
		else{
			
			return -1;
		}
	}

	public static void main(String[]args){
		Queues q = new Queues();
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		for(int i =0;i<tot;i++){
			int a = sc.nextInt();
			if(a==1){
				int b = sc.nextInt();
				q.enqueue(b);
			}
			if(a==2){
				q.dequeue();
			}
			if(a==3){
				int c = q.peek();
				if(c==-1){
					System.out.println("EMPTY");
				}
				else{
				System.out.println(c);
				}
			}
		}
		
	}

}
	
