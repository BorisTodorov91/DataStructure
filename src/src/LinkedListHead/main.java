package LinkedListHead;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedListHead linkedListHead = new LinkedListHead();

        linkedListHead.addFirst(12);
        linkedListHead.addLast(23);

        linkedListHead.forEach(System.out::println);
    }
}
