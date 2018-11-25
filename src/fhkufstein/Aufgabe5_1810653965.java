package fhkufstein;

import javax.swing.*;

public class Aufgabe5_1810653965 {
    public static void main(String[] args) {
    //Aufrufen den Methoden
        System.out.println("For-Schleife 1:");
    forschleife(5);
        System.out.println("\nFor-Schleife 2:");
    forschleife(3);
        System.out.println("\nWhile-Schleife:");
    whileschleife(5);
        System.out.println("\nNutzerschleife:");
    nutzerschleife();
    }

    protected static void forschleife(int a){
        for (int i = 1;i<=a;i++) //Zählervariable; Schrittweite; Anweisung
        {
            System.out.println("Schleifenzähler: "+i);
        }
    }
    protected static void whileschleife(int a){
        int i=0; //Zählervariable
        while (i<=a) //Schrittweite
        {
            System.out.println("Schleifenzähler: "+i);
            i+=2;//Anweisung

        }
    }
    protected static void nutzerschleife()
    {
        int z1 = Integer.parseInt(JOptionPane.showInputDialog("Anzahl der Durchläufe der ersten Schleifen"));
        int z2 = Integer.parseInt(JOptionPane.showInputDialog("Anzahl der Durchläufe der zweiten Schleife"));

        int k = 0; //Zählervariable

        for (int i=0; i<z1; i++) //Zählervariable; Schrittweite; Anweisung
        {
            for(int j=0; j<z2; j++){//Zählervariable; Schrittweite; Anweisung
                k++;
                System.out.println("Das ist der "+k+ ". Durchlauf der inneren Schleife!");
            }
        }
    }
}

