/**
 * Created by Yusuf on 6-12-2014.
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class MyTest {

    @Test
    public void testSorted(){
        MergeSort mergeSort = new MergeSort();
        int[] array = mergeSort.randomArray(10);
        mergeSort.mergeSort(array,0,array.length-1);

        //Checks if length is 10
        assertEquals(10,array.length);

        //Checks if array is sorted
        assertTrue(mergeSort.isSorted(array));

    }
}