package org.example;
public class CarLinkedList implements CarList{
    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public Car get(int index) {
        return getNode(index).value;
    }

    @Override
    public void add(Car car) {//Обычная вставка в конец
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
    public void removeAt(int index) {
        Node node = getNode(index);
        Node nodeNext = node.next;
        Node nodePrevious = node.previous;

        if(nodeNext != null){
            nodeNext.previous = nodePrevious;
        }else{//Удаление последнего
            last = nodePrevious;
        }

        if(nodePrevious != null){
            nodePrevious.next = nodeNext;
        }else{//Удаление первого
            first = nodeNext;
        }

        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first.next = null;
        last.previous = null;
    }

    @Override
    public void add(Car car, int index) {// вставка по индексу

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
        int index = 0;
        for(int i = 0; i < size; i++){
            if(node.value.equals(car)) {
                removeAt(i);
                break;
            }
            node = node.next;
        }
    }


    private Node getNode(int index){
        if(index <  0 || index >= size) throw new IndexOutOfBoundsException();
        Node node = first;

        for(int i = 0; i < index; i++){
            node = node.next;
        }

        return node;
    }
    private static class Node{
        private Node previous;
        private Node next;
        Car value;

        public Node(Node previous, Car value, Node next){
            this.previous =  previous;
            this.next = next;
            this.value = value;
        }
    }
}
