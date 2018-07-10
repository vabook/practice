package top.vabook.binarytree;

/**
 * rebuild binaryTree by the way of recursion
 * @author Administrator
 * 你好啊
 */
public class RebuildTree {

	/**
	 * 
	 * @param pre	前序遍历结果
	 * @param startPre	前序遍历起始位置
	 * @param endPre	前序遍历结束位置
	 * @param mid	中序遍历结果
	 * @param startMid	中序遍历起始位置
	 * @param endMid	中序遍历结束位置
	 * @return		返回根节点
	 */
	public static TreeNode rebuild(int[] pre,int startPre,int endPre,int[ ] mid,int startMid,int endMid) {
		
		if (pre == null || mid == null || startPre > endPre || startMid > endMid || pre.length != mid.length) {
			return null ;
		}
		
		//先定下根节点
		int root = pre[startPre];
		
		//得到根节点在中序遍历的位置
		int rootLocate = getLocate(mid, root,startMid ,endMid);
		
		if (rootLocate == -1 ) {
			return null;
		}
		
		TreeNode tNode = new TreeNode(root);
		
		System.out.println(tNode.val);
		//前序遍历的结束位置 = 根节点在中序遍历的位置 - 中序遍历的起始位置  + 前序遍历的起始位置
		tNode.leftNode = rebuild(pre, startPre + 1, startPre + rootLocate - startMid , mid, startMid, rootLocate - 1);
		//前序遍历的其实位置 = 上面 + 1 
		tNode.rightNode = rebuild(pre, startPre + rootLocate - startMid + 1, endPre, mid, rootLocate + 1, endMid);
		
		return tNode ;
	}

	/**
	 * 得到根节点在中序遍历的位置索引
	 * 因为左右子树的原因,起始位置和结束位置在不断变化,所以需要重新传入
	 * @param mid
	 * @param root
	 * @param startMid
	 * @param endMid
	 * @return
	 */
	public static int getLocate(int[] mid, int root ,int startMid, int endMid) {
		for (int i = startMid ; i <= endMid; i ++) {
			if (root == mid[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 7, 3, 5, 6, 8 };
		int[] mid = { 4, 7, 2, 1, 5, 3, 8, 6 };

		int preLen = pre.length;
		
		int midLen = mid.length;
		//位置定位为下标
		rebuild(pre, 0, preLen - 1, mid, 0, midLen - 1);

	}

}
