public class Pyramid {
	
public int i,j;

public void pyramids()
{
	for(i=5;i>0;i--)
	{
		for(j=0;j<i;j++)
		{
			System.out.print(j+1);
		}
		System.out.println("");
	}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Pyramid p=new Pyramid();
	p.pyramids();
	}

}
