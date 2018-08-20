package top.vabook.intdemo.onceappear;

import java.nio.channels.NonReadableChannelException;

/**
 * @author vabook@163.com
 * @version 2018年8月20日 下午10:30:09
 * 数组中只出现一次的数字
 */
public class Solution {
	public static int[] findOnceAppear(int[] arr,int[] num1,int[] num2) {
		if (arr == null || arr.length < 2) {
			return arr;
		}
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp ^= arr[i];
		}
		int index = findIndexOf1(temp);
		
		for (int i = 0; i < arr.length; i++) {
			//根据第n位分别放在两个集合中
			if (isBit(arr[i],index)) {
				num1[0] ^= arr[i];
			}else {
				
				num2[0] ^= arr[i];
			}
		}
		int[] result  = new int[2];
		result[0] = num1[0];
		result[1] = num2[0];
		return result;
	}

	//判断第n位是不是1
	private static boolean isBit(int num, int index) {
		num = num >> index;
		return (num & 1) == 1;
	}

	//查找第一个1的位置
	private static int findIndexOf1(int temp) {
		int i = 0;
		while((temp & 1) == 0 && i < 32) {
			temp = temp >> 1;
			i ++ ;
		}
		return i;
	}
	public static void main(String[] args) {
		int[] arr = {2, 5,4, 3, 6, 3, 2, 5};
		int[] num1 = {0};
		int[] num2 = {0};
		int[] result = findOnceAppear(arr,num1,num2);
		System.out.println("这两个数字是 :" + result[0] + " " + result[1]);
		
	}
}
