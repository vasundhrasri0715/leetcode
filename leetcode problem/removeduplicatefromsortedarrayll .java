class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode current=dummy;
        while(head!=null){
            if(head.next!=null && head.val==head.next.val){
                while(head.next!=null && head.val==head.next.val){
                    head =head.next;
                }
                current.next=head.next;
            }
            else{
                current =current.next;
            }
            head=head.next;
        }
        return dummy.next;
        
    }
}