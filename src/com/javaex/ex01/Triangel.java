package com.javaex.ex01;

public class Triangel {

	// 필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;

	// 생성자
	public Triangel() { // 메모리 올리기
	}

	public Triangel(int width, int height, String fillColor, String linColor) {
		// *메모리올리기
		// 초기화
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = linColor;
	}

	// 메소드-gs 3
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드-일반
	public void draw() {
		// 삼각형을 시각화 하는 복잡한 로직작동
		System.out.println("====삼각형을 그렸습니다=========");
		System.out.println("가로:" + width);
		System.out.println("세로:" + height);
		System.out.println("면색:" + fillColor);
		System.out.println("선색:" + lineColor);
		System.out.println("============================");
	}
}
