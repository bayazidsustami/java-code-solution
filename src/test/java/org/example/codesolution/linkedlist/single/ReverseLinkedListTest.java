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

    @Test
    void testAddTwoLinkedList() {

        ListNode head1 = new ListNode(2);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(5);

        ListNode head2 = new ListNode(3);
        head1.next = new ListNode(1);
        head1.next.next = new ListNode(2);

        ListNode addedValues = AddTwoNumberLinkedList.addTwoNumbers(head1, head2);

        while (addedValues != null) {
            System.out.print(addedValues.value + " ");
            addedValues = addedValues.next;
        }
    }
}