//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] board;

	public TicTacToe()
	{
		char[][] board = new char[3][3];
	}

	public TicTacToe(String game)
	{
		int pos = 0;
		//here is were the row major order loop happens
		for(int col =0; col< board.length; col++)
		{
			for(int row = 0; row < board[col].length; row++)
			{
				board[col][row] = game.charAt(pos);
				pos++;
			}
		}

		
			



	}

	public String getWinner()
	{	//if the a=b and b=c then c=a
		//only care if they are the same letter
		//1st 2nd 3rd row. 1st 2nd 3rd column, 1st 2nd diagonal, e;se tie
		
		boolean win = false;

		//ROWS

		if(board[0][0]==board[0][1] && board[0][1]==board[0][2])
			win=true;

		if(board[1][0]==board[1][1] && board[1][1]==board[1][2])
			win=true;

		if(board[2][0]==board[2][1] && board[2][1]==board[2][2])
			win=true;

		//COLUMNS

		if(board[0][0]==board[1][0] && board[1][0]==board[2][0])
			win=true;

		if(board[0][1]==board[1][1] && board[1][1]==board[2][1])
			win=true;

		if(board[0][2]==board[1][2] && board[1][2]==board[2][2])
			win=true;

		//DIOGONAL
		
		if(board[0][0]==board[1][1] && board[1][1]==board[2][2])
			win=true;

		if(board[0][2]==board[1][1] &&board[1][1]==board[2][0])
			win=true;
		
		//TIE
		
		else
		win = false;

		return "";
	}

	public String toString()
	{
		String output="";
	//also use row major order here
	//add on character until row is complpete add a backslash n 
	//then do it again
	int pos = 0;
	//here is were the row major order loop happens
	for(int col =0; col< board.length; col++)
	{
		for(int row = 0; row < board[col].length; row++)
		{
			board[col][row] = game.charAt(pos);
			output = board[col][row];
			pos++;
		}
	}
		return output+"\n\n";
	}
}