package ie.tudublin;

public class Resistor 
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public Resistor(int value){
        int hundreds = (value / 100);
        int tens = (value - (hundreds * 100)) / 10;
        int ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);




    }

    private void print(String string) {
    }

    private void println(int ones2) {
    }

    





}