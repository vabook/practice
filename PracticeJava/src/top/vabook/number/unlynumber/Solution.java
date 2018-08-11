package top.vabook.number.unlynumber;
/**
 * @author vabook@163.com
 * @version 2018年8月11日 下午10:42:21
 * 求解第n个丑数
 */
public class Solution {

	public static int getUglyNumber(int index) {
		if (index == 0) {
			return 0;
		}
		int[] a = new int[index];
		int count = 1;
		a[0] = 1;
		int index2 = 0;
		int index3 = 0;
		int index5 = 0;
		//利用数组存储丑数
		while(count < index) {
			int min = min(a[index2] * 2,a[index3] * 3 ,a[index5] * 5);
			a[count] = min;
			while(a[index2] * 2 <= a[count]) index2 ++ ;
			while(a[index3] * 3 <= a[count]) index3 ++ ;
			while(a[index5] * 5 <= a[count]) index5 ++ ;
			count ++ ;
		}
		int result = a[index -1];
		return result;

	}
	public static int min(int a, int b ,int c) {
		int tmp = a > b ? b:a;
		return tmp > c ? c : tmp;
	}
	public static void main(String[] args) {
		int index = 1500;
		System.out.println("丑数:" + getUglyNumber(index));

	}

}
