package operations;

import basic.SLLNode;

import java.util.HashSet;

public class FindIfLoopExist {

    SLLNode head;
    int length = 0;

    public static void main(String[] args) {
        FindIfLoopExist sll = new FindIfLoopExist();
        sll.addNodeAtEnd(1);
        sll.addNodeAtEnd(2);
        sll.addNodeAtEnd(3);
        sll.addNodeAtEnd(4);
        sll.addNodeAtEnd(5);
        sll.addNodeAtEnd(6);
        sll.addNodeAtEnd(7);
        sll.addNodeAtEnd(8);

        sll.createLoop();
        // sll.traverse();//1
        // System.out.println(sll.findIfLoopExistUsingHash());
        sll.findIfLoopExistUsingPointer();
    }

    //Method 2: Using two pointer-if they enter in a loop they are supposed to meet at some point
    private void findIfLoopExistUsingPointer() {
        SLLNode slow_p = head;
        SLLNode fast_p = head;
        boolean loopexist = false;

        while (fast_p != null && fast_p.getNext() != null) {
            slow_p = slow_p.getNext();
            fast_p = fast_p.getNext().getNext();

            if (slow_p == fast_p) {
                loopexist = true;
                break;
            }
        }
        if (loopexist) { //Finding the start of loop
            slow_p = head;
            while (slow_p != fast_p) {
                slow_p = slow_p.getNext();
                fast_p = fast_p.getNext();
            }
            System.out.println("Start Of Loop : " + slow_p.getData());
        }

        if (loopexist) { //finding the length of loop
            int count = 0;
            do {
                fast_p = fast_p.getNext();
                count = count + 1;
            }
            while (slow_p != fast_p);
            System.out.println("Length Of Loop : " + count);
        }

    }

    private void createLoop() {
        SLLNode temp = head;
        SLLNode temp2 = head;

        for (int i = 0; i < 4; i++) {
            temp = temp.getNext();
        }
        while (temp2.getNext() != null) {
            temp2 = temp2.getNext();
        }
        temp2.setNext(temp);
        //System.out.println(head);
    }

    //Method :1 Using map method
    private boolean findIfLoopExistUsingHash() {
        SLLNode temp = head;
        HashSet map = new HashSet();

        while (temp != null) {
            if (map.contains(temp))
                return true;
            map.add(temp);
            temp = temp.getNext();
        }
        return false;
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


}
