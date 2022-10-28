package Questions;
public class MiddleOfTheLinkedList{
    class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
