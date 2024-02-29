package org.example.codesolution.linkedlist.single;

import org.junit.jupiter.api.Test;

class ReverseLinkedListTest {

    @Test
    void testReverseLinkedList() {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = ReverseLinkedList.reverseLinkedList(head);

        while (reversedHead != null) {
            System.out.print(reversedHead.value + " ");
            reversedHead = reversedHead.next;
        }
    }
}