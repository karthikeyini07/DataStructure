package dsclasses;

import java.util.Scanner;

class Node
{
	int data;
	Node next;
	Node(int d,Node n)
	{
		data=d;
		next=n;
	}
}
public class linkedlist {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		// TODO Auto-generated method stub
		Node head=new Node(0, null),h=head;
		
		while(true)
		{
			int data=obj.nextInt();
			if(data==-1)
			{
				break;
			}
			Node n=new Node(data, null);
			head.next=n;
			head=head.next;
		}
		head=h.next;
		h=h.next;
	   while(h!=null)
	   {
		   System.out.print(h.data+" ");
		   h=h.next;
	   }
	}

}
