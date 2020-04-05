
public class MySinglyLinkedList<E> {


	public static class Node<E> {
		private E element;
		private Node<E> next;

		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}

		public E getElement() {
			return element;
		}

		public Node<E> getNext() {
			return next;
		}

		public void setNext(Node<E> n) {
			next = n;
		}
	}

	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;

	public MySinglyLinkedList() {
	}
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E first() {
		if (isEmpty()) return null;
		return head.getElement();
	}

	public E last() {
		if (isEmpty()) return null;
		return tail.getElement();
	}

	public void addFirst(E e) {
		head = new Node<>(e, head);
		if (size == 0)
			tail = head;
		size++;
	}

	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if (isEmpty())
			head = newest;
		else
			tail.setNext(newest);
		tail = newest;
		size++;
	}

	public E removeFirst() {
		if (isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0)
			tail = null;
		return answer;
	}
	public  void change_llist(MySinglyLinkedList list, int n, int a){

              if(list.head!=null) {
				  Node<E> temp = list.head;
				  list.head = list.head.getNext();
				  a++;
				  change_llist(list, n,a);

				 if(a%2==0) {
					 for (int i = 0; i < n; i++) {
						 list.addFirst(temp.getElement());
					 }
				 }
				 else {
					 list.addFirst(temp.getElement());
				 }

			  }
	}
	public  void cha(MySinglyLinkedList list) {

		if (list.head != null)
		{   Node<E> temp = list.head;
			list.head = list.head.getNext();
			cha(list);
			list.addFirst(temp.getElement());
			list.addFirst(temp.getElement());




		}
	}


	public static void printList(MySinglyLinkedList list)
	{
		Node currNode = list.head;

		System.out.print("LinkedList: ");

		while (currNode != null) {

			System.out.print(currNode.getElement() + " ");


			currNode = currNode.next;
		}
	}

	public boolean isThere (E element) {
		Node<E> temp = head;
		boolean flag = false;
		while (temp !=null) {
			if (element != temp.getElement()) {
				temp=temp.getNext();
			}
			else {
				return flag=true;
			}
		}

         return false;
	}

	public static MySinglyLinkedList list_rev(MySinglyLinkedList list) {
		if(list.head == null) {
			return list;
		}
		if(list.head.getNext() == null) {
			return list;
		}
        list.head=list.head.getNext();
		MySinglyLinkedList newList = list_rev(list);

		return newList;
	}
	public  static MySinglyLinkedList double_el(MySinglyLinkedList list){
		if(list.head == null) {
			return list;
		}
		if(list.head.getNext()==null){
				return list;
			}
		list.head.getElement();
		//hi man
		//hi women


	}
}

