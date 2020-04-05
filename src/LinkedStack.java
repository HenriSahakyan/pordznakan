public class LinkedStack <E> {
	private MySinglyLinkedList<E> list = new MySinglyLinkedList<>();
	private MySinglyLinkedList<E> processed = new MySinglyLinkedList<>();

	public LinkedStack() { }

	public int size() {
		return list.size();
	}

	public void push(E element) {
		if (processed.isThere(element)) {
			System.out.println("This Object cannot be added");
		} else
			list.addFirst(element);
	}




	    public E top() {return list.first();}
		public E pop() {
		processed.addFirst(list.first());
		return list.removeFirst();}
}

