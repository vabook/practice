package top.vabook.list.listmerge;

import top.vabook.list.listmerge.ListMerge.Node;

/**
 * @author vabook@163.com
 * @version 2018年7月17日 下午11:17:59
 */
public class ListMerge2 {

	public static class Node{
		public int value;
		public Node next;
		
		public Node() {
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
	/**
	 * 递归调用,最后一次返回头结点
	 * @param head1
	 * @param head2
	 * @return
	 */
	public static Node mergeList2(Node head1,Node head2) {
		if (head1 == null && head2 != null) {
			return head2;
		}
		if (head1 != null && head2 == null) {
			return head1;
		}
		//假设当前节点是第一个链表的结点
		Node tmp = head1 ;
		if (tmp.value > head2.value) {
			//假设失败,改变tmp的值
			tmp = head2;
			tmp.next = mergeList2(head1, head2.next);
		}else {
			tmp.next = mergeList2(head1.next, head2);
		}
		return tmp;
	}
	public static void printList(Node head) {
		while(head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}

	public static void main(String[] args) {

		Node head1 = new Node(1,new Node(2,new Node(3,new Node(4,new Node(5,null)))));
		Node head2 = new Node(1,new Node(3,new Node(3,new Node(5,new Node(6,null)))));
		
		Node headMerge = mergeList2(head1, head2);
		printList(headMerge);
	}


}
