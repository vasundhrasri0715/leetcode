class Solution {
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second = slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode curr=second;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode firsthalf=head;
        ListNode secondhalf=prev;
        while(secondhalf!=null){
            ListNode temp1=firsthalf.next;
            ListNode temp2=secondhalf.next;
            firsthalf.next=secondhalf;
            secondhalf.next=temp1;
            firsthalf=temp1;
            secondhalf=temp2;
        }
        
        

        
      
      
    }
}