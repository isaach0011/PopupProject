package popups.model;

public class Thingy
{
	private int number;
	private double value;
	private String words;
	private boolean isValid;
	//Getters-------------------------------------
	
	public int getNumber()
	{
		return number;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public String getWords()
	{
		return words;
	}
	
	public boolean getIsValid()
	{
		return isValid;
	}
	
	//Setters---------------------------------------
	
	public void setNumber(int numberThing)
	{
		this.number = numberThing;
	}
	
	public void setValue(Double valueThing)
	{
		this.value = valueThing;
	}
	
	public void setWords(String wordThing)
	{
		this.words = wordThing;
	}
	
	public void setIsValue(boolean isValidThing)
	{
		this.isValid = isValidThing;
	}
}
