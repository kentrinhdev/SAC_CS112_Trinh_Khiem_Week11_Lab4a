import javax.swing.JOptionPane;

public class Dice
{     
		// Number showing on the first die.
		private int die1Rand;
		// Number showing on the second die.
        private int die2Rand;
        private int throwCount;
        
// -------------------------- Constructor To Roll The Dice -----------------------------------
        // Pass values through the Constructor.
        // Add two integer variables to the round brackets of the constructor; such as
        // 	int die1 and int die2.
        public Dice() // Constructor with variables to pass values
        {
            // Show random values.
        	// Assign default values to the die1Rand and die2Rand fields.
        	die1Rand = 0;
        	die2Rand = 0;
        	throwCount = 0;
        } // end Constructor Dice
// -------------------------- Constructor To Roll The Dice -----------------------------------

        
// ----------------------- Throw Method Random Number Generator ------------------------------
        public void Roll() // Roll() method
        {
            // Roll the dice by setting each of the dice to be
            // 	a random number between 1 and 6.
            die1Rand = (int)(Math.random()*6) + 1;
            die2Rand = (int)(Math.random()*6) + 1;
        } // end Throw() method
// ----------------------- Throw Method Random Number Generator ------------------------------
    
                
        public int getDie1Rand()
        {
           // Set a value for the die1Rand field and return this field as a value.
           // When method called, overwrite the default value for die1Rand
           // 	and insert a new value; value in variable die1 will be the new value for die1Rand.

           // Return the number showing on the first die.
           return die1Rand;
        } // end getDie1Rand() method
        
        public int getDie2Rand()
        {
           // Set a value for the die2Rand field and return this field as a value.
           // When method called, overwrite the default value for die2Rand
           // 	and insert a new value; value in variable die2 will be the new value for die2Rand.
        	
           // Return the number showing on the second die.
           return die2Rand;
        } // end getDie2Rand() method
        
        public int getDiceSum()
        {
           // Return the total showing on the two dice.
           return die1Rand + die2Rand;
        } // end getDiceSum() method
        

// ---------------------------- int dices boolean even ---------------------------------
public void Throw( int dices, boolean even )
{
	// int dices is the number of dices to throw
    // if boolean even is true, keep throwing until even number
    // if boolean even is false, keep throwing until odd number
		dices = 1;
		even = true;
		
        even = false; // Initialize the boolean even value to false
    	do
        {
    				even = true; // Initialize the boolean even value to true
    				do
    				{
    					if ( even == true && dices%2 != 0 ) // if dices value is ODD
    					{
    						die1Rand = (int)(Math.random()*6) + 1;
    						die2Rand = (int)(Math.random()*6) + 1;	
    						JOptionPane.showMessageDialog( null, "Die one is " + die1Rand + " & Die two is " + die2Rand );
    						dices = die1Rand + die2Rand;
    						JOptionPane.showMessageDialog( null, "Both dice value is " + dices +
    								"\nThe value for both dice is odd. Throw again" );
    						throwCount++;
    						JOptionPane.showMessageDialog( null, "The dice was thrown " + throwCount + " times." );
    					}
    						else if ( even == true && dices%2 == 0 ) // if dices value is EVEN
    						{	
    							even = false; // set boolean even to FALSE
    							dices = 2;
    						}		
    				} // end inside loop
    				while( even == true && dices%2 != 0 ); // while boolean even is FALSE and dices value is ODD
    				JOptionPane.showMessageDialog( null, "The current dice value is " + dices +
    						"\nAn Even value for dice has been thrown!\n" + "The Dice was Thrown a Total of " + 
    						throwCount + " times to get an Even number!");

    					
    	throwCount = 0;
    	even = false;
    	dices = 2;
    	if ( even == false && dices%2 == 0 ) // if dices value is EVEN
        {
        	die1Rand = (int)(Math.random()*6) + 1;
            die2Rand = (int)(Math.random()*6) + 1;	
            JOptionPane.showMessageDialog( null, "Die one is " + die1Rand + " & Die two is " + die2Rand );
            dices = die1Rand + die2Rand;
			JOptionPane.showMessageDialog( null, "Both dice value is " + dices +
					"\nThe value for both dice is even. Throw again" );
            throwCount++;
            JOptionPane.showMessageDialog( null, "The dice was thrown " + throwCount + " times." );
        }
            else if ( even == false && dices%2 != 0 ) // if dices value is ODD
            {
                even = true; // set boolean even to TRUE
            } // end if statement
        } // end outside loop
		while( even == false && dices%2 == 0 ); // while boolean even is TRUE and dices value is EVEN
		JOptionPane.showMessageDialog( null, "The current dice value is " + dices +
				"\nAn Odd value for dice has been thrown!\n" + "The Dice was Thrown a Total of " + 
				throwCount + " times to get an Odd number!");
} // end method Throw( int dices, boolean even )
//---------------------------- int dices boolean even ---------------------------------

public int getThrow()
{
   // Return the total number of times the dice was thrown.
   return throwCount;
} // end getThrow() method
		
// --------------------------- Return Current Dice Value --------------------------------------
        private int dVal;
        public void Value( int cVal )
        {
        	cVal = die1Rand + die2Rand;
        	dVal = cVal;
        } // end Value() method

        public int getValue()
        {
            // Return current dice value
           return dVal;
        } // end getValue() method
// --------------------------- Return Current Dice Value --------------------------------------      
      
        
        public static int OneDice( int rTotal ) // Static method
        {
        	int rollTotal = rTotal;
        	return rollTotal * 2;
        }
        
}  // end class Dice