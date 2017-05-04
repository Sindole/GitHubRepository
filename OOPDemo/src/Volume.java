import java.util.Scanner;

public class Volume {

	public int r,h;
	
	public void cylinder()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter the radius (r) of the cylinder");
		r=s.nextInt();
		System.out.println("Please Enter the hight (h) of the cylinder");
		h=s.nextInt();
		double volume=3.141*r*r*h;
		System.out.println("Volume of the cylinder is " +volume);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Volume v=new Volume();
v.cylinder();
	}

}
