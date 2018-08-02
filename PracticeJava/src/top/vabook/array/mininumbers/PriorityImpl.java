package top.vabook.array.mininumbers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author vabook@163.com
 * @version 2018年8月2日 下午10:53:53
 * 利用优先队列,不用排序,调用element() 会自动取出最大的值
 * 与ArrayListImpl类思路一致
 */
public class PriorityImpl {

	public static ArrayList<Integer> getMiniNum(int[] input, int k){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		if (k > input.length || k < 1) {
			return null;
		}
		//实现类实现comparator,重写比较方法
		class ComparatorImpl implements Comparator<Integer>{

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1.intValue() < o2.intValue()) {
					return 1;
				}else if (o1.intValue() == o2.intValue()) {
					return 0;
				}else{
					return -1;
				}
			}
		}
		ComparatorImpl comImpl = new ComparatorImpl();
		//创建优先队列
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(comImpl);
		
		//利用优先队列
		for (int i = 0; i < k; i++) {
			pQueue.add(input[i]);
		}
		//遍历并比较
		for (int i = k; i < input.length; i++) {
			//由于前面实现类比较方法取出
			if (pQueue.element() > input[i]) {
				pQueue.remove();
				pQueue.add(input[i]);
			}
		}
		arr.addAll(pQueue);
		arr.sort(null);
		return arr;
	}
	public static void printNum(ArrayList<Integer> inArr) {
		for (int i = 0; i < inArr.size(); i++) {
			System.out.print(inArr.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		int[] input = {2,3,7,4,1,9,8,6};
		printNum(getMiniNum(input, 4));
	}

}
