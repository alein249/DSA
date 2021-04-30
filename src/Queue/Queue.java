package Queue;

import java.util.NoSuchElementException;

public class Queue {
    public ListNode front;
    public ListNode rear;
    public int length;

    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;

    }
    static class ListNode{
        int data;
        ListNode next;
        public ListNode(int data){
            this.data = data;
        }
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front = temp;
        }
        else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }
    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while (current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.data;
        front = front.next;
        if(front == null){
            rear =null;
        }
        length--;
        return result;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.print();

        queue.dequeue();
        queue.dequeue();
        queue.print();
    }
}
