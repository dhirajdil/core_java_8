package DataStructure;

import java.util.*;
import java.util.LinkedList;

import binaryTree.BinaryNode;

public class BinaryMiddle {
	BinaryNode root;
	
	public void insert(int value) {
		BinaryNode node=new BinaryNode();
		node.setValue(value);
		if(root==null) {
			root=node;
			return;
		}
		Queue<BinaryNode> que = new LinkedList<BinaryNode>();
		que.add(root);
		while(que.isEmpty()) {
		BinaryNode presentNode=que.remove();
		if(presentNode.getLeft()==null) {
			presentNode.setLeft(node);
		}else {
			presentNode.setRight(node);
		}
	}
	}
	public void search(int value) {
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			
		}
	}

}
