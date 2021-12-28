package codeWars;

public class Diamond {

    public static void main(String[] args) {

        System.out.print(Diamond.print(7));

    }

    public static String print(int n) {

        if(n % 2 == 0  || n < 0){
            return null;
        }

        StringBuilder resultStr = new StringBuilder();

        for (int i = n ; i >= 1; i -= 2) {
            int numSpace = (n - i) / 2;
            StringBuilder str = new StringBuilder();

            str.append(" ".repeat(numSpace));
            str.append("*".repeat(i));
            str.append("\n");

            if(i != n){
                resultStr.insert(0, str);
            }
            resultStr.append(str);
        }
        return resultStr.toString();
    }
}