/*
Q15. Write a program to check the balance of brackets in the given string?

examples

(hello)		===> balanced
{(hello)	===> not balanced
{(hello)}	===> balanced
{(hello})	===> not balanced
{(hello))	===> not balanced
{(hel(lo))}	===> balanced
[{(hel(lo))]}	===> not balanced
[{(hel(lo))}]	===>  balanced
[{(he<l(lo)>)}]	===>  balanced
{[{(he<l(lo)>)}test[java]]	===>  balanced


*/
import java.util.Scanner;

class Q15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.next();
		String open = "({[<";
		String close = ")}]>";
		String stack = "";
		char current, lastFromStack;
		for(int i = 0; i < s1.length(); i++)
		{
			current = s1.charAt(i);
			if(open.indexOf(current) != -1)
			{
				stack = stack + current;
			}
			else if(close.indexOf(current) != -1)
			{
				lastFromStack = stack.charAt(stack.length() - 1);
				if( (current == ')' && lastFromStack == '(') ||
					(current == '}' && lastFromStack == '{') ||
					(current == ']' && lastFromStack == '[') ||
					(current == '>' && lastFromStack == '<'))
				{
					stack = stack.substring(0, stack.length() - 1);
				}
				else
				{
					break;
				}
			}
		}
		System.out.println(stack.length() == 0 ? "balanced" : "not balanced");

	}
}











