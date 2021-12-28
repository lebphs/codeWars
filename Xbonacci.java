package codeWars;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Xbonacci {


    public static void main(String[] args){
        
        double[] arr = tribonacci(new double []{1,1,1},10);

        for(double d : arr){
            System.out.print(d + " ");
        }
    }


    public static double[] tribonacci(double[] s, int n) {
        int step = 3;

        double[] arr = Arrays.copyOf(s, n);

        for(int i = step; i < n; i++){
            arr[i] = arr[i - 3] + arr[i - 2] + arr[i - 1];
        }

        return  arr;
    }
    
}
