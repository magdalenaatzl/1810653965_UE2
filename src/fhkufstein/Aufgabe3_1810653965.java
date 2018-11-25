package fhkufstein;

import javax.swing.*;

import static jdk.nashorn.internal.objects.NativeString.charAt;

public class Aufgabe3_1810653965 {
    public static void main(String[] args) {


    String eingabe = JOptionPane.showInputDialog("gib eine Zahl ein");

    double alter;
    alter = Double.parseDouble(eingabe);
    JOptionPane.showMessageDialog(null, alter);
    //Ganzzahlen und Fließkommazahlen

    int a = Integer.parseInt(eingabe);
    JOptionPane.showMessageDialog(null, a);
    //nur Ganzzahlen

    boolean b = Boolean.parseBoolean(eingabe);
    JOptionPane.showMessageDialog(null, b);
    //true = true; alles andere = false

    long c = Long.parseLong(eingabe);
    JOptionPane.showMessageDialog(null, c);
    //nur Ganzzahlen

    char d = eingabe.charAt(0);
    JOptionPane.showMessageDialog(null, d);
    //einzelne Zeichen (wenn Zeichenkette eingegben wird, wir nur das erste Zeichen gespeichert)

    byte e = Byte.parseByte(eingabe);
    JOptionPane.showMessageDialog(null, e);
    //ganze Zahlen

    short f = Short.parseShort(eingabe);
    JOptionPane.showMessageDialog(null, f);
    //ganze Zahlen

    float g = Float.parseFloat(eingabe);
    JOptionPane.showMessageDialog(null, g);
    //Fließkommazahlen und ganze Zahlen

    String.valueOf(alter);
    JOptionPane.showMessageDialog(null, alter);






    }
}
