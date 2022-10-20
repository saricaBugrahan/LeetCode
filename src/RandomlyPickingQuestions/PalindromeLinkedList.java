package RandomlyPickingQuestions;
public class PalindromeLinkedList {
    class ListNode{
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        slow = reverseLinkedList(slow);
        fast = head;
        while(fast != null && slow != null){
            if(slow.val != fast.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
}
