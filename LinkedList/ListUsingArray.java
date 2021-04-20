import java.util.Arrays;

public class ListUsingArray<T> implements ListInterface<T> {
    private int numOfElements;
    private static final int DEFAULT_CAPACITY = 10;
    private T array[];

    public ListUsingArray() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        numOfElements=0;
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void addFirst(T item) {
        // TODO Auto-generated method stub
        if (numOfElements == array.length) {
            increaseCapacity();
        }
        T previousItem = array[0];
        array[0] = item;
        T currentItem;
        for (int i = 1; i <= numOfElements; i++) {
            currentItem = array[i];
            array[i] = previousItem;
            previousItem = currentItem;
        }
        numOfElements++;
    }

    @Override
    public void addLast(T item) {
        if (numOfElements == array.length) {
            increaseCapacity();
        }
        array[numOfElements++] = item;

    }

    private void increaseCapacity() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }

    @Override
    public void add(int pos, T item) {
        if (numOfElements == array.length) {
            increaseCapacity();
        }
        array[pos] = item;
        for (int i = numOfElements; i >= pos + 1; i--)
            array[i] = array[i - 1];
        numOfElements++;
    }

    @Override
    public T remove(int pos) {
        T item = array[pos];
        for (int i = pos; i <= numOfElements; i++)
            array[i] = array[i + 1];

        numOfElements--;
        return item;
    }

    @Override
    public T removeFirst() {
        return  remove(0);
    }

    @Override
    public T removeLast() {
        // TODO Auto-generated method stub
        return remove(numOfElements-1);
    }

    @Override
    public void clear() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        numOfElements=0;
    }

    @Override
    public T replace(int pos, T item) {
        T itemAtPos = array[pos];
        array[pos]=item;
        return itemAtPos;
    }

    @Override
    public boolean contains(T item) {
        for(int i =0;i<numOfElements;i++)
            if(array[i]==item)
                return true;
        return false;
    }

    @Override
    public T getFirst() {
        if(numOfElements==0)
            return null;
        return array[0];
    }

    @Override
    public T getLast() {
        if(numOfElements==0)
            return null;
        return array[numOfElements-1];
    }

    @Override
    public T get(int pos) {
        if(pos>=0 && pos <numOfElements)
            return array[pos];
        return null;
    }

    @Override
    public boolean isEmpty() {
        return numOfElements==0;
    }

    @Override
    public int getLength() {
        return numOfElements;
    }

    @Override
    public T[] toArray() {
        return array;
    }

}
