package LogicalProgram;

public class whiteSpaceRemoving {
	public static void main(String[] args) {
		String abc="a b  c   d biuhnkjg kihyufbf     yfgio87 ";
		int count=0;
		
		System.out.println(abc);
		String abcd = abc.replace(" ", "");
		System.out.println(abcd);
		
		for (int i = 0; i <= abc.length() - 1; i++)
		{ // 3
		char s1 = abc.charAt(i); // ' '
		// ' ' == ' '
		if (s1 == ' ') // 
		{
		count++; //2
		}
		}
		System.out.println("no of spaces in given string: " + count);
	}

}
