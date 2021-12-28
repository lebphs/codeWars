package codeWars;

public class NumberFun {

    public static void main(String []args){
        System.out.println(NumberFun.findNextSquare(144));
     }

    public static long findNextSquare(long sq) {
      double num = Math.sqrt(sq) + 1;
      return num % 1 == 0 ? Double.valueOf(num * num).longValue() : -1;
    }
    
}
