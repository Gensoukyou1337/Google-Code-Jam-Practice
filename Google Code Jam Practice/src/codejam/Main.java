package codejam;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = null;
		PrintWriter output = null;
		int testCaseNum;
		int C, N;
		String[] numStrArray;
		int[] intStrArray;
		
		try
		{
			input = new BufferedReader(new FileReader("Ainputlarge.txt"));
			output = new PrintWriter(new FileWriter("Aoutputlarge.txt"));
			testCaseNum = Integer.parseInt(input.readLine());
			for(int a = 0; a < testCaseNum; a++)
			{
				C = Integer.parseInt(input.readLine());
				N = Integer.parseInt(input.readLine());
				intStrArray = new int[N];
				numStrArray = input.readLine().split(" ");
				for(int i = 0; i < N; i++)
				{
					intStrArray[i] = Integer.parseInt(numStrArray[i]);
				}
				for(int j = 0; j < N-1; j++)
				{
					for(int k = j+1; k < N; k++)
					{
						if(intStrArray[j] + intStrArray[k] == C)
						{
							if(intStrArray[j] < intStrArray[k])
							{output.println("Case #" + (a+1) + ": " + intStrArray[j] + " + " + intStrArray[k] + " = " + C);}
							else
							{output.println("Case #" + (a+1) + ": " + intStrArray[k] + " + " + intStrArray[j] + " = " + C);}
						}
					}
				}
			}
		}
		finally
		{
			if(input != null)
			{
				input.close();
			}
			if(output != null)
			{
				output.close();
			}
		}
	}

}
