package Übung6.Übung6Klassen;

public abstract class EUR extends Zahlungsmittel {

    public EUR(double wert) {
	   super("EUR", wert);
   }

   public abstract boolean wertIstGueltig();

}

