package top.vabook.list.listreverse;

import java.awt.List;
import java.util.Stack;

/**
* @author vabook@hotmail.com
* @version 2018年7月6日 下午10:47:39
* 链表翻转输出,利用栈
*/
public class ListReverse {
	
	public int val ;
	
	public ListReverse next ;
	
	public ListReverse(int val){
		
		this.val = val;
		
	}
	
	public static void stackreverse(ListReverse head){
		
		Stack<ListReverse> stackList = new Stack<ListReverse>();
		
		//利用while循环,从头到尾压入栈中
		while(head != null) {
			
			stackList.push(head);
			
			head = head.next;
			
		}
		
		//单个元素
		ListReverse lr ;
		
		//同样利用while循环,出栈,并取出值
		while (!stackList.isEmpty()) {
			
			lr = stackList.pop();
			
			System.out.println(lr.val);
			
		}
		
	}
	public static void main(String[] args) {
		
		ListReverse head = null ; 
		head = new ListReverse(1);
		head.next = new ListReverse(2);
		head.next.next = new ListReverse(3);
		head.next.next.next = new ListReverse(4);
		head.next.next.next.next = new ListReverse(5);
		
		stackreverse(head);
		
	}
}
