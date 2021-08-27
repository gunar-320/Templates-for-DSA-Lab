//TEMPLATE FOR AVL TREES
//GUNAR SINDHWANI , ROLL NUMBER = 2020199
import java.util.*;
import java.lang.Math;
public class AVLTree{
//DECLARATION OF NODE
//******************************************************************************************************************************************************************************	
    static Node root;
    static class Node{
        Node left;
        Node right;
        int data;
        Node(int tgt){
            data = tgt;
            left = null;
            right = null;
        }
    }
//*********************************************************************************************************************************************************************************

//CALCULATION OF PROPERTIES OF AVL TREES AND MINIMUM AND MAXIMUM VALUES	
//**********************************************************************************************************************************************************************************
	static int nodesAVL(Node root){
		if(root==null){
			return 0;
		}
		else{
			return 1+ nodesAVL(root.left)+nodesAVL(root.right);
		}
	}
	static int minVal(Node root){
		Node res = root;
		while(res.left!=null){
			res=res.left;
		}
		return res.data;
	}
	static Node minValNode(Node root){
		Node res = root;
		while(res.left!=null){
			res = res.left;
		}
		return res;
	}

	static Node maxValNode(Node root){
		Node res = root;
		while(res.right!=null){
			res = res.right;
		}
		return res;
	}
	static int maxVal(Node root){
		Node res = root;
		while(res.right!=null){
			res = res.right;
		}
		return res.data;
	}
//*********************************************************************************************************************************************************************************************

//PRINTING PRE ORDER , POST ORDER , INORDER
//*********************************************************************************************************************************************************************************************
	static void printInorder(Node root){
		if(root==null){
			return;
		}
		printInorder(root.left);
		System.out.print(root.data+" ");
		printInorder(root.right);
	}
	public void printPostorder(Node res){
		if(res==null){
			return;
		}
		printPostorder(res.left);
		printPostorder(res.right);
		System.out.print(res.data+" ");
	} 
	public void printPreorder(Node res){
		if(res==null){
			return;
		}
		System.out.print(res.data+" ");
		printPreorder(res.left);
		printPreorder(res.right);
	}
	public int sumofAVL(Node res){
		if(res==null){
			return 0;
		}
		else{
			return res.data+sumofAVL(res.left)+sumofAVL(res.right);
		}
	}
//**************************************************************************************************************************************************************************************************
	static Node LLRot(Node res){
		Node q = res.left;
		Node w = q.right;
		q.right = res;
		res.left = w;
		if(root==res){
			root = q;
		}
		return q;
	}
	static Node RRRot(Node res){
		Node q = res.right;
		Node w = q.left;
		q.left = res;
		res.right = w;
		if(root == res){
			root = q;
		}
		return q;
	}
	static Node LRRot(Node res){
        Node q = res.left;
        Node w = q.right;
        q.right = w.left;
        res.left = w.right;
        w.left = q;
        w.right = res;
        if(root == res){
            return w;
        }
        return w;
    }
    static Node RLRot(Node res){
        Node q = res.right;
        Node w = q.left;
        q.left = w.right;
        res.right = w.left;
        w.right = q;
        w.left = res;
        if(root == res){
            return w;
        }
        return w;
    }
	static Node insert(Node root,int tgt){
		if(root==null){
			root = new Node(tgt);
			return root;
		}
		if(root.data<tgt){
			root.right = insert(root.right,tgt);
		}
		if(root.data>tgt){
			root.left = insert(root.left,tgt);
		}

		// CASE FOR LL ROTATION
		if(BF(root)>1 && BF(root.left)>=0){
			return LLRot(root);
		}
		//CASE FOR RR ROTATION
		if(BF(root)<-1 && BF(root.right)<=0){
			return RRRot(root);
		}
		//CASE FOR LR ROTATION
		if(BF(root)>1 && BF(root.left)<0){
			return LRRot(root);
		}
		//CASE FOR RL ROTATION
		if(BF(root)<-1 && BF(root.right)>0){
			return RLRot(root);
		}
		return root;
	}
	static Node delete(Node root,int tgt){
		if(root==null){
			return root;
		}
		else if(root.data<tgt){
			root.right = delete(root.right,tgt);
		}
		else if(root.data>tgt){
			root.left = delete(root.left,tgt);
		}
		else{
			if(root.right == null){
				return root.left;
			}
			else if(root.left == null){
				return root.right;
			}
			else{
				root.data = minVal(root.right);
				root.right = delete(root.right,root.data);
			}
		}
		//CASE FOR LL ROTATION
		if(BF(root)>1 && BF(root.left)>=0){
			return LLRot(root);
		}
		//CASE FOR RR ROTATION
		if(BF(root)<-1 && BF(root.right)<=0){
			return RRRot(root);
		}
		//CASE FOR LR ROTATION
		if(BF(root)>1 && BF(root.left)<0){
			return LRRot(root);
		}
		//CASE FOR RL ROTATION
		if(BF(root)<-1 && BF(root.right)>0){
			return RLRot(root);
		}
		return root;

	}

	static int height(Node root){
		if(root==null){
			return 0;
		}
		else{
			return 1+ Math.max(height(root.left),height(root.right));
		}
	}
	static int minHeight(int a){
		return (int)(Math.log(a)/Math.log(2));
	}
	static int maxHeight(int a){
		return (int)(1.44*(Math.log(a)/Math.log(2)));
	}
	static int maxNodes(int h){
		int z = (int)Math.pow(2,h+1);
		return z-1;
	}
	static int minNodes(int h){
		if(h==0){
			return 1;
		}
		if(h==1){
			return 2;
		}
		else{
			return minNodes(h-1)+minNodes(h-2)+1;
		}
	}

	static int BF(Node root){
		int left = height(root.left);
		int right = height(root.right);
		return left-right;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		for(int i =0;i<len;i++){
			int b = sc.nextInt();
			root = insert(root,b);
		}
		printInorder(root);
		delete(root,4);
		delete(root,3);
		printInorder(root);
		int a = maxNodes(3);
		System.out.println(a);
	}

}
