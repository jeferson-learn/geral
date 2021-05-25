package com.jeferson.random;

import org.apache.commons.lang3.RandomStringUtils;

public class Mistos {
    public static void main(String[] args) {
        alfanumerico();
        numeroLetrasSimbolos();
//        letrasJapones();
    }

    private static void alfanumerico() {
        System.out.println(RandomStringUtils.randomAlphanumeric(15));
    }

    private static void letrasJapones() {
        System.out.println(RandomStringUtils.random(7));
    }

    private static void numeroLetrasSimbolos() {
        System.out.println(RandomStringUtils.randomPrint(15));
    }

}
