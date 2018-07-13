package top.vabook.list.inonetimedeletelistnode;

/**
 * @author vabook@163.com
 * @version 2018/7/13 23:20
 */
public class ListOperator {
    public static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static ListNode deleteNode(ListNode head, ListNode toBeDeletedNode) {
        if ((head == null) || (toBeDeletedNode == null)) {
            return head;
        }
        if (head == toBeDeletedNode) {
            return head.next;
        }
        //要删除的结点恰好是最后一个结点
        if (toBeDeletedNode.next == null) {
            ListNode tNode = head;
            while (tNode.next != toBeDeletedNode) {
                tNode = tNode.next;
            }
            tNode.next = null;
        } else {
            toBeDeletedNode.value = toBeDeletedNode.next.value;
            toBeDeletedNode.next = toBeDeletedNode.next.next;
        }
        return head;
    }

    //打印list
    public static void printListNode(ListNode head) {
        while (head.next != null) {
            System.out.println(head.value);
            head = head.next;
        }
        System.out.println(head.value);
    }
    //找结点
    public static ListNode getDeletedNode(ListNode head,int toBeDeletedValue){
        if (head == null){
            return null;
        }
        while (head != null){
            if (head.value == toBeDeletedValue){
                return head;
            }else {
                head = head.next;
            }
        }
        return null;
    }

    public static void main(String args[]) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,null))));
        printListNode(head);
        int toBeDeletedValue = 2;
        deleteNode(head,getDeletedNode(head,2));
        printListNode(head);
    }
}