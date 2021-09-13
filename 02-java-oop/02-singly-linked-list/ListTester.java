
import java.lang.*;
import java.util.*;

public class ListTester {
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(24);
        sll.add(7);
        sll.add(18);
        sll.add(27);
        sll.add(325);
        sll.add(5);
        sll.add(5);
        sll.add(37);
        sll.remove();
        sll.remove();
        sll.printValues();
    }
}