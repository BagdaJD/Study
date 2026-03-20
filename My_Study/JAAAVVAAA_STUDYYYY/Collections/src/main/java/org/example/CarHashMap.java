package org.example;

import java.util.List;
import java.util.Set;

public class CarHashMap implements CarMap{
    private static final int INITIAL_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;
    private Entry[] array = new Entry[INITIAL_CAPACITY];
    private int size = 0;

    @Override
    public void put(CarOwner key, Car value){

    }



    private void put(CarOwner key, Car value, Entry[] dst) {
        int position = getElementPosition(key, array.length);
        if(array[position] == null){
            array[position] = new Entry(key, value, null);
            size++;
        }else{
            Entry elem = array[position];
            while(true){
                if(elem.key.equals(key)){
                    break;
                }else if(elem.next == null){
                    elem.next = new Entry(key, value, null);
                }else{
                    elem = elem.next;
                }
            }
        }


    }

    private void increaseArray(){
        Entry[] newArr = new Entry[array.length * 2];
        for(Entry elem : array){
            Entry existElem = elem;

            while(existElem != null){
                //add(existElem)
            }
        }
    }

    @Override
    public Car get(CarOwner key) {
        int position = getElementPosition(key, array.length);
        return array[position].value;
    }

    @Override
    public Set<CarOwner> keySet() {
        return Set.of();
    }

    @Override
    public List<Car> values() {
        return List.of();
    }

    @Override
    public boolean remove(CarOwner key) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {

    }

    private int getElementPosition(CarOwner key, int arrayLength){
        return Math.abs(key.hashCode()  % arrayLength);
    }

    private static class Entry{
        private CarOwner key;
        private Entry next;
        private Car value;

        public Entry(CarOwner key, Car value,Entry next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
