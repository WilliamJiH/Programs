/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCC2017CLASS4;

/**
 *
 * @author Nanthi
 */
public class Point {

    //instance variable of an Object
    private int x, y;// The X and Y Coordinate of the Points
    
    //The Constructor Method for an Object
    public Point(int x1, int y1){
        x = x1;
        y = y1;
    }
    //You can have as many constructor for each Object
    public Point(){
        x = 0;
        y = 0;
    }
    
    public String toString(){
        return "x: "+ x + " y: "+ y;
    }
    
    public void translate(int dx, int dy){
        //Translate the x and y coordinate of a Point by dx, dy
        x = x + dx;
        y = y + dy;
    }
    
    //The This Operator
    public double distance(Point P){
        //rerurn the distanvce between two points
        double dx = P.y - this.y;//this will refering to an Object Type of Point within the class
        double dy = P.x - this.x;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
 //Set Methods or Mutator Methods
    public void setX(int x1){
        x  = x1;
    }
    public void setY(int y1){
        y = y1;
    }
    
   //Get Methods or Accesor Methods
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
}
