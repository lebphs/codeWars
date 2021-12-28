package codeWars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {


    public static void main(String[] args){
        
        int[] arr = sortArray(new int []{ 5, 3, 1, 8, 0});

        for(int d : arr){
            System.out.print(d + " ");
        }
    }

    public static int[] sortArray(int[] array) {

        int[] oddArr = Arrays.stream(array)
                                .filter(e -> e % 2 != 0)
                                .sorted()
                                .toArray();
                        
    for (int j = 0, s = 0; j < array.length; j++) {
        if (array[j] % 2 == 1) array[j] = oddArr[s++];
      }
    return array;
    }
  }