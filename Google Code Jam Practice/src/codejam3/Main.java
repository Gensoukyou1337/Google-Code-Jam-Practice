package codejam3;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader inThree = null;
		PrintWriter outThree = null;
		int testCaseNum;
		String toConvert;
		
		try
		{
			inThree = new BufferedReader(new FileReader("Cinputsmall.txt"));
			outThree = new PrintWriter(new FileWriter("Coutputsmall.txt"));
			testCaseNum = Integer.parseInt(inThree.readLine());
			System.out.println(testCaseNum);
			for(int a = 0; a < testCaseNum; a++)
			{
				String convertResult = "";
				toConvert = inThree.readLine();
				if(toConvert.length() > 1)
				{
					convertResult += compare(toConvert.charAt(0));
					for(int i = 1; i < toConvert.length(); i++)
					{
						if(toConvert.charAt(i) >= 'a' && toConvert.charAt(i) <= 'c')
						{
							if(toConvert.charAt(i-1) >= 'a' && toConvert.charAt(i-1) <= 'c')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 'd' && toConvert.charAt(i) <= 'f')
						{
							if(toConvert.charAt(i-1) >= 'd' && toConvert.charAt(i-1) <= 'f')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 'g' && toConvert.charAt(i) <= 'i')
						{
							if(toConvert.charAt(i-1) >= 'g' && toConvert.charAt(i-1) <= 'i')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 'j' && toConvert.charAt(i) <= 'l')
						{
							if(toConvert.charAt(i-1) >= 'j' && toConvert.charAt(i-1) <= 'l')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 'm' && toConvert.charAt(i) <= 'o')
						{
							if(toConvert.charAt(i-1) >= 'm' && toConvert.charAt(i-1) <= 'o')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 'p' && toConvert.charAt(i) <= 's')
						{
							if(toConvert.charAt(i-1) >= 'p' && toConvert.charAt(i-1) <= 's')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 't' && toConvert.charAt(i) <= 'v')
						{
							if(toConvert.charAt(i-1) >= 't' && toConvert.charAt(i-1) <= 'v')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) >= 'w' && toConvert.charAt(i) <= 'z')
						{
							if(toConvert.charAt(i-1) >= 'w' && toConvert.charAt(i-1) <= 'z')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
						else if(toConvert.charAt(i) == ' ')
						{
							if(toConvert.charAt(i-1) == ' ')
							{convertResult += (" " + compare(toConvert.charAt(i)));}
							else{convertResult += compare(toConvert.charAt(i));}
						}
					}
				}
				else
				{
					convertResult += compare(toConvert.charAt(0));
				}
				outThree.println("Case #" + (a+1) + ": " + convertResult);
			}
		}
		finally
		{
			if(inThree != null)
			{
				inThree.close();
			}
			if(outThree != null)
			{
				outThree.close();
			}
		}
	}
	
	public static String compare(char alpha)
	{
		String result = "";
		switch(alpha)
		{
			case 'a' : result = "2"; break; //Who the hell said the 'break' statement is optional!?
			case 'b' : result = "22"; break;
			case 'c' : result = "222"; break;
			case 'd' : result = "3"; break;
			case 'e' : result = "33"; break;
			case 'f' : result = "333"; break;
			case 'g' : result = "4"; break;
			case 'h' : result = "44"; break;
			case 'i' : result = "444"; break;
			case 'j' : result = "5"; break;
			case 'k' : result = "55"; break;
			case 'l' : result = "555"; break;
			case 'm' : result = "6"; break;
			case 'n' : result = "66"; break;
			case 'o' : result = "666"; break;
			case 'p' : result = "7"; break;
			case 'q' : result = "77"; break;
			case 'r' : result = "777"; break;
			case 's' : result = "7777"; break;
			case 't' : result = "8"; break;
			case 'u' : result = "88"; break;
			case 'v' : result = "888"; break;
			case 'w' : result = "9"; break;
			case 'x' : result = "99"; break;
			case 'y' : result = "999"; break;
			case 'z' : result = "9999"; break;
			case ' ' : result = "0"; break;
			default: break;
		}
		return result;
	}
}
