package LinkedListImpl;

public class LinkedListImpl {
    private Node firstNode;

    public Node getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node firstNode) {
        this.firstNode = firstNode;
    }

    public LinkedListImpl() {
        this.firstNode = null;
    }

    public void insert(int index, Node node) {
        if (index == 0) {
            this.insertAtBeginning(node);
        } else if (index == this.getSize() - 1) {
            this.insertAtEnd(index, node);
        } else if (index > 0 && index < this.getSize() - 1) {
            this.insertAtMiddle(index, node);
        }


    }

    private void insertAtBeginning(Node node) {
        Node current = this.getFirstNode();
        node.setNext(current);
        this.setFirstNode(node);
    }


    public int getSize() {
        Node current = this.getFirstNode();
        int size = 1;
        while (current != null) {

            if (current.getNext() == null) {
                break;
            }
            size++;
            current = current.getNext();


        }
        return size;
    }


    private void insertAtMiddle(int index, Node node) {
        Node current = this.getFirstNode();
        Node next;
        int i = 0;
        while (current != null) {
            if (i == index) {
                next = current.getNext();
                current.setNext(node);
                node.setNext(next);
                break;
            }
            i++;
            current = current.getNext();
        }
    }

    private void insertAtEnd(int index, Node node) {
        Node current = this.getFirstNode();
        int i = 0;
        while (current != null) {

            if (i == index) {
                current.setNext(node);
                node.setNext(null);
                break;
            }
            i++;
            current = current.getNext();

        }
    }

    public Node getIndexNode(int index) {
        Node temp = null;
        Node current = this.getFirstNode();
        int i = 0;
        while (current != null) {
            if (i == index) {

                temp = current;
            }
            i++;
            current = current.getNext();
        }
        return temp;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteAtBeginning();
        } else if (index == this.getSize() - 1) {
            deleteAtEnd(index);
        } else if (index > 0 && index < this.getSize() - 1) {
            deleteAtMiddle(index);
        }
    }


    private void deleteAtBeginning() {
        Node current = this.getFirstNode();
        this.setFirstNode(current.getNext());
        current.setNext(null);
    }


    private void deleteAtEnd(int index) {
        int i = 0;
        Node current = this.getFirstNode();
        Node previous;
        while (current != null) {
            if (i == index) {
                previous = this.getIndexNode(i - 1);
                previous.setNext(null);
            }
            i++;
            current = current.getNext();
        }
    }

    private void deleteAtMiddle(int index) {
        Node current = this.getFirstNode();
        Node next;
        Node actual;
        Node previous;
        int i = 0;
        while (current != null) {
            if (i == index) {
                previous = this.getIndexNode(i - 1);
                actual = this.getIndexNode(i);
                next = actual.getNext();
                previous.setNext(next);
                actual.setNext(null);
            }
            i++;
            current = current.getNext();
        }
    }
}

class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}