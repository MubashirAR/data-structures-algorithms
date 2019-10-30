
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Main main = new Main();
		int[] arr = main.generateArray(100);
		main.selectionSort(arr);
		main.printArray(arr);
	}
	
	private int[] generateArray(int length){
	    int[] arr = new int[length];
		for(int i=0; i<length; i++){
		    arr[i] = (int)Math.round(Math.random() * 100);
		}
		return arr;
	}
	
	private void printArray(int[] arr){
		for(int i : arr){
		    System.out.println(i);
		}
	}
	
	private int[] selectionSort(int[] arr){
	    Main main = new Main();
	    for(int i=0; i<arr.length; i++){
	        for(int j=i; j<arr.length; j++){
	            if(arr[j] < arr[i]){
	                main.swap(arr, i, j);
	            }
	        }
	    }
	    return arr;
	}
	
	private int[] swap(int[] arr, int index1, int index2){
	    int temp = 0;
	    temp = arr[index1];
	    arr[index1] = arr[index2];
	    arr[index2] = temp;
	    return arr;
	}
}
