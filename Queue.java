import java.util.*;
public class QueueNode{
	int data;
	Node Link;
	public Node(int data){
		this.data = data;
		this.Link = null;
	}
}
public class QueueTemplate{
	QueueNode front rear;
	public Queue(){
		this.front = this.rear = null;
	}

	public void enqueue(int data){
		QueueNode temp = new QueueNode(data);
		if(this.rear == null){
			this.front = this.rear = temp;
			return;
		}

		this.rear.Link = temp;
		this.rear = temp;
	}
	public void dequeue(){
		if(this.front == null){
			return;
		}
		QueueNode temp = this.front;
		this.front = this.front.Link;
		if(this.front == null){
			this.rear = null;
		}
	}

}
public class Queue{
	public static void main(String[]args){
		QueueTemplate q = new QueueTemplate();
		
	}
}