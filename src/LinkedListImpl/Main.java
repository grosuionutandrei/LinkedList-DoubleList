package LinkedListImpl;

public class Main {

    public static void main(String[] args) {
        Node node = new Node(5);
        Node node1 = new Node(10);
        Node node2 = new Node(15);
        Node node3 = new Node(20);
        Node node4 = new Node(25);
        Node node5 = new Node(30);
        Node node6 = new Node(35);
        Node node7 = new Node(40);
        LinkedListImpl linkedList = new LinkedListImpl();
        linkedList.setFirstNode(node);
        node.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(null);
        print(linkedList);
        System.out.println("insert at beginning");
        linkedList.insert(0, node4);
        print(linkedList);
        System.out.println("insert at end");

        linkedList.insert(linkedList.getSize()-1, node5);
        print(linkedList);
        System.out.println("insert at middle");
        linkedList.insert(3, node6);
        print(linkedList);
        System.out.println("insert at end");
        linkedList.insert(linkedList.getSize()-1,node7);
        print(linkedList);
        linkedList.delete(0);
        System.out.println("delete at beginning");
        print(linkedList);
        System.out.println("delete at middle");
        linkedList.delete(2);
        print(linkedList);
        System.out.println("delete at end");
        linkedList.delete(linkedList.getSize()-1);
        print(linkedList);


    }

    public static void print(LinkedListImpl linkedList) {
        Node current = linkedList.getFirstNode();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }


}
