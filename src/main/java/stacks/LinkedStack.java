package stacks;

import java.util.EmptyStackException;

public class LinkedStack {

    ListNode top =null;
    int length;

    public boolean isEmpty(){
        if(length == 0)
            return  true;
        else
            return false;
    }

    public int peek(){//returns first element
        if(isEmpty())
            throw new EmptyStackException();
        else
            return top.getData();
    }

    public int size(){
        return length;
    }

    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        length++;
        top = temp;
    }

    public int pop(){
        if(isEmpty())
            throw new EmptyStackException();
        else
        {
            int result = top.getData();
            top= top.getNext();
            length--;
            return result;
        }

    }

    public static void main(String[] args) {
        LinkedStack linkedStack = new LinkedStack();
        linkedStack.push(40);
        System.out.println(linkedStack.top.getData());
        linkedStack.pop();
        System.out.println(linkedStack.top);

    }

}
