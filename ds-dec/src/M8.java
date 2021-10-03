class A
{
	int data;
	A ref;
	A(int data)
	{
		this.data = data;
	}
	void add(int data)
	{
		A element = this;
		while(element.ref != null)
		{
			element = element.ref;
		}
		element.ref = new A(data);
	}
	void read()
	{
		A element = this;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}
class M8
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.add(10);
		a1.add(20);
		a1.add(40);
		a1.add(35);
		a1.read();
	}
}






