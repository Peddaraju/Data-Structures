class A
{
	int data;
	A ref;
	A last;
	A(int data)
	{
		this.data = data;
	}
	void add(int data)
	{
		if(ref == null)
		{
			ref = new A(data);
			last = ref;
		}
		else
		{
			last.ref = new A(data);
			last = last.ref;
		}
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
class M9
{
	public static void main(String[] args) 
	{
		A a1 = new A(90);
		a1.add(10);
		a1.add(20);
		a1.add(40);
		a1.add(35);
		a1.add(60);
		a1.read();
	}
}






