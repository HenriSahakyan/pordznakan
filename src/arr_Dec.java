
public  class arr_Dec<E>  {
	private Object[] arr =  new Object[100];
	private int size = 0;
	private int first = 0;
	private int last=1;


	public arr_Dec() { }

	private void isFull() {
		if (size == arr.length) {
			Object[] newArr = new Object[size * 2];
			int index = 0;
			for (int i = first + 1; i < size; i++) {
				newArr[index] =  arr[i];
				index++;
			}
			first = newArr.length - 1;
			for (int i = 0; i < last; i++) {
				newArr[index] =  arr[index];
				index++;
			}
			last = index;
			arr =  newArr;
		}
	}


	public int size() {
		return size;
	}


	public boolean isEmpty() {
		return size == 0;
	}


	public E first() {
		if (first==arr.length-1)
			return (E) arr[0];

		else
			return (E) arr[(first +1) % arr.length];
	}


	public E last() {
		return (E) arr[(last-1) % arr.length];
	}


	public void addFirst(E element) {
		isFull();
		arr[first]=  element;
		if(first-1<0)
		first = (first +arr.length - 1) % arr.length;
		else first = (first  - 1) % arr.length;
		size++;
	}


	public void addLast(E element) {
		isFull();

		arr[last] = element;
		last = (last + 1) % arr.length;
		size++;
	}


	public E removeFirst() {
		if (isEmpty()) {
			return null;
		}
		E removable = first();
		if(first==arr.length-1)
		first = 0;
		else
			first=(first + 1) % arr.length;
		size--;
		return removable;
	}


	public E removeLast() {
		if (isEmpty()) {
			return null;
		}
		E temp = last();
		last = (last - 1) % arr.length;
		size--;
		return temp;
	}
}
