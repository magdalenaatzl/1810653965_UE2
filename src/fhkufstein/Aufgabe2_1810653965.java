package fhkufstein;

import javax.swing.*;

public class Aufgabe2_1810653965 {
    public static void main(String[] args) {
        int zahl1 = Integer.parseInt(JOptionPane.showInputDialog("erste Zahl"));
        int zahl2 = Integer.parseInt(JOptionPane.showInputDialog("zweite Zahl"));
        /*Einlesen eines Strings mit JOptionPane.showInputDialog und umwandlen
        in Integer Datentyp durch Integer.parseInt
         */

        int i = 0; //Zählervariable der while-Schleife
        while (true)
        //Beginn Endlosschliefe --> mit true wird eine Bedinung angegeben die nie false werden kann
        {
            i++; //wird nach jedem Durchlaufen der Schleife um 1 erhöht
            if(zahl1==zahl2)
            {
                System.out.println("Die Zahl lautet " + zahl1 + ". \nDu hast "+ i + " Versuche gebraucht.");
                break;
                //wenn die beiden Zahlen geleich sind wird die Schleife abgebrochen
            }
            else if (zahl1>zahl2)
            {
                zahl2++;
                /*wenn die Zahl 1 größer ist wird die Zahl 1 bei jedem durchlaufen der Schleife um 1 erhöht
                (bis die Zahl 1 gleich der Zahl 2 ist)
                 */
            }
            else if (zahl2>zahl1)
            {
                zahl1++;
                /*wenn die Zahl 2 größer ist wird die Zahl 1 bei jedem durchlaufen der Schleife um 1 erhöht
                (bis die Zahl 2 gleich der Zahl 1 ist)
                */
            }
        }
    }
}
