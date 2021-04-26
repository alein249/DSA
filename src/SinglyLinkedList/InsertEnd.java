package SinglyLinkedList;

public class InsertEnd {
    static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListNode head = null;

    public void insertEnd(int value){
        ListNode newNode = new ListNode(value);
       if(head == null){
           head = newNode;
           return;
       }
       ListNode current = head;
       while (current.next != null){
           current = current.next;
       }
       current.next = newNode;
    }

    public void display(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        InsertEnd sll = new InsertEnd();
        sll.insertEnd(11);
        sll.insertEnd(8);
        sll.insertEnd(1);
        sll.display();

    }
}
