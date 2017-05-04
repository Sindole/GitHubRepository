
public class PrePostfix {
	
	int num1, num2;
	
	public void prefix()
	{
		num1=5;
		System.out.println("Prefix Operation");
		System.out.println("Numbers before the operation are " +num1 + " and "+num2);
		num2=++num1;
		System.out.println("Numbers after the operation are " +num1 + " and "+num2);
	}
	public void postfix()
	{
		num1=5;
		num2=0;
		System.out.println("Postfix Operation");
		System.out.println("Numbers before the operation are " +num1 + " and "+num2);
		num2=num1++;
		System.out.println("Numbers after the operation are " +num1 + " and "+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
PrePostfix ppf=new PrePostfix();
ppf.prefix();
ppf.postfix();
	}

}
