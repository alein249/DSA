package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {
    static class ListNode{
        ListNode next;
        int data;
        public ListNode(int data){
            this.data = data;
        }
    }
    public ListNode last;
    public int length;

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }
    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while (first != last){
            System.out.print(first.data + " ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCircularLinkedList();
        csll.display();
    }

}
