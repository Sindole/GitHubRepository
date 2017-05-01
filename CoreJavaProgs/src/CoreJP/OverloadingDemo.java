package CoreJP;

public class OverloadingDemo {//Overloading means having multiple methods with same name but different signature. Signature includes number of parameters, sequence of parameters and data types of parameters
public void show()
{
	System.out.println("Method with Zero parameters");
}
public void show(int i)
{
	System.out.println("Metho with parameters "+i);
}
public void show(int i, String str)
{
	System.out.println("Metho with 2 parameters");
}
public void show(String str, int i)
{
	System.out.println("Metho with 2 parameters in other sequence");
}

//Constructor Overloading
public OverloadingDemo()
{
	System.out.println("Constroctor overloading");
}
public OverloadingDemo(int i)
{
	System.out.println("Constroctor overloading with integer "+i);
}
public OverloadingDemo(String str)
{
	System.out.println("Constroctor overloading with string");
}
public static void main(String args[])
{
	OverloadingDemo OL=new OverloadingDemo(21);
OL.show("abcd", 7);
OL.show(10);
OL.show(99, "Sai");
OverloadingDemo ODD=new OverloadingDemo("Sai");
OverloadingDemo ODL=new OverloadingDemo(43);
}
}