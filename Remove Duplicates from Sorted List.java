class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
        {
            return null;
        }
        ListNode ans=new ListNode(head.val);
        ListNode headOfAns=new ListNode();
        headOfAns=ans;
        int prev=head.val;
        head=head.next;
        while(head!=null)
        {
            if(head.val!=prev)
            {
                System.out.println(ans.val);
                ans.next=head;
                prev=head.val;
                ans=ans.next;
            }
            head=head.next;
        }
        ans.next=null;
        System.out.println(ans.val);
        return headOfAns;
    }
}