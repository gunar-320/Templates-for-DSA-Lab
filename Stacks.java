//TEMPLATE FOR STACKS USING LINKED LIST
//IMPLEMENTATION BY GUNAR SINDHWANI 
//CODEFORCES -gunar_320
import java.util.*;
public class Stacks{
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
	public int size = 0;

	public void push(int data){
		Node newNode = new Node(data);
		newNode.Link = head;
		head = newNode;
		size++;
	}

	public int size(){
		return size;
	}

	public void isEmpty(){
		System.out.println(size==0);
	}

	public void pop(){
		if(head.Link != null){
			head = head.Link;
		}
		else{
			head.Link = null;
		}
		size--;
	}

	public void printStack(){
		Node res = head;
		while(res!=null){
			System.out.println(res.data+" ");
			res = res.Link;
		}
	}

	public int peek(){
		Node res = head;
		return res.data;
	} 

	public static void main (String[]args){
		Stacks stk = new Stacks();
		stk.push(1);
		stk.push(2);
		int b = stk.size();
		System.out.println(b);
		stk.pop();
		stk.isEmpty();
		stk.printStack();
		stk.push(6);
		int c = stk.peek();
		System.out.println(c);
	}
	

}