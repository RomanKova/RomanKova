
public interface ListInterface<T> {
	
	public void add(T item);
	public void addFirst(T item);
	public void addLast(T item);
	public void add(int pos, T item);
	
	public T remove (int pos);
	public T removeFirst();
	public T removeLast();
	
	public void clear();
	
	public T replace(int pos,T item);
	public boolean contains(T item);
	
	public T getFirst();
	public T getLast();
	public T get(int pos);
	
	public boolean isEmpty();
	public int getLength();
	
	public T[] toArray();
}
