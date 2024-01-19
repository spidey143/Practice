package BasesOOP;

public class Task2_2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(11);
        linkedList.add(12);
    }
}

class LinkedList {
    public Node head;
    public int size;

    static class Node {
        public Integer value;
        public Node next;

        public Node(Integer value, Node next) {
            this.value = value;
            this.next = next;
        }

        public String toString() {
            return String.valueOf(value);
        }
    }

    public LinkedList() {
        this.head = null;
    }

    public void add(Integer value) {
        Node node = new Node(value, null);
        if (head == null) {
            head = node;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
            System.out.println(currentNode.value + " " + currentNode.next);
        }
    }
}

