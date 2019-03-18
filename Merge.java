public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void main(String[] args) {
    int[] data1 = {2,3, 4};
    int[] data2 = {10, 9, 13};
    System.out.print(merge());
  }
  public static void mergesort(int[]data){

  }
  // private static void mergeH(int[] data, int lo, int hi, int[] output){
  //   if (lo >= hi){
  //
  //   }
  //   mergeH(data, )
  // }

  private static int[] merge(int[] data1, int[] data2, int[] output){
    int idx = 0;
    for (int x = 0; x < data1.length; x++) {
      if (data1[x] > data2[idx]) output[x] = data1[x];
      else{
        output[x] = data2[idx];
        idx++;
      }
    }
  }

  public static toString(int[] data){
    String output = "";
    for (int x: data){
      output += x;
    }
    return output;
  }
}
