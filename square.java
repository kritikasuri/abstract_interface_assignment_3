package com.acadgild.assignment.shape;

public class square implements shape {
	
	int side;
	
	public square(int s){
		this.side = s;
	}

	@Override
	public void draw() {
		System.out.println("Square");		
	}

	@Override
	public int getArea() {
		return (this.side * this.side);
	}

	
}
