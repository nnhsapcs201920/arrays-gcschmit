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
     *  @returns the average
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
    public static void printElementSeparators() {
        /*
        int[] a = createRandomArray(5, 10);
        for (int i=0; i<a.length; i++) {
        System.out.print((i!=0?"|":"")+a[i]);
        }
         */

        int[] array = createRandomArray(5, 10);
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + "|");
            } else {
                System.out.print(array[i]);
            }
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
        int[] array = createRandomArray(10,50);
        int count = 0;
        printArray(array);
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == valueToFind)
            {
                System.out.println("index: " + i);
                break;
            }
            else
            {
                count += 1;
            }
        }
        if(count == array.length)
        {
            System.out.println("index: " + -1);
        }
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
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < limit)
            {
                count++;
            }
        }

        printArray(array);
        System.out.println("Number of elements less than the value: " + count);
    }

    /*
     * Array Algorithm #5.1: findMax
     *  creates an array filled with random numbers
     *  prints the array and the greatest number
     */
    public static void findMax() 
    {
        int[] array = createRandomArray(10, 50);
        int max = 0;
        for(int element : array)
        {
            if(element > max)
            {
                max = element;
            }
        }

        printArray(array);
        System.out.println("max is: " + max);
    }

    /*
     * Array Algorithm #5.2: findMin
     *  creates an array filled with random numbers
     *  prints the array and the least number
     */
    public static void findMin()
    {
        int[] array = createRandomArray(10, 50);
        int min = 50;
        for(int element : array)
        {
            if(element < min)
            {
                min = element;
            }
        }

        printArray(array);
        System.out.println("min is: " + min);
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
        int[] array = createRandomArray( 10, 100 );
        int[] array2 = new int[10];
        int a = 0;

        for( int i = array.length - 1; i >= 0; i-- )
        {
            array2[ a ] = array[ i ];
            a++;
        }

        printArray(array);
        printArray(array2);

        return array2;
    }
}