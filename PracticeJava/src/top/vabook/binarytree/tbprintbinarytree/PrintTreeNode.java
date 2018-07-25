package top.vabook.binarytree.tbprintbinarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author vabook@163.com
 * @version 2018年7月25日 下午10:43:36
 * 从上到下,从左到右打印二叉树
 * 关键
 * 从头结点开始,将结点临时保存在队列中,然后遍历队列
 * 取出队列中的节点,将value放入数组中,然后判断其左右节点是否为空,不为空就放入队列中
 * 循环判断队列中的值
 */
public class PrintTreeNode {

	public static class TreeNode{
		private int val = 0;
		private TreeNode leftNode;
		private TreeNode rightNode;
		public TreeNode(int val, TreeNode leftNode, TreeNode rightNode) {
			super();
			this.val = val;
			this.leftNode = leftNode;
			this.rightNode = rightNode;
		}
		
		
	}
	public static ArrayList<Integer> printNode(TreeNode head){
		ArrayList<Integer> result = new ArrayList<Integer>();
		if (head == null) {
			return null;
		}
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(head);
		while(!queue.isEmpty()){
			TreeNode tmp = queue.remove();
			result.add(tmp.val);
			if (tmp.leftNode != null) {
				queue.add(tmp.leftNode);
			}
			if (tmp.rightNode != null) {
				queue.add(tmp.rightNode);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		TreeNode head = new TreeNode(1, new TreeNode(2, new TreeNode(3, null, null), new TreeNode(4, null, null)), new TreeNode(5, new TreeNode(6, new TreeNode(7, null, null), null), new TreeNode(8, null, null)));
		ArrayList<Integer> result = printNode(head);
		for(int i : result) {
			System.out.println(i);
		}
				
	}

}
