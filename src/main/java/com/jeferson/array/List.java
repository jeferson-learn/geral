package com.jeferson.array;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        arrayAdd();
    }

    private static void arrayAdd() {
        ArrayList list = new ArrayList();
        list.add(new Double(3.141));
        list.add(new Integer(200));
        list.add(new String("Jeferson"));
        System.out.println(list);
    }
}
