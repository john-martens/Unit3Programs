package Lesson9.shapesv2;

import TurtleGraphics.Pen;
import java.awt.Color;

//abstact = can't make direct instance of shape
public abstract class Shape {
    protected double xPos, yPos;
    
    public Shape(double x, double y){
        xPos = x;
        yPos = y;
    }
    
    //like interface, children MUST implement it
    abstract double area();
    abstract void draw(Pen p);
    abstract void stretchBy(double factor);
    
    public double getXPos() {
        return xPos;
    }

    public double getYPos() {
        return yPos;
    }

    public void move(double xLoc, double yLoc) {
        xPos = xLoc;
        yPos = yLoc;
    }
    
    public void erase(Pen p){
        p.setColor(Color.white);
        draw(p);
        p.setColor(Color.blue);
    }
    
    public String toString(){
        String str = "Xpos: " + xPos + " Ypos: " + yPos;
        str += String.format("\nArea: %.2f", area());
        return str;
    }
    
}
