package codejamencrypt;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = null;
		PrintWriter output = null;
		int testCaseNum;
		
		try
		{
			input = new BufferedReader(new FileReader("encrypt-small-practice.in"));
			output = new PrintWriter(new FileWriter("encrypt-small-practice-output.txt"));
			testCaseNum = Integer.parseInt(input.readLine());
			System.out.println(testCaseNum);
			for(int a = 0; a < testCaseNum; a++)
			{
				String toTranslate = input.readLine().trim();
				String translateResult = "";
				for(int i = 0; i < toTranslate.length(); i++)
				{
					translateResult += translate(toTranslate.charAt(i)); // ADD STRINGS TO STRINGS, NOT CHARS TO STRINGS!
				}
				System.out.println(translateResult);
				output.println("Case #" + (a+1) + ": " + translateResult);
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
	
	public static String translate(char alpha)
	{
		String result = " ";
		switch(alpha)
		{
			case 'y' : result = "a"; break; //Who the hell said the 'break' statement is optional!?
			case 'n' : result = "b"; break;
			case 'f' : result = "c"; break;
			case 'i' : result = "d"; break;
			case 'c' : result = "e"; break;
			case 'w' : result = "f"; break;
			case 'l' : result = "g"; break;
			case 'b' : result = "h"; break;
			case 'k' : result = "i"; break;
			case 'u' : result = "j"; break;
			case 'o' : result = "k"; break;
			case 'm' : result = "l"; break;
			case 'x' : result = "m"; break;
			case 's' : result = "n"; break;
			case 'e' : result = "o"; break;
			case 'v' : result = "p"; break;
			case 'z' : result = "q"; break;
			case 'p' : result = "r"; break;
			case 'd' : result = "s"; break;
			case 'r' : result = "t"; break;
			case 'j' : result = "u"; break;
			case 'g' : result = "v"; break;
			case 't' : result = "w"; break;
			case 'h' : result = "x"; break;
			case 'a' : result = "y"; break;
			case 'q' : result = "z"; break;
			case ' ' : result = " "; break;
			default: break;
		}
		return result;
	}

}
