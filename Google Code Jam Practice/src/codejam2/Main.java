package codejam2;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader inTwo = null;
		PrintWriter outTwo = null;
		int testCaseNum;
		String[] splitString;
		String[] resultStringArray;
		
		try
		{
			inTwo = new BufferedReader(new FileReader("Binputlarge.txt"));
			outTwo = new PrintWriter(new FileWriter("Boutputlarge.txt"));
			testCaseNum = Integer.parseInt(inTwo.readLine());
			System.out.println(testCaseNum);
			for(int a = 0; a < testCaseNum; a++)
			{
				splitString = (inTwo.readLine().trim()).split(" ");
				int N = splitString.length;
				resultStringArray = new String[N];
				for(int i = 0; i < N; i++)
				{
					resultStringArray[N-1-i] = splitString[i];
				}
				outTwo.print("Case #" + (a+1) + ": ");
				for(int j = 0; j < resultStringArray.length; j++)
				{
					outTwo.print(resultStringArray[j] + " ");
				}
				outTwo.println();
			}
		}
		finally
		{
			if(inTwo != null)
			{
				inTwo.close();
			}
			if(outTwo != null)
			{
				outTwo.close();
			}
		}
	}
}
