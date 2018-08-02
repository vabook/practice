package top.vabook.array.mininumbers;

import java.util.ArrayList;

/**
 * @author vabook@163.com
 * @version 2018年8月2日 下午10:19:16 取出数组最小的k个数 1.利用数组链表,有排序的功能,先将原数组的前k个数取出,排序
 *          2.比较数组链表的最后一个数字与原数组后k个数 3.如果大于原数组中的数,替换掉数组链表中的数,并排序
 *          4.重复上述整个过程,循环遍历原数组中的每一个数字
 */
public class ArrayListImpl {
	public static ArrayList<Integer> getLeastNumbers(int[] input, int k) {
		// 预判
		if (k > input.length || k < 1) {
			return null;
		}
		// 数组链表,用于存取k个数字
		ArrayList<Integer> tmp = new ArrayList<Integer>();
		// 存入原数组前k个数
		for (int i = 0; i < k; i++) {
			tmp.add(input[i]);
		}
		// 排序
		tmp.sort(null);
		//定位到最后一个数字的索引
		int lastIndex = k - 1 ;
		// 开始比较
		for (int i = k; i < input.length; i++) {
			// 只有大于才替换,等于不管
			if (tmp.get(lastIndex) > input[i]) {
				tmp.remove(lastIndex);
				tmp.add(input[i]);
				tmp.sort(null);
			}
		}
		return tmp;
	}

	// 打印
	public static void printNum(ArrayList<Integer> inArr) {
		for (int i = 0; i < inArr.size(); i++) {
			System.out.print(inArr.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 7, 8, 5, 4, 6 };
		printNum(getLeastNumbers(input, 4));

	}
}
