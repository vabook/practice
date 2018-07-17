package top.vabook.list.listmerge;

/**
 * @author vabook@163.com
 * @version 2018年7月17日 下午10:58:13
 */
public class ListMerge {

	public static class Node {
		public Integer value;
		public Node next;

		public Node() {
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}

	}

	public static Node mergeList(Node head1, Node head2) {
		if (head1 == null && head2 != null) {
			return head2;
		}
		if (head1 != null && head2 == null) {

			return head1;
		}
		Node root = new Node();
		Node point = root;
		while (head1 != null && head2 != null) {
			if (head1.value > head2.value) {
				point.next = head2;
				head2 = head2.next;
			} else {
				point.next = head1;
				head1 = head1.next;
			}
			//不断改变point的指向
			point = point.next;
		}
		//其中一个结点没有下一个节点了
		if (head1 == null) {
			point.next = head2;
		}
		if (head2 == null) {
			point.next = head1;
		}
		return root.next;
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
		
		Node headMerge = mergeList(head1, head2);
		printList(headMerge);
	}

}
