package Day003;

public class MainClass {
	public static void main(String[] args) {
		Stack obj=new Stack();
		obj.push(12);
		obj.push(15);
		obj.push(13);
		obj.push(10);
		obj.push(5);
		
	System.out.println("Elements in the stack:");
	obj.show();
	
	System.out.println("\nPopped element:"+obj.pop());
	
	System.out.println("New array of elements in the stack:");
	obj.show();
	
	}

}
