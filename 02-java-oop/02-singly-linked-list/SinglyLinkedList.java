
public class SinglyLinkedList {
    public Node head;
    public int nodeSize;

    //Constructor
    public SinglyLinkedList() {
        head = null;
    }

    /*==============================*/
    // Methods - add()
    /*==============================*/
    public void add(int value) {
        Node newNode = new Node(value);
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

    /*==============================*/
    // Methods - add()
    /*==============================*/
    public void remove() {
        nodeSize = size();
        if( nodeSize == 0 ) {
            throw new NullPointerException("Empty list");
        }
        if(head != null) {
            Node current;
            current = head.next;

            while(current.next != null)
            {
                if (current.next.next == null){
                    current.next = null;
                }else{
                    current = current.next;
                }//else
            }//while
        }//if
    }//remove

    /*==============================*/
    // Methods - size()
    /*==============================*/
    public int size(){
        int size = 0;
        Node CurrNode = head;
        if(head == null) {  
            System.out.println("List is empty");  
            return size;  
        }

        while(CurrNode.next != null)
        {
            size++;
            CurrNode = CurrNode.next;  
        }
        
        return size;       
    }//size

    /*==============================*/
    // Methods - printValues()
    /*==============================*/
    public void printValues() {    
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  

        while(current != null) {   
            System.out.print(current.value + " ");  
            current = current.next;  
        } 

        System.out.println(); 
        System.out.println("Node size is: " + getNodeSize()); 
    } //printValues

    /*==============================*/
    // Methods - getNodeSize()
    /*==============================*/
    public int getNodeSize(){
            return this.nodeSize;
    }
}// class