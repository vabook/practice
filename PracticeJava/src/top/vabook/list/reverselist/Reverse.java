package top.vabook.list.reverselist;

import java.awt.List;

/**
 * @author vabook@163.com
 * @version 2018年7月16日 下午11:43:18
 * 由链表的头结点,进行反转
 */
public class Reverse {

	public static class Node {
		public int value;
		public Node next;

		public Node() {

		}

		public Node(int value, Node next) {
			super();
			this.value = value;
			this.next = next;
		}

	}

	public static Node reverseList(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node root = new Node();
		Node tmp = null;
		while (head != null) {
			// 记录当前节点的下一个节点
			tmp = head.next;
			// 将当前节点插入到root和root.next之间
			head.next = root.next;
			root.next = head;

			head = tmp;

		}
		return root.next;
	}

	public static void printNode(Node head) {
		while (head.next != null) {
			System.out.println(head.value);
			head = head.next;
		}
		System.out.println(head.value);
	}

	public static void main(String[] args) {
		
		Node head = new Node (1,(new Node(2,new Node(3,new Node(4,new Node(5,null))))));
		Node reverseHead = reverseList(head);
		printNode(reverseHead);

	}
}
