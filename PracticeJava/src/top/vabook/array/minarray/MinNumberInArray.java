package top.vabook.array.minarray;

public class MinNumberInArray {

	public int[] array ;
	public int startPos ;
	public int endPos;
	public int minNumber;
	
	public MinNumberInArray(int[] array) {
		this.array = array;
		startPos = 0;
		endPos = array.length - 1 ;
		getMinNumber(array, startPos, endPos);
	}

	public void getMinNumber(int[] array ,int startPos ,int endPos) {
		int midPos = (startPos + endPos)/2;
		//如果中间的数恰好是小于等于它前面的数,那它就是数组的最小数
		if (array[midPos] <= array[midPos - 1] && array[midPos] <= array[midPos + 1]) {
			minNumber = array[midPos];
			return ;
		}
		//如果中间的数大于起始位置的数,说明最小数在中间位置的数和最后位置的数之间
		if (array[midPos] >= array[startPos]) {
			getMinNumber(array,midPos, endPos);
		}
		//如果中间的数小于起始位置的数,说明最小的数在起始位置的数到中间位置的数之间
		if (array[midPos] <= array[startPos]) {
			getMinNumber(array, startPos, midPos);
		}
	}
	/**
	 * 在非严格递增的数组逆转中,有一定的概率出现错误
	 * @param args
	 */
	public static void main(String[] args) {
		MinNumberInArray minNumberInArray ;
		int[] a = {3,4,5,1,2};
		minNumberInArray = new MinNumberInArray(a);
		System.out.println(minNumberInArray.minNumber);
		int[] b = {3, 4, 5, 1, 2, 2};
		minNumberInArray = new MinNumberInArray(b);
		System.out.println(minNumberInArray.minNumber);
		int[] c = {1,1,1,1,1};
		minNumberInArray = new MinNumberInArray(c);
		System.out.println(minNumberInArray.minNumber);
	}
}
