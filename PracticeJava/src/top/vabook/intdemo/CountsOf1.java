package top.vabook.intdemo;
/**
 * @author vabook@163.com
 * @version 2018年8月9日 下午10:36:45
 * 从1到整数n之间1出现的次数
 * 找数字规律,分段求值, 利用递归
 */
public class CountsOf1 {
	public static int countsOf1(int n) {
		if (n < 2) {
			return n;
		}
		String string = n + "";
		return counts(string);
	}

	private static int counts(String string) {
		char[] arr = string.toCharArray();
		int len = arr.length;
		if (len == 1 && arr[0] == '0') {
			return 0;
			
		}
		if (len == 1 && arr[0] > '1') {
			return 1;
		}
		int firstDigit = 0;
		if (arr[0] > '1') {
			firstDigit = (int) Math.pow(10, len -1);
		}else if(arr[0] == '1'){
			firstDigit = Integer.parseInt(string.substring(1) + 1) ;
		}
		
		int numOtherDigits = (int) ((arr[0] - '0') * (len - 1) * Math.pow(10, len - 2));
		int numRecursive = counts(string.substring(1));
		return firstDigit + numOtherDigits + numRecursive;
	}
	
	public static void main(String[] args) {
		int a = 12345;
		System.out.println("1 的 个数 : " + countsOf1(a));
	}
}
