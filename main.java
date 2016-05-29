package com.acadgild.assignment.shape;

public class main {
    public static void main(String[] args) {
    	
    	square sq = new square(4);
    	sq.draw();
    	System.out.println("The area = "+sq.getArea());
    	
    	System.out.println();
    	
    	rectangle rect = new rectangle(4, 5);
    	rect.draw();
    	System.out.println("The area = "+rect.getArea());
  }
}
