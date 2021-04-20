import java.util.LinkedList;
import java.util.List;

public class ListUsingLinkedList<T> implements ListInterface<T> {

    private List<T> list;

    public ListUsingLinkedList() {
        list = new LinkedList<>();
    }

    @Override
    public void add(T item) {
        addFirst(item);
    }

    @Override
    public void addFirst(T item) {
        list.add(0, item);
    }

    @Override
    public void addLast(T item) {
        // TODO Auto-generated method stub
        list.add(item);
    }

    @Override
    public void add(int pos, T item) {
        list.add(pos, item);
    }

    @Override
    public T remove(int pos) {
        return list.remove(pos);
    }

    @Override
    public T removeFirst() {
        return list.remove(0);
    }

    @Override
    public T removeLast() {
        return list.remove(list.size() - 1);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public T replace(int pos, T item) {
        return list.set(pos, item);
    }

    @Override
    public boolean contains(T item) {
        return list.contains(item);
    }

    @Override
    public T getFirst() {
        return list.get(0);
    }

    @Override
    public T getLast() {
        return list.get(list.size() - 1);
    }

    @Override
    public T get(int pos) {
        return list.get(pos);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int getLength() {
        return list.size();
    }

    @Override
    public T[] toArray() {
        return (T[]) list.toArray();
    }

}
