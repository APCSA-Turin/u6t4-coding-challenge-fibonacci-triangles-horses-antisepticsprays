package com.example.project;

public class Point {
  private int x;
  private int y;
 
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
  
  // Getter and Setter methods
  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  // Returns distance between this Point object and another Point object
  public double distanceTo(Point other) {
      int xdistance = Math.abs(other.x - x);
      int ydistance = Math.abs(other.y - y);
      return Math.sqrt((Math.pow(xdistance, 2) + Math.pow(ydistance, 2)));
  }

  // Returns a string in the format: (x, y)
  public String pointInfo() {
     String str = "(";
     str += x;
     str += ", ";
     str += y;
     str += ")";
     return str;
  }

}
