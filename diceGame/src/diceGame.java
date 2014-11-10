/**
* Khiem Trinh
* Professor Durendal
* CS112 Section 88195
* Tuesday 7 PM
* Dice Game - Week 11 Lab 4a
*/
 
import javax.swing.JOptionPane;
 
public class diceGame
{    
        public static void main(String[] args)
        {
        // Create the Dice object.
        // Initialize a variable that will refer to the dice.
        Dice gameDice = new Dice();
        Dice throwMethod = new Dice();
        ThreeDice throw3D = new ThreeDice();
        ThreeDice tString = new ThreeDice();
        
        // Number of times the dice is rolled.
        int rollCount = 0;
        int currVal = 0;
        int newCurrVal = 0;
        int tVal = 0;
        boolean evenBoo = false;
        String fName = "Ken";
        
        tString.setFirstName( fName );
        //The Java compiler writes here fName.toString() method.
        JOptionPane.showMessageDialog( null, "The programmer's first name is " + fName + "!");
           
        // Roll the dice until they come up snake eyes.
           do
           {
        	   gameDice.Roll();
               JOptionPane.showMessageDialog( null, "Your random dice roll is " + gameDice.getDie1Rand() + " and " +
            		   								gameDice.getDie2Rand() + ".\nSnake Eyes was not rolled." );
               rollCount++;
           }
           
           while (gameDice.getDiceSum() != 2);
           
           gameDice.Value( currVal );
           JOptionPane.showMessageDialog( null, "The value of dice #1 is " + gameDice.getDie1Rand() +
                                                ".\nThe value of dice #2 is " + gameDice.getDie2Rand() + 
                                                ".\nThe current value of both dice is " + gameDice.getValue() + ".");
           gameDice.Roll();
           gameDice.Value( newCurrVal );
           JOptionPane.showMessageDialog( null, "The next value of dice #1 is " + gameDice.getDie1Rand() +
                   								".\nThe next value of dice #2 is " + gameDice.getDie2Rand() + 
                   								".\nThe next current value of both dice is " + gameDice.getValue() + ".");
           
           // Call Throw(int dices, boolean even ) method.
           throwMethod.Throw( tVal, evenBoo );
           JOptionPane.showMessageDialog( null, "The total of two random calls is " + throwMethod.getThrow() + "!");
                      
           // Above created a new object by Dice gameDice = new Dice(); which is not a static call.
           // When using the new object name, such as gameDice, this can only call non-static methods from the Dice Class.
           // To call a static method from the Dice Class, begin the call by using the Class name directly, such as
           //	Dice.OneDice()
           // Access Dice Class's static method by using a static call.
           JOptionPane.showMessageDialog( null, "The total number of rolls for both dice is " + Dice.OneDice( rollCount ) + "!");
           
           throw3D.Throw();
           JOptionPane.showMessageDialog( null, "The average of three dice thrown is " + throw3D.getThrow() + "!");
           
           // Report the number of rolls it took to get Snake Eyes.
           JOptionPane.showMessageDialog( null, "Congratulations! It took " + rollCount + " rolls to get Snake Eyes!" );
          
        } // end main    
}  // end class dice