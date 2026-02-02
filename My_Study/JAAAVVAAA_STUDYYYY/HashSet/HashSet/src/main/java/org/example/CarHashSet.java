package org.example;

public class CarHashSet implements CarSet{
    private int size = 0;
    private static final int INITIAL_CAPACITY = 16;
    private Entry[] array = new Entry[INITIAL_CAPACITY];

    private int getElementPosition(Car car, int arrayLength){
        return Math.abs(car.hashCode() % arrayLength);
    }

    @Override
    public boolean add(Car car) {
        int position = getElementPosition(car, array.length);
        if(array[position] == null) {
            array[position] = new Entry(car, null);
            size++;
            return true;
        }else{
            Entry existedElement = array[position];
            if(existedElement.value.equals(car)){
                return false;
            }else{
                while(existedElement != null && !existedElement.value.equals(car)){
                    existedElement = existedElement.next;
                }
                existedElement.next = new Entry(car, null);
            }
        }
        return false;
    }

    @Override
    public boolean remove(Car car) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    private static class Entry{
        private Car value;
        private Entry next;


        public Entry(Car value, Entry next) {
            this.value = value;
            this.next = next;
        }
    }
}
