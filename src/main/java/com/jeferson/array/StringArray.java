package com.jeferson.array;

import java.util.Arrays;

public class StringArray {
    public static void main(String[] args) {
        stringTest();
        stringBasic();
    }

    private static void stringBasic() {
        String [] strArr = new String[] {"1", "2", "3"};
        String str = strArr.toString();
        System.out.println("Java String array para String = " + str.toString());
    }

    private static void stringTest() {
        String [] frutas = new String[] {"banana", "maca", "laranja", "mamao", "limao"};
        Arrays.asList(frutas).contains("maca"); // true
        Arrays.asList(frutas).indexOf("maca"); // 2
        Arrays.asList(frutas).contains("pera"); // false
        Arrays.asList(frutas).indexOf("pera"); // -1
    }
}
