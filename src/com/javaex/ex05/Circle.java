package com.javaex.ex05;

public class Circle extends Shape implements Drawable{

	// 필드
	private int radius;

	// 생성자
	public Circle() { // 메모리 올리기
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드-일반
	public void draw() {
		// 원을 시각화 하는 복잡한 로직작동
		System.out.println("====원을 그렸습니다=========");
		System.out.println("반지름:" + radius);
		System.out.println("면색:" + fillColor);
		System.out.println("선색:" + lineColor);
		System.out.println("============================");
	}
	
	public double area() {
		
		return 3.14*radius*radius; 
	}
}
