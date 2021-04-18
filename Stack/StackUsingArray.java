import java.util.EmptyStackException;

public class StackUsingArray<T> implements StackInterface<T> {

	private T[] stack;
	private int top;
	private static final int DEFAULT_CAPACITY = 5;

	public StackUsingArray() {
		this(DEFAULT_CAPACITY);
	}

	public StackUsingArray(int initialCapacity) {
		stack = (T[]) new Object[initialCapacity];
		top = -1;
	}

	public void push(T item) {
		top++;
		stack[top] = item;
	}

	public T pop() {
		if (isEmpty())
			throw new EmptyStackException();
		else {
			T item = stack[top];
			stack[top] = null;
			top--;
			return item;
		}
	}

	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return stack[top];
	}

	public boolean isEmpty() {
		return top < 0;
	}

	public void clear() {
		while (top > -1) {
			stack[top] = null;
			top--;
		}
	}
}
