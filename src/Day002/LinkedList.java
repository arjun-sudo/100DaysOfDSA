package Day002;

public class LinkedList {
	Node head;
	//let's make method 
	public void insert(int data)
	{
		Node node=new Node();		//this will create new node since obj. act as new nod in java 
		node.data=data;	//just inserted data will be passed here 
		node.next=null;	//initially
		if(head==null)
		{
			head=node;
		}
		else 
		{
			Node n=head;
			while(n.next!=null)
			{
				n=n.next;	
			}
			n.next=node;		//added node at last 
			
		}
	}
		//now for displaying 
		public void show()
		{
			Node node=head;
			while(node.next!=null)
			{
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
			
			
		}
		

}
