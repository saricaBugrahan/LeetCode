package Day5;

public class RemoveNthNodeFromEndOfList {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    /*
       Steps:
           1.Pick two pointer fast and slow.
           2.Shift fast pointer n times.
           3.Whenever fast.next equals to null it reaches the end so that shift slow and fast together.
           4.Then check head.next is null or not if it's not null we will delete the head, and make the next one head
           5.Otherwise we will delete the head and return empty list.
     */
    public static ListNode removeNthFromEnd(ListNode head,int n){
        ListNode slow = head,fast = head,temp = head;
        for(int i =0;i<n;i++){
            fast = fast.next;
        }
        if(fast != null){
            while (fast.next != null){
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
        }else{
            if(head.next != null){
                head = temp.next;
            }else{
                head = null;
            }
        }
        return head;

    }

    public static void main(String[] args) {
        removeNthFromEnd(new ListNode(1),1);
    }
}
