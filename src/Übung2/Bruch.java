package Übung2;

public class Bruch implements Comparable{

    private int zaehler;
    private int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public String get() {
        return this.zaehler + "/" + this.nenner;
    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void add(Bruch bruch) {
        if(bruch.nenner != 0) {
            int gemeinsamerNenner = bruch.nenner * this.nenner;

            bruch = this.getAdjustedBruch(bruch, gemeinsamerNenner);
            Bruch self = this.getAdjustedBruch(this, gemeinsamerNenner);

            this.zaehler = self.zaehler + bruch.zaehler;
            this.nenner = gemeinsamerNenner;

            this.bruchKuerzen();

            System.out.println("BruchNachfolger = " + bruch.get() + " BruchVorgänger = " + self.get() + "SummeBrüche = " + this.get());
        }
    }

    private void bruchKuerzen() {
        int ggt = ggt(this.zaehler, this.nenner);
        if(ggt > 0) {
            this.zaehler /= ggt;
            this.nenner /= ggt;
        }
    }

    private Bruch getAdjustedBruch(Bruch bruch, int gemeinsamerNenner) {
        if(bruch.getNenner() != gemeinsamerNenner) {
            int diff = gemeinsamerNenner / bruch.getNenner();
            bruch = new Bruch(bruch.getZaehler() * diff, gemeinsamerNenner);
        }
        return bruch;
    }

    private int ggt (int a, int b) {
        if(b > a) {
            return ggt(b, a);
        } else {
            return b == 0 ? a : ggt(b, a%b);
        }
    }

    @Override
    public int compareTo(Object o) {
        Bruch bruch = (Bruch)o;
        double bruchDezimal = (double) bruch.getZaehler() / bruch.getNenner();
        double selfDezimal = (double) this.getZaehler() / this.getNenner();

        /**
         * returns 1 if the given Object is greater than self.
         * returns 0 if both are equal.
         * returns -1 if the given Object is lesser than self.
         */
        return Double.compare(selfDezimal, bruchDezimal);
    }
}
