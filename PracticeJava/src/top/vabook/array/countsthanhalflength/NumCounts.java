package top.vabook.array.countsthanhalflength;

import java.security.Principal;

/**
 * @author vabook@163.com
 * @version 2018年7月31日 下午10:22:01
 * 找出数组中出现次数超过一半的数字
 * 根据数组特点,存在的话,这个数字出现的次数将大于其他数字的总次数
 * 1.从头遍历数组,计count = 1,设置数组第一个数为起始需要比较的数
 * 2.当下一个数字等于CountNum时,count++,否则--
 * 3.每次都需要判断counts是否小于零,如果小于,表示需要重新设置比较的数
 */
public class NumCounts {
	public static void countsThanHalfLength(int[] arr) {
		if (arr.length == 0) {
			return;
		}
		int countNum = arr[0];
		int counts = 1;
		for(int i = 1;i < arr.length;i ++) {
			if (counts == 0) {
				countNum = arr[i];
				counts = 1;
			}else if (countNum == arr[i]) {
				counts ++;
			}else {
				counts --;
			}
		}
		int tmp = 0;
		for(int i:arr) {
			if(i == countNum) {
				tmp ++;
			}
		}
		if (tmp > arr.length /2) {
			System.out.println("数组中出现次数超过一半的数字是:" + countNum);
		}else {
			System.out.println("不存在");
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,2,2,2,2};
		countsThanHalfLength(arr);
	}
}
