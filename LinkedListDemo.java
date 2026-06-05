class Node{
    int data;   //Data is store the values
    Node next;   //next is stores the address of next node
    Node(int data){
        this.data = data;
        this.next = null;    //Initially, there is no next node, so next = null
    }
}
public class LinkedListDemo {
    public static void main(String[] args){
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = second;  //Links the nodes together.
        second.next = third;
        Node temp = head;    //Traverses the linked list from the first node to the last node.
        while(temp != null){  //Loop runs until the end of the linked list.
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
     
}
