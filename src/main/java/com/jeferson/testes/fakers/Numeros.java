package com.jeferson.testes.fakers;

import java.util.UUID;

public class Numeros {

    public static void main(String[] args) {
        alfanumero1();
    }

    private static void alfanumero1() {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
    }
}
