import java.util.Arrays;

public class CommonArrayAlgorithms
{
    /*
     * Create array of the specified size filled with
     *      random values based on the maximum value.
     */
    public static int[] createRandomArray( int length, int maxValue )
    {
        int[] randomArray = new int[ length ];
        for( int i = 0; i < randomArray.length; i++ )
        {
            randomArray[ i ] = (int)( Math.random() * maxValue );
        }

        return randomArray;
    }

    /*
     * Prints the specified array to System.out
     */
    public static void printArray( int[] array )
    {
        System.out.println( Arrays.toString( array ));
    }

    /*
     * Array Algorithm #1: Sum and Average
     *  creates an array filled with random numbers
     *  calculates the sum and average of the numbers
     *  prints the array and the sum and average
     */
    public static void sumAndAverage()
    {
        double sum = 0;
        double average = 0;

        int[] array = createRandomArray( 10, 50 );

        for( int element : array)
        {
            sum += element;
        }

        average = sum / array.length;

        printArray( array );
        System.out.println( "sum: " + sum + " average: " + average );
    }

    /*
     * Array Algorithm #2: Print Element Separators
     *  creates an array filled with random numbers
     *  prints each element of the array with a '|' between each element
     *      but not at the beginning or end of the array
     */
    public static void printElementSeparators()
    {
        int [] array = createRandomArray(10,50);
        for(int i = 0; i < array.length; i ++)
        {
            System.out.print(array[i]);
            if(i == array.length-1)
            {
                break;
            }
            System.out.print("|");
        }
    }

    /*
     * Array Algorithm #3: Linear Search
     *  creates an array filled with random numbers
     *  find the index of the first element with the specified value
     *  prints the array and the index (or -1 if not found)
     */
    public static void linearSearch( int valueToFind )
    {
        int[] array1 = CommonArrayAlgorithms.createRandomArray(10, 15);
        int out = -1;
        for(int i = 0; i < array1.length; i++)
        {
            if(array1[i] == valueToFind)
            {
                out = i;
            }
        }
        printArray(array1);
        System.out.println("Index: " + out);
    }

    /*
     * Array Algorithm #4: Count Less Than
     *  creates an array filled with random numbers
     *  counts the number of elements that are less than the specified value
     *  prints the array and the count
     */
    public static void countLessThan( int limit )
    {
        int[] array = createRandomArray( 10, 50 );
        int count = 0;
        for (int i = 0; i < array.length ; i++)
        {
            System.out.println(array[i]);
            if (array[i] < limit - 1 )
            {
                count++;
            }
        }
        System.out.println("Amount of numbers less than count: "+count);
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int[] array  = createRandomArray(10,50);
        int num1 = 0;
        for(int i = 0; i < array.length; i++)
        {
            if( num1 < array[i])
            {
                num1 = array[i];
            }
        }
        printArray( array );
        System.out.println("The larget number is: " + num1);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        int[] array  = createRandomArray(10,50);
        int num1 = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if( num1 > array[i])
            {
                num1 = array[i];
            }
        }
        printArray( array );
        System.out.println("The smallest number is: " + num1);
    }

    /*
     * Array Algorithm #6: Reverse Array
     *  creates an array filled with random numbers
     *  creates a new array of the same size
     *  copies elements from the first array into the new array in reverse order
     *  prints the original array and the new array
     *  returns the new array
     */
    public static int[] reverseArray()
    {
        int[] array = createRandomArray( 10, 50 );
        int[] newArray = createRandomArray( 10, 50);

        int a = 0;
        for (int i = array.length-1; i>=0; i--)
        {
            newArray[i] = array[a];
            a+=1;
        }
        printArray(array);
        printArray(newArray);
        return newArray;
    }

}