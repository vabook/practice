package top.vabook.stack;

import java.util.Stack;

/**
 * @author vabook@163.com
 * @version 2018年7月22日 下午10:58:46
 * 取出栈中的最小数,s1 s2 不同步,只同步最小值
 */
public class MinStack {
	public  static class NewStack{
		private   Stack<Integer> s1;
		private Stack<Integer> s2;

		
		public NewStack() {
			this.s1 = new Stack<>();
			this.s2 = new Stack<>();
		}
		public  void push(int elem) {
			s1.push(elem);
			Integer tmp ;
			//判断s2是否为空
			if (s2.isEmpty()) {
				s2.push(elem);
				tmp = elem;
			}else {
				tmp = s2.peek();
				//判断tmp与新入元素
				if (elem <= tmp) {
					s2.push(elem);
					tmp = elem;
				}else {
					s2.push(tmp);
				}
			}
		}
		public  void pop() {
			if (s1.isEmpty()) {
				System.out.println("没有元素");
				return ;
			}
			System.out.println(s1.pop());
			s2.pop();
		}
		public  int min() {
			return s2.peek();
		}
		public static void main(String[] args) {
			NewStack ns =new NewStack(); 
			ns.pop();
			ns.push(2);
			ns.push(3);
			System.out.println("最小值" + ns.min());
			ns.push(1);
			ns.push(7);
			ns.push(5);
			ns.pop();
			System.out.println("最小值" + ns.min());
		}
	}
}
