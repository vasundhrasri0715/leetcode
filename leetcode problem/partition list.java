
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessdummy=new ListNode(0);
        ListNode greaterdummy=new ListNode(0);
        ListNode less=lessdummy;
        ListNode greater=greaterdummy;
        while(head!=null){
            if(head.val <x){
                less.next=head;
                less=less.next;
            }
            else{
                greater.next=head;
                greater=greater.next;
            }
            head=head.next;
        }
        greater.next=null;
        less.next=greaterdummy.next;
        return lessdummy.next;

        
    }
}