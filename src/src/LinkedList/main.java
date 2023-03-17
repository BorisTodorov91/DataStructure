package LinkedList;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        DoublyLinkedList linkedList = new DoublyLinkedList();

        linkedList.addFirst(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        System.out.println(linkedList.deleteFirst());
        System.out.println(linkedList.deleteLast());


        System.out.println();
    }
}
