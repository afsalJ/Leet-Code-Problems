/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode output=new ListNode(0);
        ListNode forOutput=new ListNode(0);
        output.next=forOutput;
        while(list1!=null && list2!=null)
        {
            if(list1.val<=list2.val)
            {
                forOutput.next=list1;
                list1=list1.next;
            }
            else
            {
                forOutput.next=list2;
                list2=list2.next;
            }
            forOutput=forOutput.next;
        }
        if(list1==null)
        {
            forOutput.next=list2;
        }
        else
        {
            forOutput.next=list1;
        }
        return output.next.next;
    }
}