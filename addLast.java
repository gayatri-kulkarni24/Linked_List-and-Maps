import java.util.*;
public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void print(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
    public static void main(String args[]){
      LinkedList ll=new LinkedList();
        ll.addLast(25);
        ll.addLast(26);
        ll.addLast(27);
        ll.addLast(28);
            ll.print();
    }

}
