/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean check(ListNode a,ListNode b){
        while(a!=null && b!=null){
            if(a!=b)return false;
            a=a.next;
            b=b.next;
        }
        if((a==null && b!=null)||(a!=null && b==null))return false;
        return true;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode tempHeadB=headB;
            while(headB!=null){
                if(headA.val==headB.val){
                    if(check(headA,headB)){
                        return headA;
                    }
                }
                headB=headB.next;
            }
            headB=tempHeadB;
            headA=headA.next;
        }
        return null;
    }
}