import java.util.ArrayList;

public class IntegerList
{
    private ArrayList<Integer> numbers;
   
    public IntegerList (int size)
    {
    }
    
    /**
     * @return the IntegerList as a String, the same format as an ArrayList
     */
    public String toString ()
    {
        return numbers.toString();
    }
    
    /**
     * @return The largest number in the list
     */
    public int max()
    {
        return -1;
    }
    
    
    public static void main (String[] args)
    {
        IntegerList myList = new IntegerList (20);
       
        System.out.println(myList);
        System.out.println("The largest number in the list is " + myList.max() + ".");
 
    }
    

}
   