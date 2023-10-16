public class LinkedList {

	public ListNode head, tail;
	public int size;

	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	public void insertAfter(ListNode argNode, int value) { //complete this method
		if (argNode == null) {
			System.out.println("Error, node is null!");
			return;
		}
		ListNode newNode = new ListNode(value);
		newNode.next = argNode.next;
		argNode.next = newNode;
		if (tail == argNode) {
			tail = newNode;
		}
		size++;
	}

	public void deleteAfter(ListNode argNode) { //complete this method
		if (argNode == null || argNode.next == null) {
			System.out.println("Error, node is null!");
			return;
		}
		argNode.next = argNode.next.next;
		if (argNode.next == null) {
			tail = argNode;
		}
		size--;
	}

	public void reverse() { //complete this method
		ListNode current = head;
		ListNode prev = null;
		ListNode next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		ListNode temp = head;
		head = tail;
		tail = temp;
	}

	public void removeAllOccurrencesOf(int key) { //complete this method
		if (size == 0) {
			System.out.println("Error, empty list!");
			return;
		}

		while (head != null && head.value == key) {
			head = head.next;
			size--;
		}
		ListNode current = head;
		while (current != null) {
			while (current.next != null && current.next.value == key) {
				current.next = current.next.next;
				size--;
			}
			current = current.next;
		}
		if (head == null) {
			tail = null;
		}
	}

	public boolean isEqualTo(LinkedList arg) { //complete this method
		if (size != arg.size) {
			return false;
		}
		ListNode current = head;
		ListNode currentArg = arg.head;
		while (current != null) {
			if (current.value != currentArg.value) {
				return false;
			}
			current = current.next;
			currentArg = currentArg.next;
		}

		return true;
	}

	public ListNode insertAtFront(int value) {
		ListNode newNode = new ListNode(value);
		if (size == 0) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
		size++;
		return newNode;
	}

	public ListNode insertAtEnd(int value) {
		ListNode newNode = new ListNode(value);
		if (size == 0) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
		return newNode;
	}

	public void deleteHead() {
		if (0 == size) {
			System.out.println("Cannot delete from an empty list");
		} else if (1 == size) {
			head = tail = null;
			size--;
		} else {
			size--;
			ListNode tmp = head;
			head = head.next;
			tmp.next = null;
			tmp = null;
		}
	}

	public ListNode getNodeAt(int pos) {
		if (pos < 0 || pos >= size || 0 == size) {
			System.out.println("No such position exists");
			return null;
		} else {
			ListNode tmp = head;
			for (int i = 0; i < pos; i++)
				tmp = tmp.next;
			return tmp;
		}
	}

	public void printList() {
		if (size == 0)
			System.out.println("[]");
		else {
			ListNode tmp = head;
			String output = "[";
			for (int i = 0; i < size - 1; i++) {
				output += tmp.value + " -> ";
				tmp = tmp.next;
			}
			output += tail.value + "]";
			System.out.println(output);
		}
	}

	public int getSize() {
		return size;
	}
}
