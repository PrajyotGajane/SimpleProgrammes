
public class LinkedList {
    static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static void addNode(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public static void displayList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(" " + temp.data);
            temp = temp.next;
        }
    }

    public static void reverseList() {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        addNode(1);
        addNode(4);
        addNode(3);
        addNode(2);
        displayList();
        reverseList();
        System.out.println("Reverse list");
        displayList();

    }
}
