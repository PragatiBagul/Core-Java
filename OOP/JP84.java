import java.io.*;
class JP84
{
	int a,b;
	public JP84(int a,int b)	
	{
		this.a=a;
		this.b=b;
	}
	protected void finalize()
	{
		System.out.println(" Object destructed");
	}
	public void display()
	{
		System.out.println(" Object Created Successfully");
		System.out.println(" Elements are : a = "+a+" b = "+b);
	}
	public static void justExecute()
	{
		System.out.println(" Entering method : justExecute");
		JP84 object=new JP84(10,20);
		object.display();
		System.gc();
		System.out.println(" Exiting method : justExecute");
	}
	public static void main(String[] args) {
		
		JP84 object=new JP84(45,35);
		object.display();
		object=null;
		System.gc();
		JP84.justExecute(); // The object is garbage collected only if its scope ends or it is assigned null.
		System.gc();
	}
}
