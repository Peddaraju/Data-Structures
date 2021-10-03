class A
{
	int data;
	A ref;
	A(int data)
	{
		this.data = data;
	}
}
class M5
{
	public static void main(String[] args) 
	{
		A a1 = new A(10);
		a1.ref = new A(5);
		a1.ref.ref = new A(50);
		a1.ref.ref.ref = new A(20);
		a1.ref.ref.ref.ref = new A(210);
		a1.ref.ref.ref.ref.ref = new A(120);
		a1.ref.ref.ref.ref.ref.ref = new A(201);
		a1.ref.ref.ref.ref.ref.ref.ref = new A(201);
		A element = a1;
		while(element != null)
		{
			System.out.print(element.data + ", ");
			element = element.ref;
		}
	}
}



