package codeWars;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Troll {

    public static void main(String[] args){
            System.out.print(disemvowel("This website is for losers LOL!"));
        
    }


    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}