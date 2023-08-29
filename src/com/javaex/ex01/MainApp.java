package com.javaex.ex01;

public class MainApp {

	// 필드

	// 생성자

	// 메소드 gs

	// 메소드 일반*
	public static void main(String[] args) {
		// 메인 시나리오

		// 사각형1
		// Rectangle 메모리에 올린다
		Rectangle r01 = new Rectangle();
		r01.setWidth(3);
		r01.setHeight(2);
		r01.setFillColor("초록");
		r01.setLineColor("빨강");
		r01.draw();

		// 사각형2
		Rectangle r02 = new Rectangle(5, 5, "빨강", "빨강");
		r02.draw();

		// 삼각형1
		Triangel t01 = new Triangel();
		t01.setWidth(10);
		t01.setHeight(10);
		t01.setFillColor("노랑");
		t01.setLineColor("주황");
		t01.draw();

		// 삼각형2
		Triangel t02 = new Triangel(15, 15, "빨강", "빨강");
		t02.draw();

		// 원1
		Circle c01 = new Circle();
		c01.setRadius(10);
		c01.setFillColor("노랑");
		c01.setLineColor("주황");
		c01.draw();

		// 원2
		Circle c02 = new Circle(100, "흰색", "검정");
		c02.setRadius(10);
		c02.setFillColor("노랑");
		c02.setLineColor("주황");
		c02.draw();

	}

}
