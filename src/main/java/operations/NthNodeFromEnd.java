package operations;

import basic.SLLNode;
// Lenfth method
//two pointer method
//hashtable+length
//recursive
public class NthNodeFromEnd {
    SLLNode head;
    int length = 0;

    public static void main(String[] args) {
        NthNodeFromEnd sll = new NthNodeFromEnd();
        sll.addNodeAtEnd(1);
        sll.addNodeAtEnd(2);
        sll.addNodeAtEnd(3);
        sll.addNodeAtEnd(4);
        sll.traverse();//1
        // sll.findNthNodeFromEnd_TwoPointer(3);
        sll.findNthNodeFromEnd_Length(1);
    }

    private void findNthNodeFromEnd_Length(int nthnode) {
        //This will find node from starting
        int node_no_from_start = length - (nthnode - 1);
        SLLNode temp = head;
        if (length < nthnode)
            return;

        for (int i = 1; i < node_no_from_start && temp != null; i++) {
            temp = temp.getNext();
        }
//(O)n
        System.out.println("\n Nth node : " + temp.getData());
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

    public void traverse() {
        SLLNode currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.getData() + " -> ");
            currentNode = currentNode.getNext();
            length = length + 1;
        }
    }

    private void findNthNodeFromEnd_TwoPointer(int positionFromEnd) {
        //This will find node from enda
        SLLNode slowpointer = head;
        SLLNode fastpointer = head;

        if (head != null) {
            for (int i = 1; i < positionFromEnd && fastpointer != null; i++) {
                fastpointer = fastpointer.getNext();
            }
            if (fastpointer != null) {
                while (fastpointer.getNext() != null) {
                    slowpointer = slowpointer.getNext();
                    fastpointer = fastpointer.getNext();
                }
                System.out.println("\nNth Node : " + slowpointer.getData());
            } else {
                System.out.println("\nLinked list size smaller that what is requested");
            }
        }


    }


}
