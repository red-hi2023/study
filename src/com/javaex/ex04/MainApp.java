package com.javaex.ex04;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) {
		//사각형 삼각형 원 가각 리스트로 관리 아니고
		
		//모든 도형을 1개의 리스트로 관리하고 싶다
		ArrayList<Shape> sList = new ArrayList<Shape>();
		
		
		//삼각형
		Shape t01 = new Triangle(3, 3, "빨강", "빨강");
		Shape t02 = new Triangle(3, 3, "노랑", "노랑");
		
		//사각형
		Shape r01 = new Rectangle(10,10,"주황","주황");
		
		//원
		Shape c01 = new Circle(100,"파랑", "파랑");
		
		
		/////////////////////////////////////////////
		
		
		//섞어쓰기
		Shape t00 = new Triangle(100,100, "초록", "초록");
		Shape s00 = new Circle(100, "초록", "초록");
		/////////////////////////////////////////////////
		
		sList.add(t01);
		sList.add(t02);
		sList.add(r01);
		sList.add(c01);
		
		//전체
		for(int i=0; i<sList.size(); i++) {
			sList.get(i).draw();
		}
		
		System.out.println(((Triangle)sList.get(0)).getWidth());
		System.out.println(((Circle)sList.get(3)).getRadius());
	
		
		//shape
		/*
		Shape s01 = new Shape("빨강", "빨강"); //추상클래스
		s01.draw();
		*/
		
		//면적구하기
		System.out.println("면적----------------------");
		for(int i=0; i<sList.size(); i++) {
			System.out.println(sList.get(i).area()); 
		}
		
		
		
		
	}

}
