package popups.model;

public class Thingy
{
	private int numberThing;
	private double valueThing;
	private String wordThing;
	private boolean isValidThing;
	//Declarations--------------------------------
	public Thingy()
	{
		this.numberThing = 666;
		this.valueThing = 12345;
		this.wordThing = "I am a string.";
	}
	//Getters-------------------------------------
	
	public int getNumberthing()
	{
		return numberThing;
	}
	
	public double getValuething()
	{
		return valueThing;
	}
	
	public String getWordthing()
	{
		return wordThing;
	}
	
	public boolean getIsValidThing()
	{
		return isValidThing;
	}
	
	//Setters---------------------------------------
	
	public void setNumberThing(int numberThing)
	{
		this.numberThing = numberThing;
	}
	
	public void setValueThing(Double valueThing)
	{
		this.valueThing = valueThing;
	}
	
	public void setWordThing(String wordThing)
	{
		this.wordThing = wordThing;
	}
	
	public void setIsValueThing(boolean isValidThing)
	{
		this.isValidThing = isValidThing;
	}
}
