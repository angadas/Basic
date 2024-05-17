package LogicalProgram;

public class exmpl_Armstrongnumber {
	public static void main(String[] args) {
		int orgnum=122;
		int sum=0;
		for(int i=orgnum;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(orgnum==sum)
		{
			System.out.println("given number" +orgnum+ "is an Armstrong number");
		} 
		else
		{
			System.out.println("given number\" +orgnum+ \"is an not Armstrong number");
		}
		

	}

}
