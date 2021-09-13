
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }    

public void remove() {

    if(size()==0) {
        throw new NullPointerException("Empty list");
    }
    if(head != null) {
        Node current;
        //starting next one to our head
        current = head.next;
        for(int i=0; i<size()-1; i++) {
            current = current.next;
        }
        current.next = null;
    }//if



}//remove










}//SinglyLinkedList
