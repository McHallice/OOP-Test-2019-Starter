package ie.tudublin;

import processing.data.TableRow;

public class Colour
{

    private String colour;
    public int r;
    public int g;
    public int b;

    /**
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
    
    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b;  
    }

    public Colour(TableRow row)
    {
        colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        
    }










}