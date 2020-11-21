package Übung6.Übung6Klassen;

public abstract class SFR extends Zahlungsmittel {
   protected SFR(double wert) {
	   super("SFR", wert);
   }
   public abstract boolean wertIstGueltig();
}
