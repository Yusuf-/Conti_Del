/**
 * Created by Yusuf on 6-12-2014.
 */

public void jeWeetNie(){
        System.out.println("Je weeht nie wieh ihk benh");
        }

public class MergeSort {

    public int[] randomArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (1 + Math.random() * 50);
        }

        return array;
    }

    public void mergeSort(int[] array, int p, int r){
        if(p < r){
            int q = (p + r) / 2;
            mergeSort(array, p, q);
            mergeSort(array, q+1, r);
            merge(array, p, q, r);

        }
    }

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
    // New method
    public void printNumber(){
        System.out.println(5);
    }
    public void printArray(int[] array){
        for(int k: array){
            System.out.print(k + " ");
        }
    }

    public void randomMethod(){

    }

    public static  void  main(String[] args){
        MergeSort myMergeSort = new MergeSort();
        int[] myArray = myMergeSort.randomArray(6);
        myMergeSort.mergeSort(myArray,0,myArray.length-1);

        myMergeSort.printArray(myArray);
    }
}

