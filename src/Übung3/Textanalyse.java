package Übung3;

public class Textanalyse {

    private final int[] charAmount = new int[24];
    private final String lookupString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Textanalyse textanalyse = new Textanalyse();
        textanalyse.getArgumentAmountAndLength(args);
        textanalyse.getCharAmount(args);
    }

    private void getCharAmount(String[] args) {
        for (String arg : args) {
            for (int i = 0 ; i < arg.length(); i++) {
                char c = gross(arg.charAt(i));
                int indexOfC = this.lookupString.indexOf(c);
                ++this.charAmount[indexOfC];
            }
        }
        printCharAmounts();
    }

    private void printCharAmounts() {
        for (int i = 0; i < this.charAmount.length; i++) {
            if(this.charAmount[i] > 0) {
                char charAmountChar = this.lookupString.charAt(i);
                System.out.println(charAmountChar + ":" + this.charAmount[i]);
            }
        }
    }

    private static char gross(char c) {
        return Character.toUpperCase(c);
    }

    private void getArgumentAmountAndLength(String[] args) {
        int amount = args.length;
        System.out.println("Es wurden " + amount + " Argumente übergeben.");
        for (int i = 0; i < amount; i++) {
            System.out.println("Argument " + (i + 1) + " hat die Länge : " + args[i].length());
        }
    }

}
