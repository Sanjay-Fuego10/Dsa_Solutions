# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        list = []
        self.current = list1
        while self.current != None:
            list.append(self.current.val)
            self.current = self.current.next
        self.current1 = list2
        while self.current1 != None:
            list.append(self.current1.val)
            self.current1 = self.current1.next
        sort_list=sorted(list)
        dummy = ListNode(0)
        tail = dummy 
        for num in sort_list:
            tail.next = ListNode(num)
            tail = tail.next
        return dummy.next
        