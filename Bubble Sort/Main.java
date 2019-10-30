/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] arr = new int[]{6,2,56,2,5,7,2,98};
	    Main main = new Main();
	    main.bubbleSort(arr);
		main.printArray(arr);
	}
	public void swap(int[] arr, int index1, int index2){
	    int temp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = temp;
	    
	}
	public void printArray(int[] arr){
	    for(int i : arr)
	        System.out.print(" " + i);
	}
	public void bubbleSort(int[] arr){
	    Main main = new Main();
	    for(int i = 0; i < arr.length - 1; i++)
	        for(int j = 0; j < arr.length - 1; j++)
    	        if(arr[j] > arr[j+1])
    	            main.swap(arr, j, j+1);
	}
}
