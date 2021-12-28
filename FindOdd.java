package codeWars;



public class FindOdd {

    public static void main(String[] args) {

        int num = FindOdd.findIt(new int[] { 1,2,1,2,3 });

        System.out.print(num + " ");

    }

    public static int findIt(int[] a) {
        int xor = 0;
        for (int i = 0; i < a.length; i++) {
          xor ^= a[i];
        }
        return xor;
      }
}