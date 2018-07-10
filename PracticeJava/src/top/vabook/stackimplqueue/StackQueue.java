package top.vabook.stackimplqueue;

import java.util.Stack;

/**
 * 用两个栈实现队列
 * stack1(负责输出元素)和stack2(负责接收元素) 一样的地位
 * 
 * 输出元素
 * 1.当stack2中没有元素,将stack1清空并将元素放入到stack1中
 * 2.当stack2中有元素,直接pop出
 * 
 * 添加元素
 * 直接在push到stack2中
 * @author Administrator
 *
 */
public class StackQueue {

	private Stack<Integer> stack1 = new Stack<Integer>();
	private Stack<Integer> stack2 = new Stack<Integer>();

	public StackQueue() {

	}

	public void addTail(Integer elem) {
		stack1.push(elem);
		
	}

	public Integer deleteHead() {
		
		//只有stack2为空的时候,才将stack1中的元素放入到stack2中
		if (stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		if (stack2.isEmpty()) {
			System.out.println("队列没有元素了 返回-1");
			return -1;
		}
		return stack2.pop();
	}

	public static void main(String[] args) {
		StackQueue s = new StackQueue();
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
