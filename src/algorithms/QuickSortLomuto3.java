package algorithms;

import java.util.Scanner;

public class QuickSortLomuto3 {
	public static void main(String[] args) {
		String[] arrayInput;
		int[] arrayInt;
		try(Scanner scanner = new Scanner(System.in)){
			arrayInput = scanner.nextLine().trim().split(" ");
		}
		arrayInt = convertStringToInt(arrayInput);	
		
		// Sorting
		quickSort(arrayInt, 0, arrayInt.length - 1);
		
		// // The Huxley Output
		// System.out.printf("Resultado Final: ");
		// for(int index = 0; index < arrayInt.length; index++) {
		// 	System.out.printf("%d", arrayInt[index]);
		// 	if(index != arrayInt.length - 1) {
		// 		System.out.print(" | ");
		// 	}	
		// }
	}
	
	private static int[] convertStringToInt(String[] arrayString) {
		int[] arrayInt;
		arrayInt = new int[arrayString.length];
		for(int index = 0; index < arrayString.length; index++) {
			arrayInt[index] = Integer.parseInt(arrayString[index]);
		}

		return arrayInt;
	}
	
	public static void quickSort(int[] array, int firstIndex, int lastIndex) {
		int pivotIndex;
		if(firstIndex < lastIndex) {
			pivotIndex = partition(array, firstIndex, lastIndex);
			quickSort(array, firstIndex, pivotIndex - 1);	
			quickSort(array, pivotIndex + 1, lastIndex);				
		}
	}
	
	private static int partition(int[] array, int firstIndex, int lastIndex) { // First index starts with 0
		int pivotIndex, auxValue;                                              // and the last index is the length of the array - 1
		int leftIndex = firstIndex - 1, rigthIndex = firstIndex; // partition(array[], 0, 7), in first iteration: leftIndex = -1	, rigthIndex = 0
		
		// Switching to java indexing format
		
		// Partition Algorithm
		pivotIndex = lastIndex;
		for(; rigthIndex <= lastIndex - 1; rigthIndex++) { 
			if(array[rigthIndex] <= array[pivotIndex]) {
				leftIndex++;
				auxValue = array[rigthIndex]; // Swap array[rigthIndex] with array[leftIndex]
				array[rigthIndex] = array[leftIndex];
				array[leftIndex] = auxValue;
			}
		}
		auxValue = array[leftIndex + 1]; // Placing the pivot in the right position 
		array[leftIndex + 1] = array[pivotIndex];
		array[pivotIndex] = auxValue;	
		pivotIndex = leftIndex + 1;
		
		// // Output Formated The Huxley
		// System.out.printf("Pivot: %d%n", array[pivotIndex]);
		
		// System.out.printf("Partition(A,%d,%d): ", firstIndex + 1, lastIndex + 1); // +1 for staying in the Huxley format
		// for(int index = firstIndex; index <= pivotIndex - 1; index++) {
		// 	System.out.printf("%d ", array[index]);
		// }
		// System.out.printf("<= %d <", array[pivotIndex]);
		// for(int index = pivotIndex + 1; index <= lastIndex; index++) {
		// 	if(index == pivotIndex + 1) // formated print 
		// 		System.out.print(" ");
		// 	System.out.printf("%d", array[index]);
		// 	if(index != lastIndex) 
		// 		System.out.print(" ");
		// }
		
		// System.out.printf("%nEstado atual de A: ");
		// for(int index = 0; index < array.length; index++) {
		// 	System.out.printf("%d", array[index]);
		// 	if(index != array.length - 1) {
		// 		System.out.print(" | ");
		// 	}
		// }
		// System.out.printf("%n%n");
		
		return pivotIndex;
	}
}
