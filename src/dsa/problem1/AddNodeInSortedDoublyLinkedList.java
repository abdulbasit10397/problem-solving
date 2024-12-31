package dsa.problem1;

import java.io.IOException;

class DoublyLinkedListNode {
    public int data;
    public DoublyLinkedListNode next;
    public DoublyLinkedListNode prev;

    public DoublyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    public DoublyLinkedListNode head;
    public DoublyLinkedListNode tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertNode(int nodeData) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

        if (this.head == null) {
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
        }

        this.tail = node;
    }
}

class DoublyLinkedListPrintHelper {
    public static void printList(DoublyLinkedListNode node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;

        }
    }
}

class Result {

    /*
     * Complete the 'sortedInsert' function below.
     *
     * The function is expected to return an INTEGER_DOUBLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_DOUBLY_LINKED_LIST llist
     *  2. INTEGER data
     */

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */


    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);

        /* Case 1: Insert at the beginning */
        if (llist == null || data < llist.data) {
            newNode.next = llist;
            if (llist != null) {
                llist.prev = newNode;
            }
            return newNode;
        }

        /*
        * Case 2: Traverse the list to find the insertion point.
        * The condition current.next.data < data ensures we stop
        * when the next node's data is greater or equal to data
        */
        DoublyLinkedListNode current = llist;
        while (current.next != null && current.next.data < data) {
            current = current.next;
        }

        /* Case 3: Insert at the correct position */
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;

        return llist;
    }


    public static DoublyLinkedListNode sortedInsert1(DoublyLinkedListNode llist, int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
        /* When list is empty */
        if (llist == null) return node;

        /* When new node has to be prepended */
        if(data < llist.data) {
            node.next = llist;
            llist.prev = node;
            return node;
        }

        /* When node has to be inserted in the middle */
        DoublyLinkedListNode current = llist;
        while (current.next != null) {
            if (data > current.data && data < current.next.data) {
                insert(node, current);
                break;
            }

            current = current.next;
        }

        /* When node has to be inserted at the end*/
        if (data > current.data && current.next == null) {
            insert(node, current);
        }

        return llist;
    }

    public static void insert(DoublyLinkedListNode newNode, DoublyLinkedListNode current) {
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
    }
}

public class AddNodeInSortedDoublyLinkedList {
    public static void main(String[] args) throws IOException {
        DoublyLinkedList llist = new DoublyLinkedList();
        llist.insertNode(2);
        llist.insertNode(3);
        llist.insertNode(4);

        DoublyLinkedListNode llist1 = Result.sortedInsert(llist.head, 1);
        DoublyLinkedListPrintHelper.printList(llist1);
    }
}
