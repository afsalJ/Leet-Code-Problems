/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean isHasCycle(ListNode node,int[] nodes,int index,int nodesLength){
	//checking for the loop 10 times
        for(int j=1;j<10;j++){
            for(int i=index;i<nodesLength;i++){
                if(node==null||node.val!=nodes[i]) return false; // if any value is not same ,return false
                node=node.next;
            }
        }
        return true;
    }
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        int nodes[]=new int[10001]; // since the constraint is (number of nodes<10^4)
        int indexNodes=0; //to iterate through nodes array
        boolean flag=false;
        while((flag==false) && (head.next!=null)){ // if any loop exist in head then flag will become true and exit the while loop.
            nodes[indexNodes++]=head.val; // store the current value in the array
            head=head.next;
            for(int i=0;i<indexNodes;i++){
                if(head.val==nodes[i]){
                    flag=isHasCycle(head,nodes,i,indexNodes); //check for cycle since the next value and one of the previous values are same.
                }
                if(flag) break;//if flag true, break this loop.
            }
        }
        return flag;
    }
}