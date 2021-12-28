package codeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOutlier {

  public static void main(String[] args) {
    int[] arr = { 206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781 };
    System.out.println(findTest(arr));
  }

  static int find(int[] integers) {

    int evenCounter = 0;
    int oddCounter = 0;

    for (int i = 0; i < integers.length; i++) {
      if (Math.abs(integers[i]) % 2 == 0 && oddCounter <= 2) {
        evenCounter += 1;
      } else if (Math.abs(integers[i]) % 2 == 1 && evenCounter <= 2) {
        oddCounter += 1;
      } else {
        return integers[i];
      }
    }

    int remainder = oddCounter > evenCounter ? 0 : 1;

    for (int i = 0; i < integers.length; i++) {
      if (Math.abs(integers[i]) % 2 == remainder) {
        return integers[i];
      }
    }

    return 0;
  }

  static int findTest(int[] integers) {
    List<Integer> evenList = new ArrayList<>();

    List<Integer> oddList = new ArrayList<>();

    Arrays.stream(integers).peek(i -> {

      if (i % 2 == 0) {
        evenList.add(i);
      } else {
        oddList.add(i);
      }
    }).toArray();

    return evenList.size() > 1 ? oddList.get(0) : evenList.get(0);
  }
}