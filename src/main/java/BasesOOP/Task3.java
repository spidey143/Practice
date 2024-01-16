package BasesOOP;

public class Task3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addStart(5);
        linkedList.addStart(10);
        linkedList.addStart(11);
        System.out.println(linkedList);
    }
}

class LinkedList {
    public Node head;
    public Node tail;

    static class Node {
        public Integer value;
        public Node next;
        public Node prev;

        public Node(Integer value) {
            this.value = value;
        }

        public String toString() {
            return String.valueOf(value);
        }
    }

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addStart(Integer value) {
        Node node = new Node(value);
        if(head == null && tail == null) {
            this.head = node;
            this.tail = node;
        }
        node.next = head;
        head = node;
        tail.prev = node;
        System.out.print(
                "h:" + head.value +
                "\nv:" + head.prev + "\nn:"+ head.next);
    }

    public void addEnd(Integer value) {
        Node node = new Node(value);
        node.prev = tail;
        head = node;
        System.out.println(head.value + " " + head.next);
    }
}

