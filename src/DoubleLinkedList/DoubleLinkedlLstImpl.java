package DoubleLinkedList;


public class DoubleLinkedlLstImpl {
    private DoubleNode firstNode;

    public DoubleLinkedlLstImpl() {
        this.firstNode = null;
    }

    public DoubleNode getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(DoubleNode firstNode) {
        this.firstNode = firstNode;
    }


    public void insert(int index, DoubleNode doubleNode) {
        if (index == 0) {
            this.insertAtBeginning(index, doubleNode);
        } else if (index > 0 && index < this.getSize() - 1) {
            this.insertAtMiddle(index, doubleNode);
        } else if (index == this.getSize() - 1) {
            this.insertAtEnd(index, doubleNode);
        }
    }

    public void delete(int index) {
        if (index == 0) {
            this.deleteAtBeginning();
        } else if (index > 0 && index < this.getSize() - 1) {
            this.deleteAtMiddle(index);
        } else if (index == this.getSize() - 1) {
            this.deleteAtEnd(index);
        }
    }


    private void insertAtBeginning(int index, DoubleNode doubleNode) {
        DoubleNode current = this.getFirstNode();
        doubleNode.setPrevious(null);
        doubleNode.setNext(this.getFirstNode());
        this.getFirstNode().setPrevious(doubleNode);
        this.setFirstNode(doubleNode);
    }

    private void insertAtMiddle(int index, DoubleNode doubleNode) {
        DoubleNode current = this.getFirstNode();
        DoubleNode next;


        int i = 0;
        while (current != null) {
            if (i == index) {
                next = current.getNext();
                doubleNode.setNext(next);
                doubleNode.setPrevious(current);
                current.setNext(doubleNode);
                next.setPrevious(doubleNode);
                break;
            }
            i++;
            current = current.getNext();
        }
    }

    private void insertAtEnd(int index, DoubleNode doubleNode) {
        DoubleNode current = this.getFirstNode();
        int i = 0;
        while (current != null) {
            if (i == index) {
                current.setNext(doubleNode);
                doubleNode.setNext(null);
                doubleNode.setPrevious(current);
                break;
            }
            i++;
            current = current.getNext();
        }
    }

    public void deleteAtBeginning() {
        DoubleNode current = this.getFirstNode();
        DoubleNode next;
        next = current.getNext();
        current.setNext(null);
        this.setFirstNode(next);
    }

    public void deleteAtMiddle(int index) {
        DoubleNode current = this.getFirstNode();
        DoubleNode next;
        DoubleNode previous;
        DoubleNode actual;
        int i = 0;
        while (current != null) {
            if (i == index) {
                actual = this.getIndexNode(i);
                previous = actual.getPrevious();
                next = actual.getNext();
                actual.setNext(null);
                actual.setPrevious(null);
                previous.setNext(next);
                next.setPrevious(previous);
                break;
            }
            i++;
            current = current.getNext();
        }
    }

    public void deleteAtEnd(int index) {
        DoubleNode current = this.getFirstNode();
        int i = 0;
        while (current != null) {
            if (i == index) {
                this.getIndexNode(i).setPrevious(null);
                this.getIndexNode(i - 1).setNext(null);
            }
            i++;
            current = current.getNext();
        }
    }


    public int getSize() {
        DoubleNode current = this.getFirstNode();
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

    public DoubleNode getIndexNode(int index) {
        DoubleNode temp = null;
        DoubleNode current = this.getFirstNode();
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

    public void print() {
        DoubleNode current = this.getFirstNode();
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
}
