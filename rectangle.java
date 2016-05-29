package com.acadgild.assignment.shape;

public class rectangle implements shape {
    
	 int length,breadth;
	
	public rectangle(int l,int b){
		this.length = l;
		this.breadth = b;
	}
		
	@Override
	public void draw() {
		System.out.println("Rectangle");			
	}

	@Override
	public int getArea() {
		return (this.length * this.breadth);
	}
	
}
