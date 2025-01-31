class Node {
    int data;
    Node next;
}

class LinkedListimp {
    
    Node head;
    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }
    public void show() {
        Node node = head;

        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtStart(int data) {
        Node n = new Node();
        n.data = data;
        n.next = head;
        head = n;
    }
    public void insertAt(int index, int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (index == 0) {
            this.insertAtStart(data);
            return;
        }

        Node n = head;

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        node.next = n.next;
        n.next = node;
        
    }
    public void deleteAt(int index) {
        Node n = head;

        if (index == 0) {
            head = head.next;
        }

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        n.next = n.next.next;


    }
}
public class LinkedList1 {
    public static void main(String[] args) {
        LinkedListimp list = new LinkedListimp();
        list.insert(18);
        list.insert(45);
        list.insert(3);
        list.insertAtStart(5);
        list.insertAt(0, 55);
        list.deleteAt(0);
        

        list.show();
    }
}