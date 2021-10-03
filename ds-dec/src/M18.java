class Node
{
	int data;
	Node ref;

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
			last.ref = new Node(data);
			last = last.ref;
		}
		last.ref = first;
	}
	void read()
	{
		Node element = first;
		if(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		
		while(element != null && (element != first))
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
	void replaceFromToTo(int from, int to)
	{
		Node element = first;
		if(element != null)
		{
			if(element.data == from)
			{
				element.data = to;
				return;
			}
			element = element.ref;
		}
		while (element != null && (element != first))
		{
			if(element.data == from)
			{
				element.data = to;
				break;
			}
			element = element.ref;
		}
	}
}
class M18
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		list.add(30);
		list.add(15);
		list.add(45);
		list.read();
		list.replaceFromToTo(25, 100);
		list.read();
	}
}






