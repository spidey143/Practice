package BasesOOP;

import org.w3c.dom.Node;

public class Task2 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(new LinkedList.Node(5));
        linkedList.add(10);
        System.out.println(linkedList);
    }
}

class LinkedList{
    public Node head;
    public Node tail;

    static class Node{
        public Integer value;
        public Node next;

        public Node(Integer value) {
            this.value = value;
        }
    }

    public LinkedList(Node node) {
        this.head = node.next;
        this.tail = node.next;
    }

    public void add(Integer value){
        if(head!=null){
            head = new Node(value);
        }
    }

    public String toString(){
        return "["+head + tail +"]";
    }
}
