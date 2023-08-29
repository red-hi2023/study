package com.javaex.ex03;

import java.util.ArrayList;


public class MainApp {

	public static void main(String[] args) {

		Triangle t01 = new Triangle();
		t01.setWidth(5);
		t01.setHeight(5);
		t01.setFillColor("빨강");
		t01.setLineColor("빨강");
		
		//t01.fillColor = "빨강"; //protected 참고
		
		t01.draw();
		
		/////////////////////////////////////
		
		Triangle t02 = new Triangle(5, 10, "빨강", "빨강");
		t02.draw();
		
		//
		Shape s01 = new Shape();	
		s01.setFillColor("노랑");
		s01.setLineColor("파랑");
		
		//s01.draw();
		
		
		////////////////////////////////////////////////
		//리스트로 관리
		ArrayList<Triangle> tList = new ArrayList<Triangle>();
		tList.add(t01);
		tList.add(t02);
		
		for(int i=0; i<tList.size(); i++) {
			tList.get(i).draw();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
