package LinearDataStructure.DoublyLinkedList;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value + "";
        }
    }

    public void addFirst(int element) {

        Node newNode = new Node(element);
        if (!isEmpty()) {
            newNode.next = this.head;
            this.head.prev = newNode; //null
        } else {
            this.tail = newNode;
        }
        this.head = newNode;
        size++;

    }

    public void addLast(int element) {

        if (isEmpty()) {
            addFirst(element);
            return;
        }
        Node newNode = new Node(element);
        newNode.prev = this.tail;
        this.tail.next = newNode; //null
        this.tail = newNode;
        size++;
    }

    public int deleteFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("List is empty!");
        }

        int result = head.value;
        size--;
        this.head = this.head.next;
        if (this.size > 1) {
            this.head.prev = null;
        }
        if (isEmpty()) {
            this.head = null;
            this.tail = null;
        }
        return result;
    }

    public int deleteLast() {

        if (this.size < 2) {
            return deleteFirst();
        }
        int result = this.tail.value;

        this.tail.next = null;
        this.tail = this.tail.prev;
        this.size--;
        return result;
    }


    private boolean isEmpty() {
        return this.size == 0;
    }

}
