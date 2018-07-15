package top.vabook.list.lastnode;
/**
 * @author vabook@163.com
 * @version 2018年7月15日 下午11:50:00
 * 取得倒数第k个结点
 * 1.利用倒数第k个结点和最后一个结点之间的距离
 * 2.应用到第一个结点到第k-1个结点之间的距离
 * 3.两个结点不断向后移动,直到上一步骤的k-1结点指向空
 */
public class LastNode {

	public static class Node{
		public int value ;
		public Node next;
		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
		
	}
	//取出正向第k-1个结点
	public static Node getEndNode(Node head ,int k) {
		if (head == null) {
			return null;
		}
		Node point = head;
		for (int i = 0; i < k; i++) {
			if (point.next != null) {
				point = point.next;
			}else {
				return null;
			}
		}
		return point;
	}
	//第一个结点和上一步骤的k-1 个结点一起向后移动
	public static Node getDestNode(Node head,Node point) {
		if (point == null || head == null) {
			return null;
		}else {
			while(point.next != null) {
				head = head.next;
				point = point.next;
			}
		}
		return head;
	}
	public static void main(String[] args) {
		Node head = new Node(1, null);
		head.next = new Node(2, new Node(3,new Node(4, new Node(5, null))));
		Node pointNode = getEndNode(head,3);
		Node destNode = getDestNode(head, pointNode);
		System.out.println(destNode.value);
		
	}
}
