package top.vabook.binarytree.islrd;
/**
 * @author vabook@163.com
 * @version 2018年7月26日 下午10:54:37
 */
public class LrdTree {
	public boolean verifyTree(int[] seq) {
		if (seq.length == 0) {
			return false;
		}
		if (seq.length == 1) {
			return true;
		}
		return judge(seq,0,seq.length -1);
	}

	private boolean judge(int[] seq, int start, int end) {
		//说明遍历结束了
		if (start >= end) {
			return true ;
		}
		int i = start;
		while(i < end && seq[i] < seq[end]) {
			i ++;
		}
		//当右子树有小于根节点的时候,直接返回false
		for(int j = i;j < end;j ++) {
			if (seq[j] < seq[end]) {
				return false;
			}
		}
		//左子树和右子树分别继续迭代
		return (judge(seq, start, i-1) &&judge(seq, i, end -1));
	}
	public static void main(String[] args) {
		LrdTree lrdTree = new LrdTree();
		int[] arr = {5,7,6,9,11,10,8};
		System.out.println(lrdTree.verifyTree(arr));
	}
}
