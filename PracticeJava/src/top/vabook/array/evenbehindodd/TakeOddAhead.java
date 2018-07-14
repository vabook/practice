package top.vabook.array.evenbehindodd;
/**
 * @author vabook@163.com
 * @version 2018年7月14日 下午10:54:24
 */
public class TakeOddAhead {


	public static void printArr(int[] arr) {

		if (arr == null) {
			return;
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

	public static void oddAhead(int[] arr) {
		if (arr == null) {
			return;
		}
		int startPos = 0;
		int endPos = arr.length - 1;
		
		while(endPos > startPos) {
			
			//找奇数
			while(arr[endPos] % 2 == 0 && endPos > startPos) {
				endPos --;
			}
			//找偶数
			while(arr[startPos] % 2 == 1 && endPos > startPos) {
				startPos ++;
			}
			
			//交换
			int tmp;
			tmp = arr[endPos];
			arr[endPos] = arr[startPos];
			arr[startPos] = tmp;
			
		}
		return ;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		printArr(arr);
		oddAhead(arr);
		printArr(arr);
	}
}
