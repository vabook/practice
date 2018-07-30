package top.vabook.string;
/**
 * @author vabook@163.com
 * @version 2018年7月30日 下午10:34:02
 */
public class ArrangeString {
	public static void arrange(char[] arr) {
		if (arr == null) {
			return;
		}
		arrangeChar(arr,0);
		
	}

	private static void arrangeChar(char[] arr, int begin) {
		if (arr.length -1 == begin) {
			//递归调用时都将数组输出,因为数组已经变了
			System.out.print(new String(arr) + " ");
		}else {
			char temp;
			for(int i = begin;i < arr.length;i++) {
				temp = arr[i];
				arr[i] = arr[begin];
				arr[begin] = temp;
				arrangeChar(arr, begin + 1);
				
			}
		}
	}
	public static void main(String[] args) {
		char[] a = {'a','b','c'};
		arrange(a);
	}
}
