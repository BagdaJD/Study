package BeOnMax.MyArrayList;

public class MyArrayList<T>{
    private T[] arr;
    private int size = 0;//кол-во элементов

    public MyArrayList(){
        arr = (T[]) new Object[10];
    }

    public void add(T obj){
        arr[size] = obj;
        size++;
        if(size == arr.length){
            T[] newArr = (T[]) new Object[arr.length * 2];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void remove(int index){
        if(index >= 0 && index < size){
            for(int i = index; i < size - 1; i++){
                arr[i] = arr[i + 1];
            }
            size--;
        }else{
            throw new IndexOutOfBoundsException();
        }

    }

    public void remove(T obj){
        int index = -1;

        for (int i = 0; i < size; i++) {
            if(arr[i].equals(obj)){
                index = i;
                remove(index);
                break;
            }
        }
        if(index == -1){
            System.out.println("Такого элемента нет");
        }
    }

    public T get(int index){
        if(index >= 0 && index < size){
            return arr[index];
        }else{
            throw new IndexOutOfBoundsException();
        }
    }

    public T get(){
        return arr[size - 1];
    }

    public int getSize(){
        return size;
    }

    public void set(int index, T obj){
        arr[index] = obj;
    }
}
