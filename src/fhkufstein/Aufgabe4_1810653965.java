package fhkufstein;

public class Aufgabe4_1810653965 {
    public static void main(String[] args) {

        for (int i=1;i<=10;i++) //Zählervariable; Schrittweite; Anweisung
        {
            System.out.println("Der Schleifenzähler ist: " + i);
        }

        int j=1; //Zählervariable
        while(j<=10) //Schrittweite
        {
            System.out.println("Der Schleifenzähler ist: " +j);
            j++; //Anweisung
        }
        int h =1;//Zählervariable
        do {
            System.out.println("Der Schleifenzhähler ist: "+h);
            h++;//Anweisung
        }
        while(h<=10);//Schrittweite
    }

    /*
    for und while  sind kopfgesteuerte Schleifen
    --> prüfen vor der ersten Ausführung

    do ist eine fußgesteuerte Schleife
    --> prüft die Ausführungsbedingung erst nach dem Durchlaufen der Anweisungsfolge
     */
}
