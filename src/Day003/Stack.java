package Day003;

public class Stack {

	int[] stack=new int[5];
	int top=0;
	public void push(int data)
	{
		stack[top]=data;
		top++;
	}
	public int pop()
	{
		int data;
		top--;
		data=stack[top];
		stack[top]=0;
		return data;
	}
	
	
	public void show()
	{
		for(int element:stack)
		{
			System.out.print(element+ " ");
		}
	}

}
