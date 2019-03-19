import java.util.Arrays;

public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void main(String[] args) {
    int[] data1 = {1, 3, 5};
    int[] data2 = {2, 4, 6};
    int[] output = {111, 1, 999, 243434, 15, 99};

    mergesort(output);

    System.out.print(toString(output));
  }
  public static void mergesort(int[]data){
    mergeH(data, 0, data.length - 1);
  }

  private static void mergeH(int[] data, int lo, int hi){
    if (lo == hi){
      return;
    }

    if (data.length <= 3500){
      insertionSort(data);
    }

    int[] left = Arrays.copyOfRange(data, 0, data.length / 2);
    int[] right = Arrays.copyOfRange(data, data.length / 2, hi + 1);

    mergeH(left, 0, left.length - 1);
    mergeH(right, 0, right.length - 1);
    merge(data, left, right);
  }

  private static void merge(int[] data, int[] left, int[] right){
    int x = 0;
    int y = 0;

    for (int track = 0; track < data.length; track++){
      if (x < left.length && y < right.length){
        if (left[x] < right[y]){
          data[track] = left[x];
          x++;
        }
        else{
          data[track] = right[y];
          y++;
        }
      }
      else if (x < left.length){
        data[track] = left[x];
        x++;
      }
      else if (y < right.length){
        data[track] = right[y];
        y++;
      }
    }
    }

    public static void insertionSort(int[] ary){
      for (int x = 1; x < ary.length; x++){
        if (ary[x] < ary[x-1]){ // Check if its in the right place
          int temp = ary[x];
          int y = x;
          while (y > 0 && temp < ary[x-1]){ // Find the right place
            ary[y] = ary[y-1];
            y--;
          }
          ary[y] = temp;
        }
        }
      }

  public static String toString(int[] data){
    String output = "";
    int y = 0;
    for (int x: data){
      output += x;
      if (y < data.length - 1){
        output += ", ";
        y++;
      }
    }
    return output;
  }
}
