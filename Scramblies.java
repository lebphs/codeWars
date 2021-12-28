package codeWars;

public class Scramblies {

    public static void main(String []args){
        System.out.println(Scramblies.scramble("scriptjavx","javascript"));
     }

    
    public static boolean scramble(String str1, String str2) {
        StringBuilder stringBuilder = new StringBuilder(str1);
        boolean test =  str2.chars().mapToObj(c -> (char) c).allMatch(c -> {
            int result = stringBuilder.indexOf(c.toString());
            if(result != -1) {
                stringBuilder.deleteCharAt(stringBuilder.indexOf(c.toString()));
                return true;
             }
            return false;
        });
        return test;
    }
}