import java.io.*;

class TriangleApp
	{
		static int theNumber;
							   			   		 			
   			public static int triangle(int n)
   			{
   				if(n == 1)
   					return 1;
   				else
   					return(n + triangle(n-1));
   			}


   			public static String getString() throws IOException
   			{
   				InputStreamReader isr = new InputStreamReader(System.in);
   				BufferedReader br = new BufferedReader(isr);
   				String s = br.readLine();
   				return s;
   			}
   			public static int getInt() throws IOException
   			{
   				String s = getString();
   				return Integer.parseInt(s);
   			}
			}
