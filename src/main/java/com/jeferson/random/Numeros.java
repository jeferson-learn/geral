package com.jeferson.random;

import org.apache.commons.lang3.RandomStringUtils;

public class Numeros {
    public static void main(String[] args) {
        randomNumerosComQuantidadesDigitos(10);
    }

    private static void randomNumerosComQuantidadesDigitos(int i) {
            System.out.println(RandomStringUtils.randomNumeric(i));
    }
}
