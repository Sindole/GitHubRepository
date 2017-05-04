
public class Population {

	public double imen,tmen;
	
	public void illiteratemen()
	{
	tmen=0.52*80000;
	imen=0.65*tmen;
	System.out.println("Illiterate Men of the total population are "+imen);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Population pop=new Population();
pop.illiteratemen();
	}

}
