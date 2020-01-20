/**
* Payable.java
* Demonstrates the selection sort and insertion sort algorithms.
*/

public class Sorting<T>
{
    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the selection
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void selectionSort(Comparable[] list)
    {
        int max;
        Comparable<T> temp;

        for (int index = 0; index < list.length-1; index++)
        {
            max = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[max]) > 0)
                    max = scan;

            // Swap the values
            temp = list[max];
            list[max] = list[index];
            list[index] = temp;
        }
    }

    //-----------------------------------------------------------------
    //  Sorts the specified array of objects using the insertion
    //  sort algorithm.
    //-----------------------------------------------------------------
    public void insertionSort (Comparable[] list)
    {
        for (int index = 1; index < list.length; index++)
        {
            Comparable key = list[index];
            int position = index;

            //  Shift larger values to the right
            while (position > 0 && key.compareTo(list[position-1]) > 0)
            {
                list[position] = list[position-1];
                position--;
            }

            list[position] = key;
        }
    }
}
