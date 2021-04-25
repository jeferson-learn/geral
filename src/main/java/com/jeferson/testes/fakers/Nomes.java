package com.jeferson.testes.fakers;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Nomes {

    static Faker faker = new com.github.javafaker.Faker(); // padrão
    static Faker fakerBr = new Faker(new Locale("pt-BR")); // especifico BRASILEIRO

    public static void main(String[] args) {

        nomeCompleto();
        primeiroNome();
        ultimoNome();

    }

    private static void ultimoNome() {
        String ultimoNome = fakerBr.name().lastName();
        System.out.println(ultimoNome);
    }

    private static void primeiroNome() {
        String primeiroNome = fakerBr.name().firstName();
        System.out.println(primeiroNome);
    }

    private static void nomeCompleto() {
        String nomeCompleto = fakerBr.name().fullName();
        System.out.println(nomeCompleto);
    }

}
