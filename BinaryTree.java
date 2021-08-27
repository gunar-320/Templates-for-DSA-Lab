class Node{
		int data;
		Node left;
		Node right;

		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
}

class BiT{
	Node root;
	
	BiT(int val){
		root = new Node(val);
	}
		
	public void AddLevel(int a , int b){
		if(root.left==null&&root.right==null){
			root.left = new Node(a);
			root.right = new  Node(b);
		}
	}
	
	public void printBT(Node node){
		if(node==null){
			return;
		}
		else{
			if(node.left!=null){
				printBT(node.left);	
			}
			
			System.out.print(node.data+ " ");
			
			if(node.right!=null){
				printBT(node.right);
			}
		}
	}
}


public class BinaryTree{	
	public static void main(String []args){
		BiT a = new BiT(1);
		
		a.AddLevel(2,3);
		a.printBT(a.root);
	}
}