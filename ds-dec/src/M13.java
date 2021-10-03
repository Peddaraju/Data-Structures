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
	}
	void read()
	{
		Node element = first;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
		System.out.println();
	}
	int size()
	{
		int size = 0;
		Node element = first;
		while(element != null)
		{
			size ++;
			element = element.ref;
		}
		return size;
	}
	boolean contains(int valueToSearch)
	{
		boolean status = false;
		Node element = first;
		while(element != null)
		{
			if(element.data == valueToSearch)
			{
				status = true;
				break;
			}
			element = element.ref;
		}
		return status;
	}
	int indexOf(int valueToSearch)
	{
		int index = -1;
		Node element = first;
		boolean flag = false;
		while(element != null)
		{
			index ++;
			if(element.data == valueToSearch)
			{
				flag = true;
				break;
			}
			element = element.ref;
		}
		return flag ? index : -1;
	}
}
class M13
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(35);
		System.out.println(list.indexOf(40));
		System.out.println(list.indexOf(140));
	}
}






