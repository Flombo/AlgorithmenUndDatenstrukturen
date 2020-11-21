package Übung1;

public class Counter
{
    private int x; // Zählerstand
    private int xStorage;

    public Counter() {
        x=0;
        this.xStorage = -1;
    } // Konstruktor

    public void increment() {
        ++x;
    } // Hochzählen

    public int get(){
        return x;
    } // Auslesen

    public void reset(){
        x=0;
    } // Zurücksetzen

    public void decrement(){
        if(x > 0) {
            --x;
        }
    }

    public void restore(){
        if(this.xStorage >= 0) {
            x = this.xStorage;
        } else {
            System.out.println("Error: restore can´t be called, before first save call");
        }
    }

    public void save(){
        this.xStorage = x;
    }

}