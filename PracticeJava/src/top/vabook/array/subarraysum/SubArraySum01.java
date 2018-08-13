package top.vabook.array.subarraysum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import top.vabook.binarytree.subtree.BinaryTree.Tree;

/**
 * @author vabook@163.com
 * @version 2018年8月3日 下午10:24:45 求整数数组中子数组和最大的那一组
 */
public class SubArraySum01 {
	public static List<Integer> getSubArr(int[] input) {
		if (input == null) {
			return null;
		}
		if (input.length == 1) {
			System.out.println("子数组 :" +input[0]);
			System.out.println("最大值为 :" + input[0]);
		}
		//存放子数组
		List<Integer> list = new ArrayList<Integer>();
		
		// Map<List<Integer>, Integer> sumMap = new HashMap<>();
		// 和作为key
		Map<Integer, List<Integer>> sumMap = new HashMap<>();
		// 设最大子数组的开始标记位,结束标记位
		int begin = 0;
		//对begin进行后推
		for (; begin < input.length - 1; begin++) {
			int end = begin + 1;
			// 保存每个子数组的和,便于比较
			int sum = 0;
			// 一个子数组的和,对end进行后推
			for (; end < input.length; end++) {
				for (int i = begin; i <= end; i++) {
					sum += input[i];
	
					try {
						list.add(input[i]);
					} catch (Exception e) {
						System.out.println("有空值" + i);
					}
				}
				//存放了所有的子数组和,以及对应的子数组
				sumMap.put(sum, list);
				//清空每一次产生的list
				list = null;
			}
		}
		int max = 0;
		int tmp = 0;
		Set<Integer> sumArr = sumMap.keySet();
		Iterator<Integer> iterator = sumArr.iterator();
		while(iterator.hasNext()) {
			tmp = iterator.next();
			if (max < tmp) {
				max = tmp;
			}
		}
		//子数组
		list = (ArrayList<Integer>) sumMap.get(max);
		//得到最大子数组的和
		System.out.println("最大子数组的和 :" + max);
		return list;
	}
	//打印
	public static void print(List<Integer> in) {
		System.out.println("子数组:" +in);
	}
	
	public static void main(String[] args) {
		int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};
		print(getSubArr(arr));
	}
}
