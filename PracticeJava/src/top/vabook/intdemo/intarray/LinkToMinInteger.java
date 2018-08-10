package top.vabook.intdemo.intarray;

import java.security.Principal;
import java.util.Comparator;

/**
 * @author vabook@163.com
 * @version 2018年8月10日 下午10:53:09
 * 把数组排成最小的数
 * 自定义排序规则,并且利用到快排
 */
public class LinkToMinInteger {

	public static int MyCompare(String s1, String s2) {
		if (s1 == null || s2 == null) {
			throw new IllegalArgumentException("参数错误");
		}
		String sum1 = s1 + s2;
		String sum2 = s2 + s1;
		return sum1.compareTo(sum2);
	}

	public static void quickSort(String[] arr, int start, int end) {
		if (start < end) {
			String pivotString = arr[start];
			int left = start;
			int right = end;

			while (start < end) {
				while (start < end && MyCompare(arr[end], pivotString) >= 0) {
					end--;
				}
				arr[start] = arr[end];
				while (start < end && MyCompare(arr[start], pivotString) <= 0) {
					start++;
				}
				arr[end] = arr[start];
			}

			arr[start] = pivotString;
			quickSort(arr, left, start - 1);
			quickSort(arr, start + 1, end);
		}
	}

	public static void print(String[] arr) {
		StringBuilder sb = new StringBuilder();
		for(String a:arr) {
			sb.append(a);
		}
		System.out.println("数组最小数:" + sb.toString());
	}
	
	public static void main(String[] args) {
		String[] arr = {"2","23","234","2345"};
		quickSort(arr, 0, arr.length -1);
		print(arr);
	}
}
