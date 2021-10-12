
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Ronak
 */
public class CardTrick {
    public static void main(String[] args)
    {
      // Create an object 
      Card s1 = new Card();  
      Card s2 = new Card(); 
      // Give the object values
      s1.setValue(6); // between 1 and 12
      s1.setSuit("Hearts");
      s2.setValue(3); // between 1 and 12
      s2.setSuit("Diamonds");
     // Print to double check
     System.out.println(" the first object suit is " + s1.suit); 
     System.out.println(" the first object Value is " + s1.value);

     System.out.println(" the Second object suit is " + s2.suit); 
     System.out.println(s2.value + " the Second object Value is ");
    }}
    

