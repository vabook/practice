package top.vabook.array.numbercounts;

/**
 * @author vabook@163.com
 * @version 2018年8月16日 下午5:17:49
 * 统计一个数字 	在排序数组中出现的次数
 * 二叉树简单实现
 */
public class Solution {
	public static int counts = 0;

	public static void binarySolution(int[] arr, int begin, int end, int k) {
		if (arr == null || arr.length == 0 || begin > end) {
			return;
		}
		int middle = (begin + end) / 2;
		if (k == arr[middle]) {
			counts++;
			if (arr[middle - 1] == k) {
				binarySolution(arr, begin, middle - 1, k);
			}
			if (arr[middle + 1] == k) {
				binarySolution(arr, middle + 1, end, k);
			}
		}
		if (k < arr[middle]) {
			binarySolution(arr, begin, middle - 1, k);
		} 
		if (k > arr[middle]) {
			binarySolution(arr, middle + 1, end, k);
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 3, 3, 3, 4, 5 };
		int	 k = 3;
		binarySolution(a, 0, a.length - 1, k);
		System.out.println("数字" + k + "出现的次数 : " +counts);
	}
}
