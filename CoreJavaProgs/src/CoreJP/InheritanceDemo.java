package CoreJP;

class Parent
{
	public Parent()
	{
		System.out.println("Parent");
	}
	public void show()
	{
		System.out.println("Display details of the parent");
	}
}
public class InheritanceDemo extends Parent {

	public InheritanceDemo ()
	{
		System.out.println("Child");
		System.out.println("Child2");
	}
public void shows()
{
	System.out.println("Dispaly details of the child");
	super.show();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InheritanceDemo ID=new InheritanceDemo();
ID.shows();
	}

}
