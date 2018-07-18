package top.vabook.binarytree.subtree;

import java.security.Principal;

/**
 * @author vabook@163.com
 * @version 2018年7月18日 下午10:55:35
 */
public class BinaryTree {

	public static class Tree {
		public int value;
		public Tree left;
		public Tree right;

		public Tree(int value, Tree left, Tree right) {
			super();
			this.value = value;
			this.left = left;
			this.right = right;
		}

	}

	/**
	 * 找到第一个与tree2根节点值相等的结点,然后调用hasSubTree
	 * 
	 * @param tree1
	 * @param tree2
	 */
	public static boolean exist = false;

	public static void theFirstEqual(Tree tree1, Tree tree2) {

		if (tree1 == null) {
			return;
		}
		if (tree1.value == tree2.value) {
			exist = hasSubTree(tree1, tree2);
			if (exist) {
				System.out.println("存在,我们的存在");
				return;
			}
		}
		theFirstEqual(tree1.left, tree2);
		theFirstEqual(tree1.right, tree2);

	}

	/**
	 * 递归调用,得到最终exist的值
	 * 
	 * @param tree1
	 * @param tree2
	 * @return
	 */
	public static boolean hasSubTree(Tree tree1, Tree tree2) {
		if (tree1 == null && tree2 == null) {
			return true;
		}
		if (tree1 == null && tree2 != null) {
			return false;
		}
		if (tree2 == null) {
			return true;
		}
		boolean existTree = false;
		// 左子树,右子树同时满足
		if (tree1.value == tree2.value) {
			existTree = hasSubTree(tree1.left, tree2.left) && hasSubTree(tree1.right, tree2.right);
		}
		return existTree;
	}

	public static void main(String[] args) {
		Tree tree1 = new Tree(8,
				new Tree(8, new Tree(9, null, null), new Tree(2, new Tree(4, null, null), new Tree(7, null, null))),
				new Tree(7, null, null));
		Tree tree2 = new Tree(8, new Tree(9, null, null), new Tree(2, null, null));
		theFirstEqual(tree1, tree2);
	}

}
