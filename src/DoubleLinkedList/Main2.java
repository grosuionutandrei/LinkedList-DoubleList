package DoubleLinkedList;

public class Main2 {
    public static void main(String[] args) {
        DoubleLinkedlLstImpl doubleLinkedlLst = new DoubleLinkedlLstImpl();
        DoubleNode node = new DoubleNode(10);
        DoubleNode node1 = new DoubleNode(15);
        DoubleNode node2 = new DoubleNode(20);
        DoubleNode node3 = new DoubleNode(25);
        DoubleNode node4 = new DoubleNode(5);
        DoubleNode node5 = new DoubleNode(14);
        DoubleNode node6 = new DoubleNode(30);
        doubleLinkedlLst.setFirstNode(node);
        node.setPrevious(null);
        node.setNext(node1);
        node1.setPrevious(node);
        node1.setNext(node2);
        node2.setPrevious(node1);
        node2.setNext(node3);
        node3.setPrevious(node2);
        node3.setNext(null);
        doubleLinkedlLst.print();

        System.out.println();
        System.out.println("Insert at beginning");
        doubleLinkedlLst.insert(0, node4);
        doubleLinkedlLst.print();

        System.out.println();
        System.out.println("Insert at middle");
        doubleLinkedlLst.insert(1, node5);
        doubleLinkedlLst.print();

        System.out.println();
        System.out.println("Insert at end");
        doubleLinkedlLst.insert(doubleLinkedlLst.getSize() - 1, node6);
        doubleLinkedlLst.print();

        System.out.println();
        System.out.println("delete at beginning");
        doubleLinkedlLst.delete(0);
        doubleLinkedlLst.print();

        System.out.println();
        System.out.println("delete at middle");
        doubleLinkedlLst.delete(1);
        doubleLinkedlLst.print();

        System.out.println();
        System.out.println("delete at end");
        doubleLinkedlLst.delete(doubleLinkedlLst.getSize() - 1);
        doubleLinkedlLst.print();
    }
}
