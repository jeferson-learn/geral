package com.jeferson.random;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Numeros {

    public static void main(String[] args) {
//        randomNumerosComQuantidadesDigitos(10);
//        randomNumeroComLimite();
//        randomNumeroControle();
        randomGerarNumeroAleatorio();
    }

    private static void randomGerarNumeroAleatorio() {
        Random random = new Random();
        int numero1 = random.nextInt(30); //0 a 29
        int numero2 = random.nextInt(30) + 1; // 1 a 30
        System.out.println(numero1);
        System.out.println(numero2);
    }

    private static void randomNumeroControle() {
        int min = 2;
        int max = 8;

        //Generate random int value from 2 to 8
        System.out.println("Random value in int from "+min+" to "+max+ ":");
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
    }

    private static void randomNumeroComLimite() {
        Random random = new Random();
        int num_random = random.nextInt(8);
        System.out.println(num_random);
    }

    private static void randomNumerosComQuantidadesDigitos(int i) {
            System.out.println(RandomStringUtils.randomNumeric(i));
    }
}
