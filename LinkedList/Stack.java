public class Stack<T> implements StackInterface<T> {

    ListInterface<T> list;

    Stack() {
        this('L');
    }

    Stack(char type) {
        switch (type) {
            case 'L':
                list = new ListUsingLinkedList<T>();
                break;
            case 'A':
                list = new ListUsingArray<T>();
                break;
        }
    }

    @Override
    public void push(T item) {
        list.addLast(item);
    }

    @Override
    public T pop() {
        T d = list.getLast();
        list.removeLast();
        return d;
    }

    @Override
    public T peek() {
        return list.getLast();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void clear() {
        list.clear();
    }

}
