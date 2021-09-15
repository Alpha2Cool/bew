package Solution;
import java.util.ArrayList;
import java.util.Stack;

class ListNode
{
    int val;
    ListNode next = null;
    ListNode(int val) {this.val = val;}
}

class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }

    public void printmylist(ListNode head)
    {
        if(head==null) return;
        System.out.println(head.val);
        printmylist(head.next);
    }
}

public class printlist {
    public static void main(String arg[])
    {
        ListNode list1 = new ListNode(1);
        ListNode list2 = new ListNode(2);
        ListNode list3 = new ListNode(3);
        ListNode list4 = new ListNode(4);
        list1.next = list2;
        list2.next = list3;
        list3.next = list4;
        list4.next = null;

        Solution s = new Solution();
        s.printmylist(list1);
        System.out.println(s.printListFromTailToHead(list1));
    }
}

