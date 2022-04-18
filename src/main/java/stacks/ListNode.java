package stacks;

public class ListNode {
    Integer data;
    ListNode next;

    public ListNode(Integer d){
        this.data = d;
        this.next = null;

    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
