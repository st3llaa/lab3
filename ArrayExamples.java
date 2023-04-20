

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) { //only need to change up until half way bc of swapping
    for(int i = 0; i < arr.length/2; i += 1) {
      int temp = arr[i]; //origional didn't have a temp variable
      arr[i] = arr[arr.length-1 - i];
      arr[arr.length-1 - i] = temp; //swapping the two numbers
    }
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) { 
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length -i -1];
    }
    return newArray;
  }

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    double lowest = arr[0];
    double max = -9999; //including max for edge case
    for(double num: arr) { 
      if(num < lowest) { lowest = num; }
      if(num > max){ max = num;} //finding max
    }
    if(arr.length < 2) { return max; } //edge case two items in list
    double sum = 0;
    for(double num: arr) {
      if(num != lowest) { sum += num; }
    }
    return sum / (arr.length - 1);
  }


}

