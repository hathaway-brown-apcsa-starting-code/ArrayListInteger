import java.util.ArrayList;

public class IntegerList2
{
    private ArrayList<Integer> numbers;
   
    public IntegerList2 (int size)
    {
        numbers = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
        {
            numbers.add((int)(Math.random() * 100 + 1));
        }

    }
    
    /**
     * @return the IntegerList2 as a String, the same format as an ArrayList
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
        int ans = numbers.get(0);
        for (int i = 1; i < 20; i++)
        {
            if (numbers.get(i) > ans)
            {
                ans = numbers.get(i);
            }
        }
        return ans;
    }
    
    
    /**
     * @return The smallest number in the list
     */
    public int min()
    {
        int ans = numbers.get(0);
        for (int i = 1; i < 20; i++)
        {
            if (numbers.get(i) < ans)
            {
                ans = numbers.get(i);
            }
        }
        return ans;
    }
    
    
    /**
     * @return The index of the largest number in the list
     */
    public int maxIndex()
    {
        return 0;
    }
    
    
    /**
     * @return The index of the smallest number in the list
     */
    public int minIndex()
    {
        return 0;
    }
    
    
    /**
     * @return Whether the list contains duplicate values
     */
    public boolean hasDuplicates()
    {
        return true;
    }
    
    
    public static void main (String[] args)
    {
        IntegerList2 myList = new IntegerList2 (20);
       
        System.out.println(myList);
        System.out.println("The largest number in the list is " + myList.max() +
           " at index " + myList.maxIndex() + ".");
        System.out.println("The smallest number in the list is " + myList.min() +
           " at index " + myList.minIndex() + ".");
        if (myList.hasDuplicates())
        {
            System.out.println ("There are duplicate values in the list.");
        }
        else
        {
            System.out.println ("There are no duplicates in the list.");
        }
        
    }
    

}
   