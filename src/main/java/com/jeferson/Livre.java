package com.jeferson;

import javax.swing.*;

public class Livre {

    public static void main( String[] args ) {

        int x,y,soma;

        x = Integer.parseInt(JOptionPane.showInputDialog("1 numero:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("2 numero:"));
//        y = Integer.parseInt(JOptionPane.showInputDialog("2 numero:"));

        JOptionPane.showMessageDialog(null, "Soma: " + (x+y));
    }
}
