package top.vabook.stackimplqueue;

import java.util.Stack;

/**
 * stack1 主栈,stack2辅助栈
 * 
 * 执行add操作的时候	
 * 1.将stack1中的元素清空并放入到stack2中
 * 2.将元素放入stack1的栈底
 * 3.再将stack1栈清空,并放入到stack2中
 * 
 * 执行delete操作的时候,直接从stack1中取出元素
 * @author Administrator
 *
 */
public class StackQueue2 {
	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();
	
	public void addTail(int elem) {
		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
		stack1.push(elem);
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
	}
	public Integer deleteHead() {
		if (!stack1.isEmpty()) {
			
			return stack1.pop();
		}
		System.out.println("没有元素了,返回-1");
		return -1 ;
	}
	public static void main(String[] args) {
		StackQueue2 s = new StackQueue2();
		s.addTail(1);
		s.addTail(2);
		s.addTail(3);
		s.addTail(4);
		System.out.println(s.deleteHead());
		System.out.println(s.deleteHead());
		System.out.println(s.deleteHead());
		System.out.println(s.deleteHead());
	}
}
