package algorithms;

public class QuickSortLomuto2 {
    private static int partition(int[] arr, int start, int end) {
      int p = arr[end];
      int i = start;
      for (int j = start; j < end; j++) {
        if (arr[j] <= p) {
          int tmp = arr[j];
          arr[j] = arr[i];
          arr[i] = tmp;
          i++;
        }
      }
      arr[end] = arr[i];
      arr[i] = p;
      return i;
    }
  
    public static void quickSort(int[] arr, int start, int end) {
      if (start >= end) return;
      int index = partition(arr, start, end);
      quickSort(arr, start, index - 1);
      quickSort(arr, index + 1, end);
    }
  
    public static void quickSort(int[] arr) {
      quickSort(arr, 0, arr.length - 1);
    }

  }