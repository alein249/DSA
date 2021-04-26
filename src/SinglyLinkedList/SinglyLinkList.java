package SinglyLinkedList;


public class SinglyLinkList {
    //Represent a node of the singly linked list
  static class ListNode{
      int data;
      ListNode next;

      public ListNode(int data) {
          this.data = data;
          this.next = null;
      }
  }
    //Represent the head of the singly linked list
  public ListNode head = null;


  public void display(){
      ListNode current = head;
      while (current != null){
          System.out.print(current.data + " --> ");
          current = current.next;
      }
      System.out.print("null");
  }

    public static void main(String[] args) {
        SinglyLinkList sll = new SinglyLinkList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //Now we will connect them together to form a chain
        sll.head.next = second; //10 --> 1
        second.next = third; //10 --> 1 -->8
        third.next = fourth; //10 --> 1 --> 8 --> 11 --> null

        sll.display();

    }
}
