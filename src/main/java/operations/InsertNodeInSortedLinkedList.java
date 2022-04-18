package operations;

import basic.SLLNode;

public class InsertNodeInSortedLinkedList {
    SLLNode head;
    int length = 0;

    public static void main(String[] args) {
        InsertNodeInSortedLinkedList sll = new InsertNodeInSortedLinkedList();
        sll.addNodeAtEnd(1);
        sll.addNodeAtEnd(2);
        sll.addNodeAtEnd(3);
        // sll.addNodeAtEnd(4);
        sll.addNodeAtEnd(5);
        sll.traverse();//1
        sll.insertNodeInSortedLinkedList(4);
        sll.traverse();//1

    }

    public void insertNodeInSortedLinkedList(int key) {
        SLLNode temp = head;
        SLLNode newnode = new SLLNode(key);
        SLLNode positionToInsert = null;
        if (head == null) {
            head = newnode;
            return;
        }
        while (temp != null && (Integer) temp.getData() < (Integer) newnode.getData()) {
            positionToInsert = temp;
            temp = temp.getNext();
        }
        newnode.setNext(temp);
        positionToInsert.setNext(newnode);

    }

    public void traverse() {
        System.out.println();
        SLLNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " -> ");
            currentNode = currentNode.getNext();
            length = length + 1;
        }
    }

    public void addNodeAtEnd(int key) {

        SLLNode node = new SLLNode(key);
        SLLNode temp = head;

        if (head == null) {
            head = node;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
//(O)n
    }
}
