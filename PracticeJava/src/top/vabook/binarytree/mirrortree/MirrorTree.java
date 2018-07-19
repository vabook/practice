package top.vabook.binarytree.mirrortree;


/**
 * @author vabook@163.com
 * @version 2018年7月19日 下午10:25:49
 * 镜像二叉树
 */
public class MirrorTree {

	public static class Node{
		public Integer value;
		public Node left;
		public Node right;
		public Node(Integer value, Node left, Node right) {
			this.value = value;
			this.left = left;
			this.right = right;
		}
		
	}
	//递归每一个结点
	public static void mirrorNode(Node head) {
		
		if (head != null) {
			Node tmp = head.left;
			head.left = head.right;
			head.right = tmp;
			mirrorNode(head.left);
			mirrorNode(head.right);
		}
	}
	
	//前序遍历
	public static void printNode(Node head) {
		if(head != null) {
			System.out.println(head.value);
			printNode(head.left);
			printNode(head.right);
		}
	}
	public static void main(String[] args) {
		Node head = new Node(8,
				new Node(8, new Node(9, null, null), new Node(2, new Node(4, null, null), new Node(7, null, null))),
				new Node(7, null, null));
		printNode(head);
		System.out.println("镜像生成");
		mirrorNode(head);
		printNode(head);
	}
}
