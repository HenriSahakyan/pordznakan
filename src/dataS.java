
import java.util.ArrayList;


public class dataS {
	public static void swap_shift(int[] arr, int num, int pos) {
		for (int i = 0; i < arr.length - pos; i++) {
			arr[arr.length - 1 - i] = arr[arr.length - 2 - i];

		}
		arr[pos] = num;
	}

	public static void shift_arr(ArrayList arr ,int num,int pos){
		while (pos!=0){
			arr.set(pos,arr.get(pos-1));
			pos--;
		}
		arr.set(pos,num);
	} // for HW 2 ex 3

	public static int dev_rec(int a, int b) {

		if (a < b) return 0;
		else return 1 + dev_rec(a - b, b);

	}

	public static int pow_rec(int n, int m) {
		if (m == 0) return 1;
		else return n * pow_rec(n, m - 1);
	}

	public static int sum_rec(int n) {
		if (n == 0) return 0;
		else return n + sum_rec(n - 1);
	}

	public static String remove_rec(String n, char m) {
		if (n.length() == 0) return n;
		else if (n.charAt(0) == m) return remove_rec(n.substring(1), m);
		else return n.charAt(0) + remove_rec(n.substring(1), m);
	}

	public static int guess_rec(int n) {


		return 0;
	}

//	public static int bin_rec(int n, Stack<Integer> s) {
//		if (n == 0) {
//			int b=10;
//
//			for(int i=0;i<s.size();i++){
//				if (n == 0) {
//					n = s.pop();
//
//				} else {
//					n = n +  b*s.pop();
//				}
//				b=b*10;
//			}
//			return n;
//
//		} else if (n % 2 != 0) {
//			s.push(1);
//			return bin_rec(n / 2,s);
//		} else {
//			s.push(0);
//			return bin_rec(n / 2,s);
//		}
//	}

	public static int[] change_arr(int[] arr, int num_el) {
		if (num_el == 0) return arr;

		else {

			if (num_el == arr.length) return change_arr(arr, num_el - 1);

			else {
				int temp = arr[arr.length - num_el];
				if (num_el == arr.length - 1) {
					swap_shift(arr, arr[0], 1);
				} else arr[arr.length - num_el] = arr[arr.length - num_el - 1] * temp;
				return change_arr(arr, num_el - 1);

			}
		}
	}

	public static void change_arrl(ArrayList arr){

		if(arr.isEmpty()) System.out.println("Error 404");

		else{
			for(int i=0;i<arr.size();i++){

				if ((int)arr.get(i)%2==0){
	             shift_arr(arr,(int)arr.get(i),i);
				}
			}
		}

	}
	public static ArrayList SumArr_rec(ArrayList arr, int count) {          // We must always enter counter 0;
		if (arr.isEmpty()) {
			System.out.println("Error 404");
			return arr;
		}
		else if (count == arr.size()) return arr;
		else {
			arr.set(count, 0);
			for (int i = count; i < arr.size(); i++) {
				int n = (int) arr.get(i) + (int) arr.get(count);
				arr.set(count, n);

			}
			return SumArr_rec(arr, count + 1);
		}
	}





	public static void main(String[] args) {
//		ArrayList arr= new ArrayList();
//		ArrayList arr1= new ArrayList();
//		arr.add(1);
//		arr.add(-2);
//		arr.add(3);
//		arr.add(0);
//		arr.add(4);
//		arr.add(5);
//
//		change_arrl(arr);
//
//		for (int i=0;i<arr.size();i++){
//			System.out.println(arr.get(i));
//		}
//		change_arrl(arr1); // case Empty List

		MySinglyLinkedList list = new MySinglyLinkedList();
		list.addFirst(5);
		list.addFirst(4);
		list.addFirst(3);
		list.addFirst(2);
		list.addFirst(1);
		list.list_rev(list);
//        list.cha(list);
     	list.printList(list);
//        System.out.println(list.isThere(5));
//		LinkedStack<Integer> stack = new LinkedStack<>();

//		stack.push(5);
//		stack.push(4);
//		stack.push(3);
//		stack.push(2);
//		stack.push(1);
//		stack.push(4);
//		stack.push(5);
//		stack.pop();
//		stack.push(5);
//		stack.push(4);
//		stack.push(5);
//		stack.pop();
//		stack.push(4);





//		System.out.println(dev_rec(3, 3));
//		System.out.println(pow_rec(2, 0));
//		System.out.println(sum_rec(4));
//		System.out.println(remove_rec("Heeenry", 'e'));
//		int[] arr= new int[]{2, 5, 1, 7, 3, 8};
//		arr=change_arr(arr,6);
//		for(int i=0;i<6;i++){
//			System.out.println(arr[i]);
//		}
//		arr_Dec test = new arr_Dec ();
//		test.addFirst(645444);
//		test.addFirst(5);
//		test.addFirst(4);
//		test.addFirst(100);
//		test.addFirst(645);
//		test.addFirst(65);
//		test.addFirst(6);
//		test.addLast(850);
//		test.addFirst(645222);
//		test.addFirst(0);
//		System.out.println(test.removeFirst());
//		System.out.println(test.removeLast());
//		System.out.println();
//        System.out.println(test.first());
//		System.out.println(test.last());

	}
}