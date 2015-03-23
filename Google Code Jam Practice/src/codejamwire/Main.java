package codejamwire;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = null;
		PrintWriter output = null;
		int testCaseNum;
		
		try
		{
			input = new BufferedReader(new FileReader("wire-large-practice.in"));
			output = new PrintWriter(new FileWriter("wire-large-practice-output.txt"));
			testCaseNum = Integer.parseInt(input.readLine());
			for(int a = 0; a < testCaseNum; a++)
			{
				int wireNum = Integer.parseInt(input.readLine());
				int connections = 0;
				int[] sourceList = new int[wireNum];
				int[] sinkList = new int[wireNum];
				if(wireNum > 1)
				{
					for(int i = 0; i < wireNum; i++)
					{
						String[] toParse = input.readLine().split(" ");
						sourceList[i] = Integer.parseInt(toParse[0]);
						sinkList[i] = Integer.parseInt(toParse[1]);
					}
					for(int j = 1; j < wireNum; j++)
					{
						if((sourceList[j] - sourceList[j-1])*(sinkList[j] - sinkList[j-1]) < 0)
						{
							connections++;
						}
					}
				}
				else
				{
					String ignore = input.readLine();
					connections = 0;
				}
				System.out.println("Case #" + (a+1) + ": " + connections);
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
