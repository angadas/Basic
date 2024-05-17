package LogicalProgram;

public class reversenumber {
	public static void main(String[] args) {
//		int orgNum=1234;
//		String org=Integer.toString(orgNum);
//		String rev="";
//		for(int i=org.length()-1;i>=0;i--)
//		{
//			rev=rev+org.charAt(i);
//		}
//		int revNum=Integer.parseInt(rev);
//		System.out.println(revNum);
//		
		int Num=1234;
		int revNum=0;
		
		for(int i=Num;i>0;i=i/10)
		{
			int rem=i%10;
			revNum=revNum*10+rem;
		}
		System.out.println(revNum);
		
	}

}
