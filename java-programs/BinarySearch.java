// Binary Search in Java

import java.util.*;
import java.lang.*;

public class BinarySearch {
  public static void main(String args[]) {
    
    List<Int> testArray = new ArrayList<Int>();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("searching elements through binary-search...");
    testArray = {34, 56, 77, 88, 89, 90, 100, 120, 123, 445, 675, 889};
    
    System.out.println("enter the number you want to search> ");
    int number = scanner.nextInt();

    if (this.search(numberToSearch=number, arr=testArray) >= 0) {
      System.out.println("the number is present on the index> " + this.search(numberToSearch=number, arr=testArray));
    } else {
      System.out.println("the number " + number + " is not present in the array");
    }

  }
  public static int search(int numberToSearch, List<Int> arr) {
    private static int lowBound = 0;
    private static int highBound = arr.length() - 1;
    private static int midBound = (lowBound + highBound) / 2;

    if (arr[midBound] == numberToSearch) {
      return midBound + 1;
    } else {
      if (arr[midBound] > numberToSearch) {
        highBound = midBound - 1;
      } else if (arr[midBound] < numberToSearch) {
        lowBound = midBound + 1;
      } else {
        System.out.println("something went wrong... please try again");
      }

      for (int count = lowBound; count <= highBound; count++) {
        if (arr[count] == numberToSearch) {
          return count + 1;
        }
      }
    }
    return 0;
  }
}