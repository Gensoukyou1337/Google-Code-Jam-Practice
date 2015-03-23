package codejamcookie;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = null;
		PrintWriter output = null;
		int testCaseNum;
		double cookieRate;
		double farmCost, rateAdd, limit;
		int farmCounter;
		
		try
		{
			input = new BufferedReader(new FileReader("cookie-large-practice.in"));
			output = new PrintWriter(new FileWriter("cookie-large-practice-output.txt"));
			testCaseNum = Integer.parseInt(input.readLine());
			for(int a = 0; a < testCaseNum; a++)
			{
				String[] toParse = input.readLine().trim().split(" ");
				farmCost = Double.parseDouble(toParse[0]);
				rateAdd = Double.parseDouble(toParse[1]);
				limit = Double.parseDouble(toParse[2]);
				farmCounter = 0;
				cookieRate = 2;
				double prevTime = limit / cookieRate;
				double farmTime = 0;
				double nextTime = 0;
				//for determining test times
				while (true)
				{
					farmCounter++;
					farmTime += farmCost/cookieRate;
					cookieRate += rateAdd;
					nextTime = farmTime + limit/cookieRate;
					if(nextTime < prevTime)
					{
						prevTime = nextTime;
					}
					else
					{
						System.out.println(prevTime + " " + farmCounter);
						output.println("Case #" + (a+1) + ": " + prevTime);
						break;
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
