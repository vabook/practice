package top.vabook.binarytree.depth;
/**
 * @author vabook@163.com
 * @version 2018年8月17日 下午4:07:51
 * 二叉树的深度
 */
public class Solution {

	public static class BinaryTree{
		public int value;
		public BinaryTree leftBinaryTree;
		public BinaryTree rightBinaryTree;
		public BinaryTree(int val) {
			this.value = val;
		}
	}
	public static int depth(BinaryTree root) {
		if (root == null) {
			return 0;
		}
		int left = depth(root.leftBinaryTree);
		int right = depth(root.rightBinaryTree);
		return left > right?(left + 1): (right + 1);
	}
	public static void main(String[] args) {
		BinaryTree rooTree = new BinaryTree(2);
		rooTree.leftBinaryTree = new BinaryTree(1);
		rooTree.rightBinaryTree = new BinaryTree(3);
		rooTree.leftBinaryTree.leftBinaryTree = new BinaryTree(0);
		rooTree.leftBinaryTree.rightBinaryTree = new BinaryTree(4);
		System.out.println(depth(rooTree));
	}
}
