package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Lugares {

    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {

        for (int i = 0; i<5; i++){
            numeroCEP();
        }
        nomePais();
        nomeEstado();
        nomeCidade();
        nomeUF();
//        numeroCEP();

    }

    private static void numeroCEP() {
        String numeroCEP = fakerBr.address().zipCode();
        System.out.println(numeroCEP);
    }

    private static void nomeUF() {
        String nomeUF = fakerBr.address().stateAbbr();
        System.out.println(nomeUF);
    }

    private static void nomeCidade() {
        String nomeCidade = fakerBr.address().cityName();
        System.out.println(nomeCidade);
    }

    private static void nomeEstado() {
        String nomeEstado = fakerBr.address().state();
        System.out.println(nomeEstado);
    }

    private static void nomePais() {
        String nomePais = fakerBr.address().country();
        System.out.println(nomePais);
    }
    
}
