package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet

{	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{
	}
	
	public void draw()
	{	
		line(100,100,200,100);
		noFill();
		rect(200,50,100,100);
		line(300,100,400,100);
		line(100,300,200,300);	
		noFill();
		rect(200,250,100,100);
		line(300,300,400,300);
		line(100,500,200,500);
		noFill();
		rect(200,450,100,100);
		line(300,500,400,500);
		line(100,700,200,700);
		noFill();
		rect(200,650,100,100);
		line(300,500,400,500);
		



		

	}
	public void loadData() {
        Table table = loadTable("colours.csv", "header");

        for (TableRow row : table.rows()) {
            Colour colour = new Colour(row);
            colours.add(colour);
		}
		Table table2 = loadTable("resistors.csv", "header");
		for (TableRow row : table2.rows()) {
            Resistor resistor = new Resistor(row);
            resistors.add(resistor);
		}

	}
	
	public void printColours() {
        for (Colour colour : colours) {
			System.out.println(colour);
		}
	}
	
	public Color findColor(int value)
	{




	}
	private ArrayList<Colour> colours= new ArrayList<Colour>();
	private ArrayList<Resistor> resistors= new ArrayList<Resistor>();
}
