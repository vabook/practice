package top.vabook.list;

import java.util.ArrayList;
import java.util.List;

/**
* @author vabook@hotmail.com
* @version 2018年7月6日 下午11:08:35
*
*/
public class ListReverse2 {
	
	public int val;
	
	public ListReverse2 next;
	
	public ListReverse2(int val){
		
		this.val = val;
	}
	
	/**
	 * 利用了函数的递归调用
	 * @param head
	 */
	public static void recursivereverse(ListReverse2 head){
		
		List<ListReverse2> ll = new ArrayList<ListReverse2>();
		
		ListReverse2 theNext ;
		
		//此步骤是对空指针异常做处理
		if (head == null) {
			
			return ;
		}
		
		if (head != null) {
			
			recursivereverse(head.next);
			
		}
		
		System.out.println(head.val);
	}
	
	public static void main(String[] args) {
		
		ListReverse2 head = null ; 
		head = new ListReverse2(1);
		head.next = new ListReverse2(2);
		head.next.next = new ListReverse2(3);
		head.next.next.next = new ListReverse2(4);
		head.next.next.next.next = new ListReverse2(5);
		
		recursivereverse(head);
	}

}
