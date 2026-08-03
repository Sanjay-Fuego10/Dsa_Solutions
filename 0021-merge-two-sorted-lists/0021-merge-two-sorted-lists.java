/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; 
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        ListNode current = list1;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }
        ListNode current1 = list2;
        while(current1 != null){
            list.add(current1.val);
            current1 = current1.next;
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for(int num :list){
            tail.next = new ListNode(num);
            tail = tail.next;
        }
        return dummy.next;
    }
}