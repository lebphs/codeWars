package codeWars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DirReduction {

    public static void main(String[] args) {

        String[] num = DirReduction
                .dirReduc(new String[] { "EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST" });

        for (String str : num) {
            System.out.print(str + " ");
        }

    }

    public static String[] dirReduc(String[] arr) {

        List<String> list = Arrays.stream(arr).collect(Collectors.toList());
        List<String> str1 = Arrays.asList("NORTH", "SOUTH");
        List<String> str2 = Arrays.asList("EAST", "WEST");

        for (int i = 0; i < list.size() - 1; i++) {
            if (!list.get(i).equals(list.get(i + 1)) && ((str1.contains(list.get(i)) && str1.contains(list.get(i + 1))) ||
                    (str2.contains(list.get(i)) && str2.contains(list.get(i + 1)))) && list.size() > 1) {
                list.remove(i);
                list.remove(i);
                i = -1;
            }

        }

        return list.toArray(new String[list.size()]);
    }
}
