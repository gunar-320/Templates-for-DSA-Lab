import java.util.*;
public class BST{


	//CONSTRUCTOR CLASS FOR NODE AND TREE
	public class Node{
		int data;
		Node left;
		Node right;
		public Node(int data){
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static Node root = null;
	

	//INORDER PRINTING
	public void printInorder(Node res){
		if(res==null){
			return;
		}
		printInorder(res.left);
		System.out.print(res.data+" ");
		printInorder(res.right);
	}
	

	//POSTORDER PRINTING

	public void printPostorder(Node res){
		if(res==null){
			return;
		}
		printPostorder(res.left);
		printPostorder(res.right);
		System.out.print(res.data+" ");
	}


	//PRE ORDER PRINTING
	public void printpreorder(Node res){
		if(res==null){
			return;
		}
		System.out.print(res.data+" ");
		printpreorder(res.left);
		printpreorder(res.right);
	}

	//TO PRINT THE SUM OF BINARY TREE

	public int sumofBST(Node res){
		if(res==null){
			return 0;
		}
		else{
			return res.data+sumofBST(res.left)+sumofBST(res.right);
		}
	}

	//TO CHECK IF A GIVEN TREE IS A BINARY TREE OR NOT!


	//DELETE NODE ITERATIVELY {COVER NODE AS ROOT TEST CASE}
	
	public void insertNodeiter(int tgt){
		Node res = new Node(tgt);
		if(root==null){
			root = res;
			return ;
		}
		Node res2 = null;
		Node temp = root;
		while(temp!=null){
			if(temp.data>tgt){
				res2 = temp;
				temp = temp.left;
			}
			else if (temp.data<tgt){
				res2 = temp;
				temp = temp.right;
			}
		}
		if(res2.data>tgt){
			res2.left = res;
		}
		else{
			res2.right = res;
		}
	}


	//HEIGHT OF BINARY SEARCH TREE

	public int heightBST(Node root){
		if(root==null){
			return 0;
		}
		else{
			int left = heightBST(root.left);
			int right = heightBST(root.right);
			if(left>right){
				return 1+left;
			}
			else{
				return 1+right;
			}
		}
	}


	//NUMBER OF NODES IN BINARY SEARCH TREE
	public int nodesBST(Node root){
		if(root==null){
			return 0;
		}
		else{
			return 1+nodesBST(root.left)+nodesBST(root.right);
		}
	}


	// MINIMUM VALUE NODE VALUE
	public int minvalue(Node root){
		Node res = root;
		while(res.left!=null){
			res=res.left;
		}
		return res.data;
	}

	//MINIMUM VALUE NODE REFERENCE
	public Node minvaluenode(Node root){
		Node res = root;
		while(res.left!=null){
			res=res.left;
		}
		return res;
	}
	//MAXIMUM NODE VALUE
	
	public static void main(String[]args){
		BST st = new BST();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i =0;i<n;i++){
			int a = sc.nextInt();
			st.insertNodeiter(a);

		}
		st.printPostorder(root);



	}

}