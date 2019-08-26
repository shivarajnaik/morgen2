package testassignment;

public class SlengthOfStringWithoutUsingLengthM {

	public static void main(String[] args) {
		String s1="karnataka";
		char[] ch = s1.toCharArray();
		int i=0;
		try
		{
			for (; ;i++)
			{
				char c=ch[i];
				
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			
		}
		System.out.println("The length of String is : "+i);
	}

}
