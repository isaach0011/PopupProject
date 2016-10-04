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
	
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void setValue(Double value)
	{
		this.value = value;
	}
	
	public void setWords(String word)
	{
		this.words = word;
	}
	
	public void setIsValue(boolean isValid)
	{
		this.isValid = isValid;
	}
}
