package SinglyLinkedList;

public class InsertGivenPos {
    static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListNode head = null;

    public void insertGivenPos(int pos, int value){
        ListNode newNode = new ListNode(value);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            ListNode previous = head;
            int count = 1;
            while (count < pos - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
        }
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
        InsertGivenPos sll = new InsertGivenPos();
        sll.insertGivenPos(1,3);
        sll.insertGivenPos(2,5);
        sll.insertGivenPos(1,2);
        sll.insertGivenPos(2,4);
        sll.display();

    }
}
