package org.example;

public class CarLinkedList implements CarList{
    private int size = 0;
    private Node first;
    private Node last;

    @Override
    public void add(Car car) {
        if(size == 0){
            first = new Node(null, car, null);
            last = first;
        }else{
            Node secondLast = last;
            last = new Node(secondLast, car, null);
            secondLast.next = last;
        }
        size++;
    }

    @Override
    public void add(Car car, int index) {
        if(index == size){
            add(car);
            return;
        }
        Node nodeNext = getNode(index);
        Node nodePrevious = nodeNext.previous;
        Node newNode = new Node(nodePrevious, car, nodeNext);
        nodeNext.previous = newNode;

        if(nodePrevious != null){
            nodePrevious.next = newNode;
        }else{
            first = newNode;
        }
        size++;
    }

    @Override
    public void remove(Car car) {
        Node node = first;
        for(int i = 0; i < size; i++){
            node = first.next;
            if(car.equals(node.value)){
                /*
                Node previousNode = node.previous;
                Node nextNode = node.next;
                previousNode.next = nextNode;
                 */
                removeAt(i);
            }
        }
    }

    @Override
    public void removeAt(int index) {
        Node node = getNode(index);
        Node nextNode = node.next;
        Node previousNode = node.previous;

        if(nextNode != null){
            //previousNode.next = nextNode;
             nextNode.previous = previousNode;
        }else{
            last = previousNode;
        }

        if(previousNode != null){
            previousNode.next = nextNode;
        }else{
            first = nextNode;
        }
        size--;
    }

    @Override
    public Car get(int index) {
        checkIndex(index);
        return getNode(index).value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private Node getNode(int index){
        checkIndex(index);

        Node node = first;
        for(int i = 0; i < index; i++){
            node = node.next;
        }

        return node;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
    }

    private class Node{
        private Node previous;
        private Node next;
        private Car value;

        public Node(Node previous, Car value, Node next) {
            this.previous = previous;
            this.next = next;
            this.value = value;
        }
    }
}
