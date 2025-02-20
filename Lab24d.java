//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		int x= file.nextInt();
		
		for(int i=0; i<=x; i++)
		{
			TicTacToe game = new TicTacToe(file.nextLine());
		}

		file.close();
		

	

	//read how many times you should read
	//next line
	//file.nextLine()
	//read number and then have the scanner read thar mamy times after a next line
	//place into a 3x3 2d array with row makor order loop
	//increase value of variable your tracking position to pull
	//Make a TikTacToe object for each game
	//Print the game()
	//Print the winner





	}
}



