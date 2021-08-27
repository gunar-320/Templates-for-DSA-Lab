import java.util.*;

public class Stacks2{
	

	public int stack[] = new int[2021];
	public int top = 0;

	public int size(){
		return top;
	}

	public void push(int data){
		
	
		stack[top] = data;
		top = top+1;
	
	}

	public int pop(){
		if(top == -1){
			System.out.println("stack khali h");
			return 0;
		}
		else{
			int temp = stack[top-1];
			stack[top] = 0;
			top = top-1;
			return temp;
		}
	}

	public int peek(){
		if(top==-1){
			System.out.println("stack khali h");
			return 0;
		}
		else{
			return stack[top-1];
		}
	}

	public void printStack(){
		for(int i =0;i<top;i++){
			System.out.print(stack[i]+" ");
		}
		System.out.println();
		return;

	}
	public boolean isEmpty(){
		return (top==0);
	}


	public static void main(String[]args){
		Stacks2 st = new Stacks2();
		st.push(2);
		st.push(3);
		st.push(4);

		st.printStack();

		System.out.println(st.peek());
		st.printStack();

		System.out.println(st.pop());

		st.printStack();
	}
}
