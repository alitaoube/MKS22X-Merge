import java.util.Arrays;

public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void main(String[] args) {
    int[] data1 = {1, 3, 5};
    int[] data2 = {2, 4, 6};
    int[] output = new int[6];

    System.out.print(toString(merge(data1, data2, output)));
  }
  public static void mergesort(int[]data){

  }
  private static void mergeH(int[] data, int lo, int hi){
    if (lo == hi){
      return;
    }

    int[] left = Arrays.copyOfRange(data, 0, data.length / 2);
    int[] right = Arrays.copyOfRange(data, data.length / 2, hi);

    mergeH(left, 0, data.length / 2);
    mergeH(right, data.length / 2, hi);
    merge(left, right);
  }

  private static int[] merge(int[] left, int[] right){
    int x = 0;
    int y = 0;
    int[] data = new int[left.length + right.length];

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
    return data;
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
