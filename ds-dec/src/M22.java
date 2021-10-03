class Node
{
	int data;
	Node next;
	Node prev;
	Node(int data)
	{
		this.data = data;
	}
}
class LinkedList
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
			last.next.prev = last;
			last = last.next;
		}
		last.next = first; // circular in clock wise
		first.prev = last; // circular in anti clock wise
		
	}
	void read()
	{
		Node element = first;
		if(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}		
		while(element != null && element != first)
		{
			System.out.print(element.data + ", ");
			element = element.next;
		}
		System.out.println();
	}

	void readInReverse()
	{
		Node element = last;
		if(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
		while(element != null && element != last)
		{
			System.out.print(element.data + ", ");
			element = element.prev;
		}
		System.out.println();
	}
}
class M22
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		//list.read();
		list.readInReverse();
	}
}






