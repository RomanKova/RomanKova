
import java.util.EmptyStackException;

public class StackUsingLinkedList<T> implements StackInterface<T> {

	private Node top;

	public StackUsingLinkedList() {
		top = null;
	}

	@Override
	public void push(T item) {
		Node newNode = new Node(item, top);
		top = newNode;

	}

	@Override
	public T pop() {
		T item = peek();
		top = top.getNext();

		return item;
	}

	public T peek() {
		if (isEmpty())
			throw new EmptyStackException();
		else
			return top.getData();
	}

	public boolean isEmpty() {
		return top == null;
	}

	public void clear() {
		top = null;

	}

	private class Node {
		private T data;
		private Node next;

		private Node(T data) {
			this(data, null);
		}

		private Node(T data, Node link) {
			this.data = data;
			next = link;
		}

		private T getData() {
			return data;
		}

		private void setData(T data) {
			this.data = data;
		}

		private Node getNext() {
			return next;
		} 

		private void setNext(Node next) {
			this.next = next;
		}
	}

}
