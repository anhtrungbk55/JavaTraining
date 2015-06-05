package com.bkav.training.week2new.session4_3;

public class MovableRectangle implements Movable{
	private MovablePoint point1;
	private MovablePoint point2;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		point1 = new MovablePoint(x1, y1, xSpeed, ySpeed);
		point2 = new MovablePoint(x2, y2, xSpeed, ySpeed);
	}
	@Override
	public void moveUp() {
		point1.y -= point1.ySpeed;
		point2.y -= point2.ySpeed;
	}
	@Override
	public void moveDown() {
		point1.y += point1.ySpeed;
		point2.y += point2.ySpeed;
		
	}
	@Override
	public void moveLeft() {
		point1.x -= point1.xSpeed;
		point2.x -= point2.xSpeed;
	}
	@Override
	public void moveRight() {
		point1.x += point1.xSpeed;
		point2.x += point2.xSpeed;	
	}
	@Override
	public String toString() {
		return "Hình chữ nhật điểm 1 :" + point1.toString() + " điểm 2 :" + point2.toString();
	}	
}
