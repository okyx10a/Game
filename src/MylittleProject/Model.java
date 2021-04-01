package MylittleProject;


import java.util.Random;

public class Model {
	private Random rng;
	private static final Model game = new Model();
	public int correctNumber;
	
	// aggregation- Random and Scanner
	
	private Model()
	{
		this.rng = new Random();
	}
	
	public static Model getInstance()
	{
		return Model.game;
	}
	
	public String play(String num)// turn this class into model
	{
	
		correctNumber = (this.rng).nextInt(11);
		try{
			int guess = Integer.parseInt(num);
			if((guess>=0)&&(guess<=10)){
		        if(correctNumber == guess){
			        return "true";
		        }
		        else{
			        return "false";
		        }
		    }else
		    	return "error";
		}catch(NumberFormatException e){
			return "error";
		}
	} 

}
