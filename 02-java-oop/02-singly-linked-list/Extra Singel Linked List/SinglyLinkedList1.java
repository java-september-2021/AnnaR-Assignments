
public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value)
        if(head == null) {
            head = newNode;
        } else {     
           //else transverse to the end of the list
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


public int size()
{
    int size = 0;
    Node CurrNode = head;
    while(CurrNode.next != null)
    {
        CurrNode = CurrNode.next;
        size++;     
    }
    return size;
}//size



public void printValues() {  
//Node current will point to head  
    Node current = head;  
    if(head == null) {  
       System.out.println("List is empty");  
       return;  
     }  

    while(current != null) {  
    //Prints each node by incrementing pointer  
       System.out.print(current.value + " ");  
       current = current.next;  
      } 

    System.out.println();  
 } //printValues



// public void remove(int index) {
//     if(index<0 || index>size())
//     throw new IndexOutOfBoundsException("Index out of bounds. Can't remove a node. No node exists at the specified index");
//     if(size()==0) {
//         throw new NullPointerException("Empty list");
//     }
//     if(!isEmpty()) {
//         Node current;
//         //starting next one to our head
//         current = head.next;
//         for(int i=0;i<index;i++) {
//             current = current.next;
//         }
//         current.previous.next = current.next;
//         current.next.previous = current.previous;
//         numOfNodes--;
//         sizeChangeCount++;
//     }
// }



}// class