
public class Stack {

	private int size = 0;
	private int elements[] = new int[20];
	
	public boolean isEmpty() {
		return (this.size == 0);
	}

	public void push(int element) {
		this.elements[size++] = element;
	}

	public Object getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	public int pop() {
		if (isEmpty()) {
			throw new Underflow();
		} else {
			return this.elements[--size];
		}
	}

	public static class Underflow extends RuntimeException {

		/**
		 * 
		 */
		private static final long serialVersionUID = 8602027110150372736L;
	}
}
