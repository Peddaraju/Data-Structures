class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
	}
}
class LinkedList
{
	Node first;
	void add(int data)
	{
		if(first == null)
		{
			first = new Node(data);
		}
		else
		{
			Node newNode = new Node(data);
			newNode.next = first;
			first = newNode;
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

}
class M23
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(25);
		list.add(39);
		list.read();		
	}
}






