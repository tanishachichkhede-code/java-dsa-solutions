package LinkedList;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
class Solution {
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current =current.next;
            
        }
        int middle =count/2;
        current = head;
        for (int i = 0; i < middle; i++) {
            current = current.next;
        }
        return current;
    }
}