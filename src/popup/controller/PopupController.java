package popup.controller;

import popups.view.PopupViewer;
import popups.model.Thingy;
import java.util.List;
import java.util.ArrayList;

public class PopupController
{
	private PopupViewer display;
	private List<Thingy> thingyList;
	
	public PopupController()
	{
		display = new PopupViewer();
		thingyList = new ArrayList<Thingy>();
	}
	
	public void start()
	{
		learnLists();
	}
	
	private void askQuestionLoop()
	{
		String answer = "sample";
		
		while(answer != null && !isDouble(answer))
		{	
			answer = display.collectResponse("You need to type in a double!");
		}
	}
	/**
	 * Checks a supplied String value to see if it can be converted to a double.
	 * @param potentialValue The supplied String.
	 * @return Whether the conversion to a double is possible as a boolean value.
	 */
	
	private boolean isDouble(String potentialValue)
	{
		boolean validDouble = false;
		
		try
		{
			double testValue = Double.parseDouble(potentialValue);
			validDouble = true;
		}
		
		catch(NumberFormatException notDoubleError)
		{
			display.displayMessage("That was not a double. >:(");
		}
		
		return validDouble;
	}
	
	/**
	 * Checks the supplied String value to see if it can be converted to an integer.
	 * If it cannot a popup message is displayed.
	 * @param potentialValue The supplied String.
	 * @return Whether a conversion to an integer is possible.
	 */
	
	private boolean isInteger(String potentialValue)
	{
		boolean validInteger = false;
		
		try
		{
			int testValue = Integer.parseInt(potentialValue);
			validInteger = true;
		}
		catch (NumberFormatException notIntegerError)
		{
			display.displayMessage(notIntegerError.getMessage());
			display.displayMessage("You need type in an int.");
		}
		return validInteger;
	}
	
	private void learnLists()
	{
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy firstThingy = new Thingy();
		thingyList.add(firstThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy secondThingy = new Thingy();
		thingyList.add(secondThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size()); 
		Thingy thirdThingy = new Thingy();
		thingyList.add(thirdThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		Thingy forthThingy = new Thingy();
		thingyList.add(forthThingy);
		display.displayMessage("This is the size of the list: " + thingyList.size());
		
		for (int index = 0; index < 5; index++)
		{
			Thingy loopThingy = new Thingy();
			thingyList.add(loopThingy);
		}
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("The thingy at this spot has words of: " + thingyList.get(index).getWords());
		}
		
		Thingy specialThingy = new Thingy();
		specialThingy.setWords("not null stuff");
		
		thingyList.add(1, specialThingy);
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage("The message at " + index + " is " + thingyList.get(index).getWords());
		}
		
		thingyList.get(3).setWords("I just changed what is inside");
		Thingy tempThing = thingyList.get(4);
		tempThing.setWords("also changed");
		
		for (int index = 0; index < thingyList.size(); index++)
		{
			display.displayMessage(thingyList.get(index).getWords());
		}
	}
}
