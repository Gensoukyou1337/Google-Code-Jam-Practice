package codejamenergy;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = null;
		PrintWriter output = null;
		int testCaseNum;
		
		try
		{
			input = new BufferedReader(new FileReader("energy-small-practice.in"));
			output = new PrintWriter(new FileWriter("energy-small-practice-output.txt"));
			testCaseNum = Integer.parseInt(input.readLine());
			String[] toParseOne = input.readLine().trim().split(" ");
			int maxEnergy = Integer.parseInt(toParseOne[0]);
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
