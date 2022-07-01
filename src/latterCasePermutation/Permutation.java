package latterCasePermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {


    public static List<String> letterCasePermutation(String s) {
        List<String> container = new ArrayList<>();
        permute(s.toCharArray(), container, 0);
        return container;
    }

    public static void permute(char[] arr, List<String> container, int start) {
        container.add(new String(arr));
        for (int i = start; i < arr.length; i++) {
            char ch = arr[i];
            if (Character.isLetter(ch)) {
                arr[i] = getOpposite(ch);
                permute(arr, container, i + 1);
                arr[i] = ch;
            }
        }
    }

    public static char getOpposite(char c) {
        return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
    }

    public static void main(String[] args) {
        List<String> stringList;
        stringList = letterCasePermutation("mQe");
        System.out.println(Arrays.toString(stringList.toArray()));
    }
}