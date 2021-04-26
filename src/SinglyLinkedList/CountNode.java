package SinglyLinkedList;

public class CountNode {
    static class ListNode {
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public ListNode head = null;

    public int countNodes(){
        ListNode current = head;
        int count = 0;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
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
        CountNode sll = new CountNode();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);


        //Now we will connect them together to form a chain
        sll.head.next = second; //10 --> 1
        second.next = third; //10 --> 1 -->8
        third.next = fourth; //10 --> 1 --> 8 --> 11 --> null

        sll.display();
        System.out.println("\nTotal no of nodes in list : " + sll.countNodes());

    }

}
