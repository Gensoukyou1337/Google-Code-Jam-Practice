package codejammagic;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = null;
		PrintWriter output = null;
		int testCaseNum;
		int rowToCompare, rowToCheck;
		int[][] arrayToCompare;
		int[][] arrayToCheck;
		
		try
		{
			input = new BufferedReader(new FileReader("magic-small-practice.in"));
			output = new PrintWriter(new FileWriter("magic-small-practice-output.txt"));
			testCaseNum = Integer.parseInt(input.readLine());
			for(int a = 0; a < testCaseNum; a++)
			{
				rowToCompare = Integer.parseInt(input.readLine());
				arrayToCompare = new int[4][4];
				//Acquire array to compare
				for(int row = 0; row < 4; row++)
				{
					String[] toParse = input.readLine().split(" ");
					for(int col = 0; col < 4; col++)
					{
						arrayToCompare[row][col] = Integer.parseInt(toParse[col]);
					}
				}
				rowToCheck = Integer.parseInt(input.readLine());
				//Acquire array to check
				arrayToCheck = new int[4][4];
				for(int row = 0; row < 4; row++)
				{
					String[] toParse = input.readLine().split(" ");
					for(int col = 0; col < 4; col++)
					{
						arrayToCheck[row][col] = Integer.parseInt(toParse[col]);
					}
				}
				int matchCounter = 0;
				int matchingNum = 0;
				//Check elements of specific row of arrayToCheck
				for(int chkInd = 0; chkInd < 4; chkInd++)
				{
					for(int comInd = 0; comInd < 4; comInd++)
					{
						if(arrayToCheck[rowToCheck-1][chkInd] == arrayToCompare[rowToCompare-1][comInd])
						{
							matchCounter++;
							matchingNum = arrayToCheck[rowToCheck-1][chkInd];
						}
					}
				}
				if(matchCounter > 1)
				{
					System.out.println("more than one match found");
					output.println("Case #" + (a+1) + ": Bad Magician!");
				}
				else if(matchCounter < 1)
				{
					System.out.println("no matches found");
					output.println("Case #" + (a+1) + ": Volunteer Cheated!");
				}
				else
				{
					System.out.println(matchingNum);
					output.println("Case #" + (a+1) + ": " + matchingNum);
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
