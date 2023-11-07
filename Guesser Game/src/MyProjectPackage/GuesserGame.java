package MyProjectPackage;

import java.util.Scanner;

class Guesser
{
	int Guessernum;
	
	public int takeNumberGuesser()
	{
		System.out.println("Guesser guess a Number");
		Scanner Scan = new Scanner(System.in);
		Guessernum = Scan.nextInt();		
		return Guessernum;
	}
}

class Player
{
int playernum;
	
	public int takeNumberPlayer()
	{
		System.out.println("Player guess a Number");
		Scanner Scan = new Scanner(System.in);
		playernum = Scan.nextInt();		
		return playernum;
	}
}

class Umpire
{
	int numfromGuesser;
	int numfromPlayer1;
	int numfromPlayer2;
	int numfromPlayer3;
	
	void CollectfromGuesser()
	{
		Guesser g = new Guesser();
		numfromGuesser = g.takeNumberGuesser();
	}
	
	void CollectfromPlayer()
	{
		Player P1 = new Player();
		numfromPlayer1 = P1.takeNumberPlayer();
		
		Player P2 = new Player();
		numfromPlayer2 = P2.takeNumberPlayer();
		
		Player P3 = new Player();
		numfromPlayer3 = P3.takeNumberPlayer();
	}
	
	void compare()
	{
		if(numfromPlayer1 == numfromGuesser)
		{
			if(numfromPlayer2 == numfromGuesser && numfromPlayer3 == numfromGuesser)
			{
				System.out.println("All player won the game");
			}
			else if(numfromPlayer2 == numfromGuesser)
			{
				System.out.println("Only Player1 and Player2 won the game");
			}
			else if(numfromPlayer3 == numfromGuesser)
			{
				System.out.println("Only Player1 and Player3 won the game");
			}
			else
			{
				System.out.println("Only Player1 won the game");
			}
		}
		else if(numfromPlayer2 == numfromGuesser)
		{
			if(numfromPlayer3 == numfromGuesser)
			{
				System.out.println("Only Player 2 and 3 won the game");
			}
			else
			{
				System.out.println("Only Player2 won the game");
			}
		}
		else if(numfromPlayer3 == numfromGuesser)
		{
			System.out.println("Only Player 3 won the game");
		}
		else
		{
			System.out.println("No Player won the game");
		}
	}
	
}
public class GuesserGame 
{

	public static void main(String[] args) 
	{
		Umpire U = new Umpire();
		U.CollectfromGuesser();
		U.CollectfromPlayer();
		U.compare();

	}

}

/*Ouput:
		Guesser guess a Number
		4
		Player guess a Number
		4
		Player guess a Number
		2
		Player guess a Number
		3
		Only Player1 won the game
 
*/

/*Ouput:
		Guesser guess a Number
		2
		Player guess a Number
		1
		Player guess a Number
		2
		Player guess a Number
		3
		Only Player2 won the game
		 
 */

/*Ouput:
		Guesser guess a Number
		6
		Player guess a Number
		1
		Player guess a Number
		2
		Player guess a Number
		6
		Only Player3 won the game
 
*/

/*Output:
		Guesser guess a Number
		5
		Player guess a Number
		1
		Player guess a Number
		6
		Player guess a Number
		8
		No Player won the game
*/
/*Output:
		Guesser guess a Number
		8
		Player guess a Number
		8
		Player guess a Number
		8
		Player guess a Number
		8
		All player won the game

*/

