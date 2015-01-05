/**
 * Created by Yusuf on 6-12-2014.
 * Merge sort is an algorithm that uses divide-and-conquer strategy to sort a sequence.
 */
public class MergeSort {

    /**
     * Returns an array of selected size, that contains random values.
     *
     * @param size an integer that sets the size of your array.
     * @return random array
     */
    public int[] randomArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (1 + Math.random() * 50);
        }

        return array;
    }

    /**
     * Sorts the array by splitting until there are only base cases. Then merges the base cases
     * @param array the unsorted array that needs to be sorted
     * @param p integer that gives the begin position of the array
     * @param r integer that gives the length of the array
     */
    public void mergeSort(int[] array, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);

        }
    }

    /**
     * Merges the base cases
     * @param array the unsorted array that needs to be sorted
     * @param p integer that gives the begin position of the array
     * @param q integer that gives the middle position of the array. This calculated by (p + r) / 2
     * @param r integer that gives the length of the array
     */
    public void merge(int[] array, int p, int q, int r){
        int n1 = q- p +1;
        int n2 = r - q;
        int[] left = new int[n1+1];
        int[] right = new int[n2+1];

        for(int i = 0; i < n1; i++){
            left[i] = array[p+i];
        }

        for(int j = 0; j < n2; j++){
            right[j] = array[q+j+1];
        }

        left[n1] = 999;
        right[n2] = 999;

        int i = 0;
        int j = 0;
        for(int k = p; k <= r; k++){
            if(left[i] <= right[j]){
                array[k] = left[i];
                i++;
            }
            else{
                array[k] = right[j];
                j++;
            }
        }
    }

    /**
     * Method that is used to check if the array is sorted
     * @param array the array that will be checked
     * @return True if the array is sorted. False if array is not sorted
     */
    public boolean isSorted(int[] array){
        boolean sorted = true;
        for(int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    public static  void  main(String[] args){
        MergeSort myMergeSort = new MergeSort();
        int[] myArray = myMergeSort.randomArray(6);
        myMergeSort.mergeSort(myArray,0,myArray.length);

        for(int k: myArray){
            System.out.print(k + " ");
        }

        System.out.println(myMergeSort.isSorted(myArray));
    }
}

