import java.util.Scanner;

public class SimplePolygon{
  
  
  
  
  public static void main(String[] args){
    
    //Sets the canvas size of the simple polygon
    StdDraw.setCanvasSize(600,600);
    
    //Sets the scale for the simple polygon
    StdDraw.setXscale(0, 1.05);
    StdDraw.setYscale(0, 1.05);
    
    StdDraw.setScale(0, 1.05);
    
    
    //Sets the pen radius for the simple polygon
    StdDraw.setPenRadius(0.05);
    
    //Sets the pen color for the simple polygon, which is dark grey.
    StdDraw.setPenColor(StdDraw.DARK_GRAY);
    
    //Enables the user to type in vertices for the simple polygon.
    
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert the vertices for the simple polygon: ");
    
    
    double[] x = { 0.5, 0.4, 0.3, 0.5 };
    double[] y = { 0.2, 0.3, 0.2, 0.1 };
    StdDraw.polygon(x, y);
    
    
    
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}