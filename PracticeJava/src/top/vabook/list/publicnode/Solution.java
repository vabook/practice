package top.vabook.list.publicnode;

import java.util.List;

import top.vabook.list.publicnode.Solution.Node;
import top.vabook.stack.MinStack.NewStack;

/**
 * @author vabook@163.com
 * @version 2018年8月14日 下午6:58:23
 * 找处两个链表中的第一个结点
 */
public class Solution {
	public static class Node{
		int val ;
		Node nextNode;
		public Node() {
			
		}
		public Node(int val,Node node) {
			this.val =val;
			this.nextNode = node;
		}
	}
	public  static  Node findFirstPublicNode(Node node1,Node node2) {
		if (node1 == null || node2 == null) {
			return null;
		}
		Node LongNode = null;
		Node shortNode = null;
		int diff = getLength(node1) - getLength(node2);
		if (diff < 0) {
			LongNode = node2;
			shortNode = node1;
			diff = getLength(node2) - getLength(node1);
		}else {
			LongNode = node1;
			shortNode = node2;
		}
		for(int i = 0; i < diff; i ++) {
			LongNode = LongNode.nextNode;
		}
		while(LongNode != null && shortNode != null &&LongNode.val != shortNode.val) {
			LongNode = LongNode.nextNode;
			shortNode = shortNode.nextNode;
		}
		return LongNode;
	}
	public  static int getLength(Node node) {
		int count = 0;
		while(node != null) {
			count ++;
			node = node.nextNode;
		}
		return count;
	}
	public static void main(String[] args) {
		Node node1 = new Node(1,new Node(2,new Node(4,new Node(7,new Node(3,null)))));
		Node node2 = new Node(5,new Node(3,new Node(4,new Node(7,new Node(3,null)))));
		System.out.println(findFirstPublicNode(node1, node2).val);
	}
}
