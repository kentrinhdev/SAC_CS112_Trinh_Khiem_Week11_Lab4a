
public class ThreeDice 
{
	// 3 Dice objects: D1, D2 and D3.
	private int D1; // Dice number one.
	private int D2; // Dice number two.
	private int D3; // Dice number three.
	private int averageDice;
	private String firstName;
	
	public ThreeDice() // Constructor with (variables) to pass values
	{
		D1 = 0; // Initialize a zero value to Dice number one.
		D2 = 0; // Initialize a zero value to Dice number two.
		D3 = 0; // Initialize a zero value to Dice number three.
		averageDice = 0;
	} // end constructor ThreeDice
	
	public void Throw() 
	{
		// Generate random throw values for each of the 3 dice.
		D1 = (int)(Math.random()*6) + 1; // X by sides of face, + 1 since dice have no 0 value.
		D2 = (int)(Math.random()*6) + 1; // X by sides of face, + 1 since dice have no 0 value.
		D3 = (int)(Math.random()*6) + 1; // X by sides of face, + 1 since dice have no 0 value.
		averageDice = (D1 + D2 + D3)/3; 
	} // end method Throw()
	
    public int getThrow()
    {
    	// Return the average of the 3 dices: D1, D2, and D3.
       return averageDice;
    } // end getDiceSum() method
    
    public void setFirstName( String first )
    {
         firstName = first;
    } // end method setFirstName

    // Return first name
    public String getFirstName()
    {
         return firstName;
    } // end method getFirstName
    
    public String toString()
    {
         return String.format(firstName);
    } //  end method toString

} // end class ThreeDice