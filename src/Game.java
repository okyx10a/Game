import java.util.*;

public class Game 
{
	private Random rng;
	private static final Game game = new Game();
	private static Scanner in = new Scanner (System.in);
	
	// aggregation- Random and Scanner
	
	private Game()
	{
		this.rng = new Random();
		System.out.println(" Welcome to Random Guesser :D ");
	}
	
	public static Game getInstance()
	{
		return Game.game;
	}
	
	public void play()// turn this class into model
	{
		System.out.println(" Please enter your guess <0-10> ");
		int correctNumber = (this.rng).nextInt(11);
		int guess = (Game.in).nextInt();
		System.out.println(guess+" "+correctNumber);
		if(correctNumber == guess)
			System.out.println( " You win :)  ");
		else
			System.out.printf( " You loose :(  ");
	} 
	
	public static void main (String [] args) throws java.lang.Exception
	{
		Game g = Game.getInstance();
		g.play();
		
	}

}