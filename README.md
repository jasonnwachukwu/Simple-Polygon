# Simple-Polygon

A program that creates a simple polygon from user input from the keyboard (Scanner input).

## Installation

This program was implemented using the Dr. Java programming software.

## Input Types

This program uses an input type of Scanner. The scanner class is imported using "import.java.util.Scanner;".



## Example of Code Usage

    StdDraw.setCanvasSize(600,600);
  
  Sets the canvas size of the simple polygon as 600x600.
  
    StdDraw.setPenColor(StdDraw.DARK_GRAY);
    
  This line of code makes the simple polygon dark grey.
  
  
  
   
   
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert the vertices for the simple polygon: ");
  
  
  
  The user will use this Scanner keyboard to input the vertices for the simple polygon.
  
  
  
  
    double[] x = { 0.5, 0.4, 0.3, 0.5 };
    double[] y = { 0.2, 0.3, 0.2, 0.1 };
    StdDraw.polygon(x, y);
    
   This is the default simple polygon that is already implemented.
    
  
