class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
}
class Stack
{
	Node first, last;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node(data);
			last = first;
		}
		else
		{
			last.next = new Node(data);
			last = last.next;
		}
	}
	void read()
	{

		Node element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}
	int readLast()
	{
		return last.data;
	}
	void removeLast()
	{
		if(first == null)
		{
			return;
		}
		Node element = first;
		if(element.next == null)
		{
			first = last = null;
			return;
		}
		while(element.next != last)
		{
			element = element.next;
		}
		element.next = null;
		last = element;
	}
}
class M24
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		stack.add(10);
		stack.add(20);
		stack.add(40);
		stack.add(25);
		stack.add(39);
		stack.read();		
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
		stack.removeLast();
		stack.read();
	}
}






