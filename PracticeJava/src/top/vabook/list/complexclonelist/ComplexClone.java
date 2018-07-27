package top.vabook.list.complexclonelist;
/**
 * @author vabook@163.com
 * @version 2018年7月27日 下午10:36:26
 * 复杂链表的复制
 */
public class ComplexClone {
	public static class ComplexList{
		int value;
		ComplexList next ;
		ComplexList sibling ;
		
	}
	public static ComplexList clone(ComplexList head) {
		if (head == null) {
			return null;
		}
		cloneNodes(head);
		connectNodes(head);
		return reconnectNodes(head);
	}
	/**
	 * 偶数位置的结点扣出来.
	 * @param head
	 * @return
	 */
	public static ComplexList reconnectNodes(ComplexList head) {
		if (head == null) {
			return null;
		}
		ComplexList newHead = head.next;
		ComplexList pointer = newHead;
		head.next = newHead.next;
		head = head.next;
		while(head != null) {
			pointer.next = head.next;
			pointer = pointer.next;
			head.next = pointer.next;
			head = pointer.next;
		}
		return newHead;
	}
	/**
	 * 复制原先链表的每个结点的sibling的指向
	 * @param head
	 */
	public static void connectNodes(ComplexList head) {
		while(head != null) {
			if (head.sibling != null) {
				head.next.sibling = head.sibling.next;
			}
			head = head.next.next;
		}
	}
	/**
	 * 克隆结点,在每个结点后面都复制一个以前的结点
	 * @param head
	 */
	public static void cloneNodes(ComplexList head) {
		
		while(head != null) {
			ComplexList tmp = new ComplexList();
			tmp.value = head.value;
			tmp.next = head.next;
			head.next = tmp;
			head = tmp.next;
		}
		
	}
	public static void print(ComplexList head) {
		while(head != null) {
			System.out.println(head.value);
			head = head.next;
		}
	}
	public static void main(String[] args) {
		ComplexList head = new ComplexList();
        head.value = 1;
        head.next = new ComplexList();
        head.next.value = 2;
        head.next.next = new ComplexList();
        head.next.next.value = 3;
        head.next.next.next = new ComplexList();
        head.next.next.next.value = 4;
        head.next.next.next.next = new ComplexList();
        head.next.next.next.next.value = 5;

        head.sibling = head.next.next;
        head.next.sibling = head.next.next.next.next.next;
        head.next.next.next.sibling = head.next;
        ComplexList cloneList = clone(head);
        print(cloneList);

	}
}
